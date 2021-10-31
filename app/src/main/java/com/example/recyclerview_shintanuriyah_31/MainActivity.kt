package com.example.recyclerview_shintanuriyah_31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anggotaList = listOf<Superhero>(
            Superhero(
                R.drawable.aaa,
                "Bang Jono",
                "Anggota ke 1"
            ),
            Superhero(
                R.drawable.bbb,
                "Saparman",
                "Anggota ke 2"
            ),
            Superhero(
                R.drawable.ccc,
                "Lucinta Luna",
                "Anggota ke 3"
            ),
            Superhero(
                R.drawable.ddd,
                "Popo Barbie",
                "Anggota ke 4"
            ),
            Superhero(
                R.drawable.ragil,
                "Bunda Ragil",
                "Anggota ke 5"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_anggota)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Superhero_Adapter(this, anggotaList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}