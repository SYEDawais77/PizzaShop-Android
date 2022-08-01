package com.example.pizzashop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.pizzashop.databinding.FragmentStartBinding
import com.example.pizzashop.model.OrderViewModel


class StartFragment : Fragment() {
    private val  sharedViewModel: OrderViewModel by activityViewModels()

    private var binding: FragmentStartBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.startFragment = this
        binding?.apply {
            // Set up the button click listeners
            tryNow.setOnClickListener { gotoNextScreen() }

        }
    }



    fun gotoNextScreen(){
        findNavController().navigate(R.id.action_startFragment_to_selectOrCreatePizzaFragment)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}