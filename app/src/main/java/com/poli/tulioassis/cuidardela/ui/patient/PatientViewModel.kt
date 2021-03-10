package com.poli.tulioassis.cuidardela.ui.patient

import androidx.lifecycle.*
import com.poli.tulioassis.cuidardela.model.Patient
import com.poli.tulioassis.cuidardela.model.PatientRepository
import kotlinx.coroutines.launch


class PatientViewModel(private val repository: PatientRepository) : ViewModel() {


    // - Repository is completely separated from the UI through the ViewModel.
    val allPatients: LiveData<List<Patient>> = repository.allPatients.asLiveData()

    /*
     * Launching a new coroutine to insert the data in a non-blocking way
     */
    fun insert(patient: Patient) = viewModelScope.launch {
        repository.insert(patient)
    }
}

class PatientViewModelFactory(private val repository: PatientRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PatientViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PatientViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
