package com.poli.tulioassis.cuidardela.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PatientDao {

    @Query("SELECT * FROM patient_table")
    fun getPatients(): Flow<List<Patient>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(patient: Patient)

}