package com.poli.tulioassis.cuidardela.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "patient_table")
data class Patient(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "patient_name") val patientName: String?,
    @ColumnInfo(name = "paient_birthdate") val birthdate: String?
)
