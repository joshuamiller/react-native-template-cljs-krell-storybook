# A React Native Template for ClojureScript, Krell, and Storybook

## Getting Started

```bash
npx react-native init YourProjectName --template react-native-template-cljs-krell-storybook
```

## Usage

```bash
yarn cljs:build

yarn start
```

### Cocoapods Issues

Occasionally the Cocoapods installation (a Ruby-based system for providing
native dependencies on iOS) fails, with an error like:

```
error Error: Failed to install CocoaPods dependencies for iOS project, which is required by this template.
Please try again manually: "cd ./Sportscaster/ios && pod install".
```

This can be fixed by manually running

```bash
bundle

npx pod-install
```

### Apple Silicon Note

If you run into compatibility trouble on Apple Silicon, dependencies can be installed by running `arch -x86_64 pod install` inside `/ios` folder.

## Workflow

JavaScript components and Storybook tests are in `js/`, named `Component.js` and
`Component.stories.js` respectively. Run `yarn storybook` for an interactive
environment showing the look and feel of your components; they will live-reload
when edited.

You can require your JS components in your ClojureScript views with
```clojure
(def component-name
  (r/adapt-react-class
    (.-default (js/require "../js/ComponentName.js"))))
```

Note the path is just `../`, regardless of where in your ClojureScript directory
hierarchy you are working from.

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

## Contributing

Bug reports, pull requests, and additions to [the wiki](https://github.com/joshuamiller/react-native-template-cljs-krell-storybook/wiki)
are all extremely welcome. The biggest hurdle to getting started with
ClojureScript on React Native is "it works on my machine." Eliminating these
issues and documenting the solutions will help everyone get on with
writing useful code.

## References

* [ClojureScript in the Age of Typescript -- David Nolen](https://www.youtube.com/watch?v=3HxVMGaiZbc&t=5s)
* [CLJSRN.org](https://cljsrn.org)
* [Krell](https://github.com/vouch-opensource/krell)
* [Storybook](https://storybook.js.org)
