package com.example.m_e_n_u_s.ui.create_food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.m_e_n_u_s.R

class CreateFoodFragment : Fragment() {

    private lateinit var createFoodViewModel: CreateFoodViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        createFoodViewModel =
                ViewModelProvider(this).get(CreateFoodViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_create_food, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        createFoodViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}