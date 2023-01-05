package jp.ac.it_college.std.s21012.myrecovery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import jp.ac.it_college.std.s21012.myrecovery.databinding.FragmentTitleBinding

class Title : Fragment() {
    private var _binding: FragmentTitleBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.start.setOnClickListener {
            Navigation.findNavController(it).navigate(
                TitleDirections.actionTitle2ToGenerationFragment()
            )
        }
        return binding.root
    }
}