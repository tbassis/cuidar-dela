package com.poli.tulioassis.cuidardela.ui.patient

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.navGraphViewModels
import com.poli.tulioassis.cuidardela.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val profileViewModel : ProfileViewModel by navGraphViewModels(R.id.mobile_navigation)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    

}