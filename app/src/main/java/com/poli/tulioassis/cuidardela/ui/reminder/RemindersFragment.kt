package com.poli.tulioassis.cuidardela.ui.reminder

import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import com.poli.tulioassis.cuidardela.R


class RemindersFragment : Fragment(R.layout.fragment_reminders) {

    private val remindersViewModel: RemindersViewModel by navGraphViewModels(R.id.mobile_navigation)

}