package com.example.user.hellotoast

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast

/**
 * Displays two buttons and a text view.
 * - Pressing the TOAST button shows a toast.
 * - Pressing the COUNT button increases the displayed mCount.
 *
 * Note: Fixing behavior when device is rotated is a challenge exercise for the student.
 */

class MainActivity : AppCompatActivity() {

    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count) as TextView
    }

    /*
    * Increments the number in the text view when the COUNT button is clicked.
    *
    * @param view The view that triggered this onClick handler.
    *             Since the count always appears in the text view, the passed in view is not used.
    * */
    fun countUp(view: View) {
        mCount++
        if (mShowCount != null)
            mShowCount!!.text = Integer.toString(mCount)
    }

    /*
    * Shows a toast when the TOAST button is clicked.
    *
    * @param view The view that triggered this onClick handler.
    *             Since a toast always shows on the top, the passed in view is not used.
    * */
    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_button_toast, Toast.LENGTH_LONG)
        toast.show()
    }
}