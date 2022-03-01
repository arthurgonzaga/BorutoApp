package br.com.borutoapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import br.com.borutoapp.domain.model.Hero
import br.com.borutoapp.domain.model.HeroRemoteKey

@Dao
interface HeroRemoteKeyDao {

    @Query("SELECT * FROM hero_remote_key_table WHERE id = :id")
    fun getRemoteKey(id: Int): Hero

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRemoteKeys(heroes: List<HeroRemoteKey>)

    @Query("DELETE FROM hero_remote_key_table")
    suspend fun deleteAllRemoteKeys()
}