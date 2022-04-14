package io.github.shinhyo.lib

import android.content.Context
import android.widget.Toast

object Test {

    fun msg(context: Context) {
        Toast.makeText(context, "hi", Toast.LENGTH_SHORT).show()
    }

}