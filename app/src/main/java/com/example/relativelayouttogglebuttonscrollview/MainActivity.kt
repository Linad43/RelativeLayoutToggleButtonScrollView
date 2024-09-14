package com.example.relativelayouttogglebuttonscrollview

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.BufferedReader
import java.io.File

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private var text = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textView = findViewById(R.id.text)
        button = findViewById(R.id.button)
        //data.listTextInit()
        textInit()

    }

    fun buttonClick(view: View) {
        //data.listTextInit()
        textView.text = text
    }

    private fun textInit()
    {
        text = "Мартышка к старости слаба глазами стала;\n" +
                "А у людей она слыхала,\n" +
                "Что это зло еще не так большой руки:\n" +
                "Лишь стоит завести Очки.\n" +
                "Очков с полдюжины себе она достала;\n" +
                "Вертит Очками так и сяк:\n" +
                "То к темю их прижмет, то их на хвост нанижет,\n" +
                "То их понюхает, то их полижет;\n" +
                "Очки не действуют никак.\n" +
                "«Тьфу пропасть! — говорит она, — и тот дурак,\n" +
                "Кто слушает людских всех врак:\n" +
                "Всё про Очки лишь мне налгали;\n" +
                "А проку на-волос нет в них».\n" +
                "Мартышка тут с досады и с печали\n" +
                "О камень так хватила их,\n" +
                "Что только брызги засверкали.\n" +
                "\n" +
                "К несчастью, то ж бывает у людей:\n" +
                "Как ни полезна вещь, — цены не зная ей,\n" +
                "Невежда про нее свой толк все к худу клонит;\n" +
                "А ежели невежда познатней,\n" +
                "Так он ее еще и гонит."
    }
}
/*private fun textInit() {
    val bufferedReader: BufferedReader = File("Мартышка и очки.txt").bufferedReader()
    text = bufferedReader.use { it.readText() }
}*/
/*
    fun listTextInit() {
        textInit()
        val buf = text.lines()
        for (line in buf) {
            listText.add(line)
        }*/




