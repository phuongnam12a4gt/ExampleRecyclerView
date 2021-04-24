package com.example.examplerecyclerview

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.item_football.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var bundle = intent.getBundleExtra("key2")
        bundle?.let {
            var a=it.getSerializable("key1") as Club
            textViewNameClub2.text=a.nameClub
        }
    }
}