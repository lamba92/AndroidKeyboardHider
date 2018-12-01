@file:JvmName("KeyboardHider")

package it.lamba.android.utils

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * Hides the soft keyboard from the screen from the given [context] and given focused [focusView]. If [focusView] is `null`
 * a focusView will be searched in the current context. If unable to recover the focused focusView nothing will be done.
 * This method has been created from [this answer](https://stackoverflow.com/questions/1109022/close-hide-the-android-soft-keyboard/17789187#17789187)
 * by [rmirabelle](https://stackoverflow.com/users/680583/rmirabelle)
 * @param context The [Context] from which hide the keyboard.
 * @param focusView The focusView that currently has the focus. Default value of [focusView] is `null`.
 */
@Suppress("LocalVariableName")
@JvmOverloads
fun hideKeyboardFrom(context: Context, focusView: View? = null) {
    val imm = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    val focusView_ =
        if (focusView == null && context is Activity)
            context.currentFocus ?: View(context) ?: View(context)
        else focusView
    val windowToken = focusView_?.windowToken ?: if (context is Fragment) context.view?.rootView?.windowToken else null
    if (windowToken != null) {
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
    focusView_?.clearFocus()
}

/**
 * Hides the soft keyboard from the screen from the given this [Context] and given focused [focusView]. If [focusView] is `null`
 * a view will be searched in the current context. If unable to recover the focused view nothing will be done.
 * @param focusView The view that currently has the focus. Default value of [focusView] is `null`.
 */
fun Context.hideKeyboard(focusView: View? = null) = hideKeyboardFrom(this, focusView)