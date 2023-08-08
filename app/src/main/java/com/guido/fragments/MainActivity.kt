package com.guido.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.guido.fragments.Prueba.Companion.LAST_NAME_BUNDLE
import com.guido.fragments.Prueba.Companion.NAME_BUNDLE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState==null) {
            val bundle = bundleOf(
                NAME_BUNDLE to "guido dev",
                LAST_NAME_BUNDLE to "programmer"
            )

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<Prueba>(R.id.contenedor_fragment, args = bundle)
            }
        }
    }
}