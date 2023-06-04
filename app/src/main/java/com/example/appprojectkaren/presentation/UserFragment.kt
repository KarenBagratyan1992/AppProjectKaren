package com.example.appprojectkaren.presentation
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myloginapp.databinding.FragmentUserBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel


class UserFragment() : Fragment() {


    private var binding: FragmentUserBinding? = null
    private val  vm:MainViewModel by viewModel()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUserBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val login = binding?.edLogin?.text.toString()
        val password = binding?.edPassword?.text.toString()


        binding?.btnSaved?.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                vm?.saved(log = login, pass = password)
            }


        }
        binding?.btnGet?.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {

                binding?.tvLoginTitle?.text = vm?.getData()

            }
        }

    }
}