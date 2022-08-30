package com.example.chapter3top1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NilaiMhsActivity : AppCompatActivity() {

    lateinit var etInputNama : EditText
    lateinit var etInputNim: EditText
    lateinit var etInputUAS : EditText
    lateinit var etInputUTS : EditText
    lateinit var etInputTugas : EditText

    lateinit var btnHItung: Button
    lateinit var btnReset: Button

    lateinit var tvHasilNama: TextView
    lateinit var tvHasilNIM: TextView
    lateinit var tvHasilUAS: TextView
    lateinit var tvHasilUTS: TextView
    lateinit var tvHasilTugas: TextView
    lateinit var tvHasilTotal: TextView
    lateinit var tvHasilRt: TextView
    lateinit var tvHasilGrade: TextView
    lateinit var tvHasilStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilai_mhs)

        etInputNama = findViewById(R.id.et_input_nama_mhs)
        etInputNim = findViewById(R.id.et_input_nim_mhs)
        etInputUAS = findViewById(R.id.et_nilai_uas_mhs)
        etInputUTS = findViewById(R.id.et_nilai_uts_mhs)
        etInputTugas = findViewById(R.id.et_nilai_tugas_mhs)

        btnHItung= findViewById(R.id.btn_hitung)
        btnReset= findViewById(R.id.btn_reset_nilai_akhir_mhs)

        tvHasilNama= findViewById(R.id.tv_hasil_nama_mhs)
        tvHasilNIM= findViewById(R.id.tv_hasil_nim_mhs)
        tvHasilUAS= findViewById(R.id.tv_hasil_uas_mhs)
        tvHasilUTS= findViewById(R.id.tv_hasil_uts_mhs)
        tvHasilTugas= findViewById(R.id.tv_hasil_tugas_mhs)
        tvHasilTotal= findViewById(R.id.tv_hasil_total_mhs)
        tvHasilRt= findViewById(R.id.tv_hasil_rt_nilai_mhs)
        tvHasilGrade= findViewById(R.id.tv_hasil_grade_mhs)
        tvHasilStatus= findViewById(R.id.tv_hasil_status_mhs)

        btnHItung.setOnClickListener {
            resultMhs()
        }


        btnReset.setOnClickListener {
            resetMhs()
        }

    }

    fun hitungMhs(){
        val inputNilaiUas = etInputUAS.toString().trim()
        val inputNilaiUts = etInputUTS.toString().trim()
        val inputNilaiTugas = etInputTugas.toString().trim()

        val totalNilai = inputNilaiUas.toDouble() + inputNilaiUts.toDouble() + inputNilaiTugas.toDouble()

        val rataRataNilai = totalNilai / 3

        if (rataRataNilai > 60.9){
            tvHasilGrade.text = "E"
            tvHasilStatus.text = "Tidak Lulus"
        }else if (rataRataNilai in 61.0..70.9){
            tvHasilGrade.text = "D"
            tvHasilStatus.text = "Tidak Lulus"
        }else if (rataRataNilai in 71.0..80.9){
            tvHasilGrade.text = "C"
            tvHasilStatus.text = "Lulus"
        }else if (rataRataNilai in 81.0..90.9){
            tvHasilGrade.text = "B"
            tvHasilStatus.text = "Lulus"
        }else{
            tvHasilGrade.text = "A"
            tvHasilStatus.text = "Lulus"
        }

        tvHasilTotal.text = totalNilai.toString()
        tvHasilRt.text = rataRataNilai.toString()

    }

    fun resultMhs(){

        tvHasilNama.text = etInputNama.toString()
        tvHasilNIM.text = etInputNim.toString()
        tvHasilUAS.text = etInputUAS.toString()
        tvHasilUTS.text = etInputUTS.toString()
        tvHasilTugas.text = etInputTugas.toString()

        hitungMhs()
    }

    fun resetMhs(){

    }
}