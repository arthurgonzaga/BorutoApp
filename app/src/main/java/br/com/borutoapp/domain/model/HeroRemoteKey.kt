package br.com.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.borutoapp.util.Constants.HERO_REMOTE_KEY_TABLE

@Entity(tableName = HERO_REMOTE_KEY_TABLE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val previousPage: Int,
    val nextPage: Int,
)