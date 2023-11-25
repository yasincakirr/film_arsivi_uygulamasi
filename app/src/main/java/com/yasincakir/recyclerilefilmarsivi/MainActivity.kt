package com.yasincakir.recyclerilefilmarsivi

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //scarface
        //godfather
        //prestij
        //fightclub
        //matrix

        var isimler= arrayListOf<String>()
        isimler.add("Scarface")
        isimler.add("Godfather")
        isimler.add("Prestij")
        isimler.add("Fight Club")
        isimler.add("Matrix")



        var aciklamalar = arrayListOf<String>()

        aciklamalar.add("1980'li yıllarda Miami'de, Kübalı bir mülteci olan Tony Montana'nın (Al Pacino), suç dünyasında yükselişini ve açgözlülüğünü konu almaktadır.")
        aciklamalar.add("Baba, 40'lar ve 50'lerin Amerika'sında, bir İtalyan mafya ailesinin destansı öyküsünü konu alıyor. Don Corleonenin gücünü gösteriyor.")
        aciklamalar.add("Önceleri birlikte çalışan iki sihirbazın daha sonra rekabete ve hatta düşmanlığa dönüşen öyküsünün anlatıldığı efsane bir film.")
        aciklamalar.add("Tyler'ın liderliğinde bir dövüş kulübünün kuruluşuyla bu kulübde sayıları elliyi aşmamak kaydıyla genç erkekler birbirleriyle dövüşmeye başlayacaklardır.")
        aciklamalar.add("Karakterimiz Neo, matrix filmi içinde gerçek dünyada kalan son insan şehri Zion'u makinelerin saldırısından korumaya çalışıyor. Bu sırada, Matrix'i korumaya çalışan bilinçli bilgisayar programları olan ajanlar ile mücadele etmesi gerekiyor. ")


        var scarfaceBitmap=R.drawable.scarface
        var godfatherBitmap=R.drawable.godfather
        var prestijBitmap=R.drawable.prestij
        var fightclubBitmap=R.drawable.fightclub
        var matrixBitmap=R.drawable.matr

        var resimler= arrayListOf<Int>()


        resimler.add(scarfaceBitmap)
        resimler.add(godfatherBitmap)
        resimler.add(prestijBitmap)
        resimler.add(fightclubBitmap)
        resimler.add(matrixBitmap)


        var ImdbPuan= arrayListOf<String>()
        ImdbPuan.add("Imdb : 8,3")
        ImdbPuan.add("Imdb : 9,2")
        ImdbPuan.add("Imdb : 8,5")
        ImdbPuan.add("Imdb : 8,8")
        ImdbPuan.add("Imdb : 8,7")



        //Sinif olusturma

        var degerler=RecyclerAdapter(isimler,aciklamalar,resimler,ImdbPuan)

        //Adapter

        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        recyclerView.adapter=degerler



        for (deger in ImdbPuan){
            println(deger)
        }


    }



    fun cikis(view : View){

        var uyarimesaj=AlertDialog.Builder(this)

        uyarimesaj.setTitle("Çıkış Ekranı")
        uyarimesaj.setMessage("Uygulamadan Çıkış Yapılsınmı ?")

        uyarimesaj.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->

            finish()
        })
        uyarimesaj.setNegativeButton("Hayır",DialogInterface.OnClickListener { dialog, which ->

            Toast.makeText(this,"Cikis Iptal Edildi..",Toast.LENGTH_LONG).show()

        })
        uyarimesaj.show()

    }


}