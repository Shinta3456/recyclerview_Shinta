package com.example.recyclerview_shintanuriyah_31

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Superhero_Adapter(private val context: Context, private val superhero: List<Superhero>, val listener: (Superhero) -> Unit)
    : RecyclerView.Adapter<Superhero_Adapter.AnggotaViewHolder>(){
    class AnggotaViewHolder(view: View): RecyclerView.ViewHolder (view) {

        val imgAnggota = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaAnggota = view.findViewById<TextView>(R.id.tv_item_name)
        val descAnggota = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: Superhero, listener: (Superhero) -> Unit){
            imgAnggota.setImageResource(superhero.imgAnggota)
            namaAnggota.text = superhero.namaAnggota
            descAnggota.text = superhero.descAnggota
            itemView.setOnClickListener{
                listener(superhero)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnggotaViewHolder {
        return AnggotaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.superhero_kelompok, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnggotaViewHolder, position: Int) {
        holder.bindView(superhero[position], listener)
    }

    override fun getItemCount(): Int = superhero.size
    }
