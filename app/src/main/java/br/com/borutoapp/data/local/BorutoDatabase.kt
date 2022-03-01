package br.com.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.borutoapp.data.local.dao.HeroDao
import br.com.borutoapp.data.local.dao.HeroRemoteKeyDao
import br.com.borutoapp.domain.model.Hero
import br.com.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKey(): HeroRemoteKeyDao
}