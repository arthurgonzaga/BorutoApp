package br.com.borutoapp.data.local

import androidx.room.TypeConverter

class DatabaseConverter {

    private val separator = ","

    @TypeConverter
    fun listToString(list: List<String>): String {
        val stringBuilder = StringBuilder()

        for (str in list) {
            stringBuilder.append(str).append(separator)
        }
        stringBuilder.setLength(stringBuilder.length - separator.length)
        return stringBuilder.toString()
    }

    @TypeConverter
    fun stringToList(string: String): List<String>{
        return string.split(separator)
    }
}