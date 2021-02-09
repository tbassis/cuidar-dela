package com.poli.tulioassis.cuidardela.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "patient_table")
data class Patient(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "patient") val patientName: String,
    @ColumnInfo(name = "birthdate") val birthdate: String
)
