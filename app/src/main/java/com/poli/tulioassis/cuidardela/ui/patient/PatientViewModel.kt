package com.poli.tulioassis.cuidardela.ui.patient

import androidx.lifecycle.*
import com.poli.tulioassis.cuidardela.model.Patient
import com.poli.tulioassis.cuidardela.model.PatientRepository
import kotlinx.coroutines.launch


class PatientViewModel(private val repository: PatientRepository) : ViewModel() {

    // Using LiveData and caching what allWords returns has several benefits:
    // - We can put an observer on the data (instead of polling for changes) and only update the
    //   the UI when the data actually changes.
    // - Repository is completely separated from the UI through the ViewModel.
    val allWords: LiveData<List<Patient>> = repository.allPatients.asLiveData()

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
