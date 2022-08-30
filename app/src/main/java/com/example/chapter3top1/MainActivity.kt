package com.example.chapter3top1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnKlikSayaTiga: Button
    lateinit var tvKlikSayaDua: TextView

    lateinit var btnSimpan: Button
    lateinit var etInputNama: EditText
    lateinit var tvNama: TextView

    lateinit var btnIntent: Button

    lateinit var btnIntentBmi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // instance id dalam layout xml
//        val btnKlikSaya = findViewById<Button>(R.id.btn_klik_saya)
//        val btnKlikSayaDua = findViewById<Button>(R.id.btn_klik_saya_2)
//        val tvKlikSaya = findViewById<TextView>(R.id.tv_hasil_saya)
        btnIntentBmi = findViewById(R.id.btn_intent_to_hitung_bmi)

//        btnKlikSayaTiga = findViewById(R.id.btn_klik_saya_3)

//        // action to
//        btnKlikSaya.setOnClickListener{
//            tvKlikSaya.text = "Terima kasih sudah klik button saya !"
//        }
//
//        btnKlikSayaDua.setOnClickListener {
//            tvKlikSaya.text = "Terima kasih sudah klik button saya dua!"
//        }

        btnIntentBmi.setOnClickListener {
            startActivity(Intent(this, BmiActivity::class.java))
        }

        // memanggil function
//        setOnClick()

        // memanggil Function
//        saveNama()

        // memanggil function
//        intentKeHome()

    }

//    fun setOnClick(){
//        tvKlikSayaDua = findViewById(R.id.tv_hasil_saya_dua)
//        btnKlikSayaTiga.setOnClickListener {
//            tvKlikSayaDua.text = "Terima kasih sudah klik button saya tiga!"
//        }
//
//    }
//
//    fun saveNama(){
//        btnSimpan = findViewById(R.id.btn_simpan)
//        etInputNama = findViewById(R.id.et_input_nama)
//        tvNama = findViewById(R.id.tv_nama)
//
//        btnSimpan.setOnClickListener {
//            var nama = etInputNama.text.toString()
//            tvNama.text = nama
//        }
//    }
//
//    fun intentKeHome(){
//        btnIntent = findViewById(R.id.btn_intent)
//
//        btnIntent.setOnClickListener {
//            startActivity(Intent(this, HomeActivity::class.java))
//        }
//    }
}