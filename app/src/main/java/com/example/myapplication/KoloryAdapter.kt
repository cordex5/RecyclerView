package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class KoloryAdapter(
    var listaKolorow: ArrayList<String>,
    var listaOpisow: ArrayList<String>,
    var listaObrazow: ArrayList<Int>,
    var context : Context):RecyclerView.Adapter<KoloryAdapter.KoloryHolder>()
{
    class KoloryHolder(itemView: View):RecyclerView.ViewHolder(itemView)
        {
            var textViewListaKolorow : TextView = itemView.findViewById(R.id.tvNAZWA)
            var textViewListaOpisow : TextView = itemView.findViewById(R.id.tvOpis)
            var imageView : CircleImageView = itemView.findViewById(R.id.ivRys)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KoloryHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.colors_design,parent,false)
        return KoloryHolder(view)
    }

    override fun getItemCount(): Int {

        return listaKolorow.size
    }

    override fun onBindViewHolder(holder: KoloryHolder, position: Int) {
        holder.textViewListaKolorow.text=listaKolorow.get(position)
        holder.textViewListaOpisow.text = listaOpisow.get(position)
        holder.imageView.setImageResource(listaObrazow.get(position))
    }
}
