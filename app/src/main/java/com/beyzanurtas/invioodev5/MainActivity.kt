package com.beyzanurtas.invioodev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.beyzanurtas.invioodev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var sayi = 0
    var toplam = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.buttonSifir.setOnClickListener {
            sayi = sayi*10
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonBir.setOnClickListener {
            sayi = sayi*10 + 1
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonIki.setOnClickListener {
            sayi = sayi*10 + 2
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonUc.setOnClickListener {
            sayi = sayi*10 + 3
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonDort.setOnClickListener {
            sayi = sayi*10 + 4
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonBes.setOnClickListener {
            sayi = sayi*10 + 5
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonAlti.setOnClickListener {
            sayi = sayi*10 + 6
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonYedi.setOnClickListener {
            sayi = sayi*10 + 7
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonSekiz.setOnClickListener {
            sayi = sayi*10 + 8
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonDokuz.setOnClickListener {
            sayi = sayi*10 + 9
            binding.sonuc.text=sayi.toString()
        }
        binding.buttonArti.setOnClickListener {
            toplam= toplam + sayi
            binding.sonuc.text=toplam.toString()
            sayi=0
        }
        binding.buttonEsittir.setOnClickListener {
            toplam=toplam+sayi
            binding.sonuc.text=toplam.toString()
            toplam=0
        }
        binding.buttonSil.setOnClickListener {
            toplam=0
            sayi=0
            binding.sonuc.text=toplam.toString()
        }
    }
}