package com.example.pizzashop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.pizzashop.databinding.FragmentSelectOrCreatePizzaBinding
import com.example.pizzashop.model.OrderViewModel


class SelectOrCreatePizzaFragment : Fragment() {
    private val sharedViewModel: OrderViewModel by activityViewModels()
    private var binding: FragmentSelectOrCreatePizzaBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentSelectOrCreatePizzaBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.pizzaSelectionFragment = this
        binding?.apply {


        }
    }

     fun gotoNextScreen() {
        findNavController().navigate(R.id.action_selectOrCreatePizzaFragment_to_createPizzaFragment)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}





