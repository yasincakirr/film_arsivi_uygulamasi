package com.yasincakir.recyclerilefilmarsivi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.reycler.view.*

class RecyclerAdapter(val isimler:ArrayList<String>,val aciklamalar :ArrayList<String>,val resimler: ArrayList<Int>,val imdbpuan: ArrayList<String>) :RecyclerView.Adapter<RecyclerAdapter.filmprojesiVH>() {

  class filmprojesiVH(itemView : View) : RecyclerView.ViewHolder(itemView){

  }

 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): filmprojesiVH {

  val itemView=LayoutInflater.from(parent.context).inflate(R.layout.reycler,parent,false)

  return filmprojesiVH(itemView)
 }

 override fun onBindViewHolder(holder: filmprojesiVH, position: Int) {

  holder.itemView.recyclerViewText.text=isimler.get(position)

  holder.itemView.setOnClickListener {
   var intent=Intent(holder.itemView.context,TanitimActivity::class.java)

   intent.putExtra("filIsim",isimler.get(position))
   intent.putExtra("filmAciklama",aciklamalar.get(position))
   intent.putExtra("gorsel",resimler.get(position))
   intent.putExtra("imdb",imdbpuan.get(position))


   holder.itemView.context.startActivity(intent)

  }

 }

 override fun getItemCount(): Int {

  return isimler.size

 }


}