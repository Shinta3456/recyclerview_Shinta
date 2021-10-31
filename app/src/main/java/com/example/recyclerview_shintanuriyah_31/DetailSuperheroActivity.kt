package com.example.recyclerview_shintanuriyah_31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class DetailSuperheroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anggota = intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABLE)

        val imgAnggota = findViewById<ImageView>(R.id.img_item_photo)
        val namaAnggota = findViewById<TextView>(R.id.tv_item_name)
        val detail = findViewById<TextView>(R.id.detailanggota)
        val id = findViewById<EditText>(R.id.inputnama)
        val btn = findViewById<Button>(R.id.buttontampil)

        imgAnggota.setImageResource(anggota?.imgAnggota!!)
        namaAnggota.text = anggota.namaAnggota

        btn.setOnClickListener{
            val input = id.text.toString()
            var hasil = when(input) {
                in "" -> Toast.makeText(applicationContext, "Kata kunci harus di isi", Toast.LENGTH_SHORT).show()
                in "Jono" -> "Bang Jono tak pulang-pulang"
                in "Saparman" -> "Adeknya Superman"
                in "Lucinta" -> "Mingdep tobat ga seee?"
                in "Popo" -> "Kapan tobat?"
                in "Ragil" -> "Hidup bahagia di Jerman"
                else -> Toast.makeText(applicationContext, "Maaf nama anda salah", Toast.LENGTH_SHORT).show()
            }
            detail.text = "$hasil"
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}