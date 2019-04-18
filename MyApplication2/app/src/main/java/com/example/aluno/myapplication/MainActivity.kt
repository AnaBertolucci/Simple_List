package com.example.aluno.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val arrayLinhaListView = ArrayList<String>()
        arrayLinhaListView.add("1º Linha")
        arrayLinhaListView.add("2º Linha")
        arrayLinhaListView.add("3º Linha")
        arrayLinhaListView.add("4º Linha")
        arrayLinhaListView.add("5º Linha")


        val lv: ListView = findViewById(R.id.minhaprimeiralistView)
        lv.adapter = ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                arrayLinhaListView)

    }
}
