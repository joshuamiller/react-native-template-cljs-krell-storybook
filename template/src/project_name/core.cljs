(ns project-name.core
  (:require [reagent.core :as r]
            [react-native :as rn]))

(def component (r/adapt-react-class (.-default (js/require "../js/Component.js"))))

(def view (r/adapt-react-class rn/View))

(defn app-root
  []
  [view {:style {:flex 1 :align-items "center" :justify-content "center"}}
   [component]])

(defn ^:export -main
  []
  (r/as-element [app-root]))
