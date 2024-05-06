package com.example.emulador_20230113_rony.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.emulador_20230113_rony.R
import com.example.emulador_20230113_rony.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root


        dashboardViewModel.text.observe(viewLifecycleOwner) {
        }

        val mostrarNombreBtn = root.findViewById<Button>(R.id.mostrarNombreBtn)

        val textViewNombre = root.findViewById<TextView>(R.id.textViewNombreEstudiante)

        mostrarNombreBtn.setOnClickListener {
            val nombreEstudiante = "Rony Javier Ramirez"
            textViewNombre.text = nombreEstudiante
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}