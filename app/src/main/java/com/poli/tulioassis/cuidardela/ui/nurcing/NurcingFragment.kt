package com.poli.tulioassis.cuidardela.ui.nurcing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.poli.tulioassis.cuidardela.R

class NurcingFragment : Fragment() {

    private lateinit var nurcingViewModel: NurcingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        nurcingViewModel =
            ViewModelProviders.of(this).get(NurcingViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nurcing, container, false)
        val textView: TextView = root.findViewById(R.id.text_nurcing)
        nurcingViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}