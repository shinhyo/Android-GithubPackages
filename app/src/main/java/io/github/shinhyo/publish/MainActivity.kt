package io.github.shinhyo.publish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.shinhyo.lib.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Test.msg(this)
    }
}