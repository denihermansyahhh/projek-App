package com.simplify.golapak.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simplify.golapak.R
import com.simplify.golapak.databinding.FragmentAuthBinding


class AuthFragment : Fragment() {

    private var _vbind: FragmentAuthBinding? = null
    private val vbind get() = _vbind as FragmentAuthBinding

    override fun onDestroyView() {
        super.onDestroyView()
        _vbind = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_auth, container, false);
        _vbind = FragmentAuthBinding.bind(view)
        // Inflate the layout for this fragment
        return vbind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}