package com.example.chapter3top1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    lateinit var etInputSatu: EditText
    lateinit var etInputDua: EditText
    lateinit var btnHitung: Button
    lateinit var tvHasilHitung: TextView
    lateinit var btnReset: Button
    lateinit var tvWarning: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        etInputSatu = findViewById(R.id.et_angka_satu)
        etInputDua = findViewById(R.id.et_angka_dua)
        btnHitung = findViewById(R.id.btn_hitung)
        tvHasilHitung = findViewById(R.id.tv_hasil_hitung)
        btnReset = findViewById(R.id.btn_reset_data)
        tvWarning = findViewById(R.id.tv_warning)


        btnHitung.setOnClickListener {
            var inputSatu = etInputSatu.text.toString().trim()
            var inputDua = etInputDua.text.toString().trim()

            var jumlah = inputSatu + inputDua

            if (jumlah > 100.toString()){
                tvWarning.text = "Tidak boleh lebih dari 100"
            }else{
                tvHasilHitung.text = jumlah
            }

        }

        btnReset.setOnClickListener {
            resetData()
        }

    }

    fun resetData(){
        etInputSatu.setText("")
        etInputDua.setText("")
    }
}