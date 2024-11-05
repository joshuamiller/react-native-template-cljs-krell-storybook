(ns post-install
  (:require ["dashify$default" :as dashify]
            ["fs" :refer [readFileSync writeFileSync mkdirSync rmSync]]
            [cljs.pprint :refer [pprint]]
            [clojure.string :as str]))

(println "Running post_install.cljs")

(defn file->str
  [filename]
  (str (readFileSync filename)))

(def project-name
  (->> (file->str "app.json")
       (.parse js/JSON)
       (.-name)
       dashify))

(def build-edn
  (let [new-edn (-> (file->str "build.edn")
                    read-string
                    (assoc :main (symbol (str project-name ".core"))))]
    (-> (with-out-str (pprint new-edn))
        (str/replace "," "\n"))))

(writeFileSync "build.edn" build-edn)

(def core-cljs
  (-> (file->str "src/project_name/core.cljs")
      (str/replace "project-name" project-name)))

(def folder-name
  (str "src/" (str/replace project-name "-" "_")))

(mkdirSync folder-name)

(writeFileSync
 (str folder-name "/core.cljs")
 core-cljs)

(rmSync "src/project_name" #js {:recursive true})

(def package-json
  (-> (readFileSync "package.json")
      str
      js/JSON.parse
      js->clj
      (update "scripts" dissoc "postinstall")
      clj->js))

(writeFileSync "package.json" (js/JSON.stringify package-json nil 2))
