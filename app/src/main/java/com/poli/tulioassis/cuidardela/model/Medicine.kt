package com.poli.tulioassis.cuidardela.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "medicine_table")
data class Medicine(
    @PrimaryKey(autoGenerate = true)    val id: Int,
    @ColumnInfo(name = "med_name")       val medName: String,
    @ColumnInfo(name = "med_picture")    val medPicture: String?,
    @ColumnInfo(name = "add_date")       val addDate: Date,
    @ColumnInfo(name = "del_date")       val delDate: Date?
)