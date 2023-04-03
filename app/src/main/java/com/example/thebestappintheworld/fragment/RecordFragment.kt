package com.example.thebestappintheworld.fragment

import RecordDayAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thebestappintheworld.R
import com.example.thebestappintheworld.databinding.FragmentRecordBinding
import com.example.thebestappintheworld.model.RecordDayModel
import com.example.thebestappintheworld.model.RecordModel

class RecordFragment : Fragment() {

    private var _binding: FragmentRecordBinding? = null
    private val binding get() =_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecordBinding.inflate(inflater, container, false)
        val view = binding.root

        val spinnerAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.days,
            R.layout.spinner_item
        )
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.recordSpinner.adapter = spinnerAdapter

        val recordList1 = listOf(
            RecordModel(
                R.drawable.home_bold,
                "Netflix - Streaming",
                "Month subscription",
                "60.000đ",
                "24 Th5"
            ),
            RecordModel(
                R.drawable.home_bold,
                "Spotify - Music",
                "Yearly subscription",
                "250.000đ",
                "18 Th4"
            ),
            RecordModel(
                R.drawable.home_bold,
                "Spotify - Music",
                "Yearly subscription",
                "250.000đ",
                "18 Th4"
            ),
            RecordModel(
                R.drawable.home_bold,
                "Spotify - Music",
                "Yearly subscription",
                "250.000đ",
                "18 Th4"
            )
        )

        val recordList2 = listOf(
            RecordModel(
                R.drawable.home_bold,
                "Amazon - Shopping",
                "Electronics",
                "2.500.000đ",
                "12 Th4"
            ),
            RecordModel(R.drawable.home_bold, "Zara - Shopping", "Clothes", "1.500.000đ", "10 Th4"),
            RecordModel(R.drawable.home_bold, "Zara - Shopping", "Clothes", "1.500.000đ", "10 Th4"),
            RecordModel(R.drawable.home_bold, "Zara - Shopping", "Clothes", "1.500.000đ", "10 Th4")

        )

        val ds = mutableListOf<RecordDayModel>()
        ds.add(RecordDayModel("Today", "Balance : 1.000.000đ", "Σ -889.322đ", recordList1))
        ds.add(RecordDayModel("Yesterday", "Balance : 3.000.000đ", "Σ -1.500.000đ", recordList2))

        val adapterv = RecordDayAdapter(ds)
        binding.recordShow.adapter = adapterv
        binding.recordShow.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)


        return view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecordFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}