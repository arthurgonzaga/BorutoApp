package br.com.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.borutoapp.data.local.dao.HeroDao
import br.com.borutoapp.domain.model.Hero

@Database(entities = [Hero::class], version = 1)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
}