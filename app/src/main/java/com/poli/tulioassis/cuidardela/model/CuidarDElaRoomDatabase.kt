package com.poli.tulioassis.cuidardela.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Patient::class], version = 1, exportSchema = false)
public abstract class CuidarDElaRoomDatabase : RoomDatabase() {

    abstract fun patientDao(): PatientDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: CuidarDElaRoomDatabase? = null

        fun getDatabase(context: Context): CuidarDElaRoomDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CuidarDElaRoomDatabase::class.java,
                    "cuidar_dela_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}