package com.example.chapter3top1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BmiActivity : AppCompatActivity() {

    lateinit var etInputUmur: EditText
    lateinit var etInputTinggiBadan: EditText
    lateinit var etInputBeratBadan: EditText

    lateinit var btnHItung: Button
    lateinit var btnReset: Button

    lateinit var tvHasilUmur: TextView
    lateinit var tvHasilTinggiBadan: TextView
    lateinit var tvHasilBeratBadan: TextView
    lateinit var tvHasilBmi: TextView
    lateinit var tvKategori: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        etInputUmur = findViewById(R.id.et_input_umur_bmi)
        etInputTinggiBadan = findViewById(R.id.et_input_tinggi_badan_bmi)
        etInputBeratBadan = findViewById(R.id.et_input_berat_badan_bmi)

        btnHItung = findViewById(R.id.btn_hitung_bmi)
        btnReset = findViewById(R.id.btn_reset_bmi)

        tvHasilUmur = findViewById(R.id.tv_hasil_umur_bmi)
        tvHasilTinggiBadan = findViewById(R.id.tv_hasil_tinggi_badan_bmi)
        tvHasilBeratBadan = findViewById(R.id.tv_hasil_berat_badan_bmi)
        tvHasilBmi = findViewById(R.id.tv_hasil_bmi)
        tvKategori = findViewById(R.id.tv_hasil_kategori_bmi)

        btnHItung.setOnClickListener {
            resultBmi()
        }


        btnReset.setOnClickListener {
            resetBmi()
        }
    }

    fun hitungBmi(){
        val inputTinggiBadan = etInputTinggiBadan.toString().trim()
        val inputBeratBadan = etInputBeratBadan.toString().trim()

        val tinggiBadanToM = inputTinggiBadan.toDouble() / 100

        val jumlahBmi = inputBeratBadan.toDouble() / (tinggiBadanToM * tinggiBadanToM)

        tvHasilBmi.text = jumlahBmi.toString()

        if (jumlahBmi < 16){
            tvKategori.text = "Terlalu Kurus"
        }else if (jumlahBmi in 16.0..17.0){
            tvKategori.text = "Cukup Kurus"
        }else if (jumlahBmi in 17.1..18.5){
            tvKategori.text = "Sedikit Kurus"
        }else if (jumlahBmi in 18.6..25.0){
            tvKategori.text = "Normal"
        }else if (jumlahBmi in 25.1..30.0){
            tvKategori.text = "Gemuk"
        }else if (jumlahBmi in 30.1..35.0){
            tvKategori.text = "Obesitas Kelas 1"
        }else if (jumlahBmi in 35.1..40.0){
            tvKategori.text = "Obesitas Kelas 2"
        }else{
            tvKategori.text = "Obesitas Kelas 3"
        }
    }

    fun resultBmi(){

        tvHasilUmur.text = etInputUmur.toString()
        tvHasilTinggiBadan.text = etInputTinggiBadan.toString()
        tvHasilBeratBadan.text = etInputBeratBadan.toString()

        hitungBmi()

    }

    fun resetBmi(){
        etInputUmur.setText("")
        etInputTinggiBadan.setText("")
        etInputBeratBadan.setText("")

        tvHasilUmur.setText("0 tahun")
        tvHasilTinggiBadan.setText("0 cm")
        tvHasilBeratBadan.setText("0 Kg")
        tvHasilBmi.setText("0")
        tvKategori.setText("nothing")
    }
}
