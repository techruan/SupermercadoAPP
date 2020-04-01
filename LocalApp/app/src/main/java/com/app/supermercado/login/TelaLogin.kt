package com.app.supermercado.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.app.supermercado.R
import com.app.supermercado.databinding.TelaLoginFragmentBinding


class TelaLogin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : TelaLoginFragmentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.tela_login_fragment, container, false)
        return binding.root
}

}
