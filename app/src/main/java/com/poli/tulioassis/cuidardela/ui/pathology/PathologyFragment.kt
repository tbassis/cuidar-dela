package com.poli.tulioassis.cuidardela.ui.pathology

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.poli.tulioassis.cuidardela.R

class PathologyFragment : Fragment() {

    private lateinit var pathologyViewModel: PathologyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        pathologyViewModel =
            ViewModelProviders.of(this).get(PathologyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pathology, container, false)
        val textView: TextView = root.findViewById(R.id.text_pathology)
        pathologyViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}