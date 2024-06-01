package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var listaKolorow = ArrayList<String>()
    var listaOpisow = ArrayList<String>()
    var listaObrazow = ArrayList<Int>()

    lateinit var adapter: KoloryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        super.onCreate(savedInstanceState)

        binding.RecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        listaKolorow.add(0, "Niebieski")
        listaKolorow.add(1, "Różowy")
        listaKolorow.add(2, "Zielony")
        listaKolorow.add(3, "Pomarańczowy")
        listaKolorow.add(4, "Fioletowy")
        listaKolorow.add(5, "Czerwony")
        listaKolorow.add(6, "Biały")
        listaKolorow.add(7, "Czarny")
        listaKolorow.add(8, "Żółty")

        listaOpisow.add(0, "Chłodna barwa sprzyjająca koncentracji.")
        listaOpisow.add(1, "Delikatny kolor symbolizujący kobiecość.")
        listaOpisow.add(2, "Kolor natury, symbolizujący życie.")
        listaOpisow.add(3, "Energetyczny kolor.")
        listaOpisow.add(4, "Barwa kreatywnościn i intuicji.")
        listaOpisow.add(5, "Barwa odwagi, siły i determinacji.")
        listaOpisow.add(6, "Kolor czystości i niewinności.")
        listaOpisow.add(7, "Kolor elegancji i tajemnicy.")
        listaOpisow.add(8, "Symbol szczęścia.")

        listaObrazow.add(R.drawable.blue)
        listaObrazow.add(R.drawable.pink)
        listaObrazow.add(R.drawable.green)
        listaObrazow.add(R.drawable.orange)
        listaObrazow.add(R.drawable.purple)
        listaObrazow.add(R.drawable.red)
        listaObrazow.add(R.drawable.white)
        listaObrazow.add(R.drawable.black)
        listaObrazow.add(R.drawable.yellow)

        adapter = KoloryAdapter(listaKolorow, listaOpisow, listaObrazow, this@MainActivity)

        binding.RecyclerView.adapter = adapter
    }
}