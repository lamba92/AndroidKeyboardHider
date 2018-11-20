# Android Keyboard Hider [![Build Status](https://travis-ci.org/lamba92/AndroidKeyboardHider.svg?branch=master)](https://travis-ci.org/lamba92/AndroidKeyboardHider) [![](https://jitpack.io/v/lamba92/AndroidKeyboardHider.svg)](https://jitpack.io/#lamba92/AndroidKeyboardHider)

Commodity library to hide the keyboard in Android.

Written in Kotlin with ❤️

Created from [this answer](https://stackoverflow.com/questions/1109022/close-hide-the-android-soft-keyboard/17789187#17789187) by [rmirabelle](https://stackoverflow.com/users/680583/rmirabelle)

## Usage

```
public class MyActivity extends Activity {
    
    @Override
    public void onPause() {
        View focusedView = // something
        hideKeyboardFrom(this, focusedView)
    }
    
}

```

If focusView is `null` a view will be searched in the current context. If unable to recover the focused view nothing will be done.
When using Kotlin the extension `fun Context.hideKeyboard(focusView: View)` is provided!

```
class MyActivity : Activity() {

    override fun onPause() {
        hideKeyboard()
        super.onPause()
    }
    
}
```

## Installing [![](https://jitpack.io/v/lamba92/AndroidKeyboardHider.svg)](https://jitpack.io/#lamba92/AndroidKeyboardHider)

Add the [JitPack.io](http://jitpack.io) repository to the project `build.grade`:
```
repositories {
    maven { url 'https://jitpack.io' }
}
```

Then import the latest version in the `build.gradle` of the modules you need:

```
dependencies {
    implementation 'com.github.lamba92:AndroidKeyboardHider:{latest_version}'
}
```

If using Gradle Kotlin DSL:
```
repositories {
    maven(url = "https://jitpack.io")
}
...
dependencies {
    implementation("com.github.lamba92", "AndroidKeyboardHider", "{latest_version}")
}
```
