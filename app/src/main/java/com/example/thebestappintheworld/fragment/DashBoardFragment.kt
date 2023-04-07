package com.example.thebestappintheworld.fragment

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thebestappintheworld.R
import com.example.thebestappintheworld.activity.WalletActivity
import com.example.thebestappintheworld.adapter.RecordAdapter
import com.example.thebestappintheworld.databinding.FragmentDashBoardBinding
import com.example.thebestappintheworld.model.RecordModel

class DashBoardFragment : Fragment() {

    private var _binding: FragmentDashBoardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashBoardBinding.inflate(inflater, container, false)
        binding.recordShowBtn.setOnClickListener{
//            Toast.makeText(requireContext(), "Clicked", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_dashBoardFragment_to_recordFragment)
        }
        binding.showCardContain.setOnClickListener {
            val intent = Intent(requireContext(), WalletActivity::class.java)
            startActivity(intent)

            val scaleDown = ObjectAnimator.ofPropertyValuesHolder(
                binding.showCardContain,
                PropertyValuesHolder.ofFloat(View.SCALE_X, 0.95f),
                PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.95f)
            )
            scaleDown.duration = 100
            scaleDown.repeatCount = 1
            scaleDown.repeatMode = ObjectAnimator.REVERSE
            scaleDown.start()
        }

        val ds = mutableListOf<RecordModel>()
        ds.add(
            RecordModel(
                R.drawable.home_bold,
                "Netflix - Streaming",
                "Month subscription",
                "60.000đ",
                "24 Th5"
            )
        )
        ds.add(
            RecordModel(
                R.drawable.home_bold,
                "Netflix - Streaming",
                "Month subscription",
                "60.000đ",
                "24 Th5"
            )
        )
        ds.add(
            RecordModel(
                R.drawable.home_bold,
                "Netflix - Streaming",
                "Month subscription",
                "60.000đ",
                "24 Th5"
            )
        )
        ds.add(
            RecordModel(
                R.drawable.home_bold,
                "Netflix - Streaming",
                "Month subscription",
                "60.000đ",
                "24 Th5"
            )
        )
        ds.add(
            RecordModel(
                R.drawable.home_bold,
                "Netflix - Streaming",
                "Month subscription",
                "60.000đ",
                "24 Th5"
            )
        )

        val adapterv = RecordAdapter(ds)
        binding.recordRecycleView.adapter = adapterv
        binding.recordRecycleView.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL,
            false
        )


        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

