//package com.example.thebestappintheworld.fragment
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.thebestappintheworld.adapter.CardAdapter
//import com.example.thebestappintheworld.databinding.FragmentWalletBinding
//import com.example.thebestappintheworld.model.CardModel
//
//class WalletFragment : Fragment() {
//    private lateinit var binding: FragmentWalletBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentWalletBinding.inflate(inflater, container, false)
//        val view = binding.root
//
//        val ds = mutableListOf<CardModel>()
//
//        ds.add(CardModel("Billy","600.000đ"))
//        ds.add(CardModel("Cash","1.000.000đ"))
//        ds.add(CardModel("Danial","20.000đ"))
//        ds.add(CardModel("Joe","100.000đ"))
//        ds.add(CardModel("Trump","9.000đ"))
//
//        val adapterv = CardAdapter(ds)
//        binding.cardRecycleView.adapter = adapterv
//        binding.cardRecycleView.layoutManager = LinearLayoutManager(
//            requireContext(),
//            LinearLayoutManager.VERTICAL,
//            false
//        )
//
//        return view
//    }
//
//    companion object {
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            WalletFragment().apply {
//                arguments = Bundle().apply {
//
//                }
//            }
//    }
//}