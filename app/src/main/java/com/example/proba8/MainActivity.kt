package com.example.proba8

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<View>(R.id._bg__specific_image_)
        findViewById<View>(R.id.screen)
        findViewById<Button>(R.id.rectangle_2_1)
        findViewById<View>(R.id.see_more) as TextView
        findViewById<View>(R.id.nice_2) as ImageView
        findViewById<View>(R.id.c__1919___post_impressionism___idk_xd) as TextView
        findViewById<View>(R.id.the_three_pines) as TextView
        findViewById<View>(R.id.ellipse_3)
        findViewById<View>(R.id.line_2)
        findViewById<View>(R.id.line_3)


    }
}