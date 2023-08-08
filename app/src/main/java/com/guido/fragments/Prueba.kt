package com.guido.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup





class Prueba : Fragment() {

    private var nombre: String? = null
    private var apellido: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
                nombre = it.getString(NAME_BUNDLE)
               apellido = it.getString(LAST_NAME_BUNDLE)
            Log.i("prueba", nombre.orEmpty())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_prueba, container, false)
    }

    companion object {
        const val NAME_BUNDLE = "name_bandle"
        const val LAST_NAME_BUNDLE = "last_name_bandle"


        @JvmStatic
        fun newInstance(nombre: String, apellido: String) =
            Prueba().apply {
                arguments = Bundle().apply {
                    putString(NAME_BUNDLE,nombre)
                    putString(LAST_NAME_BUNDLE, apellido)
                }
            }
    }
}