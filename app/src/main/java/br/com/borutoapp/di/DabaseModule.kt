package br.com.borutoapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.borutoapp.data.local.BorutoDatabase
import br.com.borutoapp.util.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DabaseModule {

    @Provides
    @Singleton
    fun prodidesDatabase(
        @ApplicationContext context: Context,
    ): BorutoDatabase = Room
        .databaseBuilder(
            context,
            BorutoDatabase::class.java,
            BORUTO_DATABASE
        ).build()

}