package com.poli.tulioassis.cuidardela

import android.app.Application
import com.poli.tulioassis.cuidardela.model.CuidarDElaRoomDatabase
import com.poli.tulioassis.cuidardela.model.PatientRepository

class CuidarDELAAplication : Application() {
    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
    val database by lazy { CuidarDElaRoomDatabase.getDatabase(this) }
    val patientRepository by lazy { PatientRepository(database.patientDao()) }
}