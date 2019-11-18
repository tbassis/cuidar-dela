package com.poli.tulioassis.cuidardela.ui.care

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.poli.tulioassis.cuidardela.R
import com.poli.tulioassis.cuidardela.ui.care.CareViewModel

class CareFragment : Fragment() {

    private lateinit var careViewModel: CareViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        careViewModel =
            ViewModelProviders.of(this).get(CareViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_care, container, false)
        val textView: TextView = root.findViewById(R.id.text_care)
        careViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}