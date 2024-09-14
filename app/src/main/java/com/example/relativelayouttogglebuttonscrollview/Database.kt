package com.example.relativelayouttogglebuttonscrollview

import java.io.BufferedReader
import java.io.File

class Database() {
    var text:String = ""
    var listText:MutableList<String> = mutableListOf<String>()

    private fun textInit(){
        val bufferedReader: BufferedReader = File("Мартышка и очки.txt").bufferedReader()
        text = bufferedReader.use { it.readText() }
    }
    fun listTextInit(){
        textInit()
        val buf = text.lines()
        for (line in buf){
            listText.add(line)
        }
    }
}