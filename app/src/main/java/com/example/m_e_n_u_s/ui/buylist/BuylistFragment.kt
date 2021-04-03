package com.example.m_e_n_u_s.ui.buylist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.m_e_n_u_s.R

class BuylistFragment : Fragment() {

    private lateinit var buylistViewModel: BuylistViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        buylistViewModel =
                ViewModelProvider(this).get(BuylistViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_buylist, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        buylistViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}