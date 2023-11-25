package com.yasincakir.recyclerilefilmarsivi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)


        var  intent=intent

        var filminismi= intent.getStringExtra("filIsim")
        textView2.text=filminismi

        var filminAciklamasi=intent.getStringExtra("filmAciklama")
        textView.text=filminAciklamasi

        var imdbPuan=intent.getStringExtra("imdb")
        textView3.text=imdbPuan

        var gorsel=intent.getIntExtra("gorsel",0)

        var gorselBitmap=BitmapFactory.decodeResource(applicationContext.resources,gorsel)
        imageView.setImageBitmap(gorselBitmap)

    }
}