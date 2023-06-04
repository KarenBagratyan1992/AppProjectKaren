package com.example.appprojectkaren.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.myloginapp.databinding.FragmentUserResultBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserResultFragment : Fragment() {
    private val  vm:MainViewModel by viewModel()
   private var binding:FragmentUserResultBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentUserResultBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vm.data.observe(viewLifecycleOwner) { login ->
            binding?.myLogResult?.text = login

        }
    }

}