# A React Native Template for ClojureScript, Krell, and Storybook

## Getting Started

```bash
npx react-native init YourProjectName --template https://github.com/joshuamiller/react-native-template-cljs-krell-storybook
```

## Usage

```bash
yarn cljs:build

yarn run ios # or android
```

## Rationale

Clojure, with its functional core and immutable data structures, is ideally
suited to managing state in user applications. ClojureScript extends this reach
anywhere JavaScript can go, and React Native puts a performant, well-supported,
JS environment on mobile and desktop devices with a deep ecosystem of usable
libraries.

When it comes to building ClojureScript apps on React Native, the majority of
the benefit comes from lifting state out of the land of JavaScript and into
a functional library like Reagent. Design of components can be left to
JavaScript, functioning essentially as markup, with tools like Storybook
providing quick feedback on layout. This template provides the dependencies
and plumbing to connect these three main tools.

## References

* [ClojureScript in the Age of Typescript -- David Nolen](https://www.youtube.com/watch?v=3HxVMGaiZbc&t=5s)
* [CLJSRN.org](https://cljsrn.org)
* [Krell](https://github.com/vouch-opensource/krell)
* [Storybook](https://storybook.js.org)
