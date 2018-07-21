Chrome Extension Using KotlinJs
================================

Open url in a new tab in background.

Build:

```
./gradlew kotlinJsBindler
```

Install:

Chrome -> `Extensions` -> Enable `Developer Mode` -> `Load unpacked` -> select the `extension` directory of this project.

Try click on the icon of the extension, you will see <http://github.com> is opened in a new tab in background.

Key Information
---------------

```
chrome.tabs.create({
  active: false
})
```