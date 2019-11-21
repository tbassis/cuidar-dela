package com.poli.tulioassis.cuidardela.model

import java.sql.Date

class Medicine(val medId: Int, val medName: String, val medPicture: String, val remainingDoses: Int,
               val buyReminder: Boolean, val buyDate: Date, val addDate: Date, val delDate: Date)