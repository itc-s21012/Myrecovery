package jp.ac.it_college.std.s21012.myrecovery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import jp.ac.it_college.std.s21012.myrecovery.databinding.FragmentResultBinding


class resultFragment : Fragment() {
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!
    val args:resultFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater, container, false)

        binding.collectText.apply {
            text = "${args.collecto}/10 問正解！！"
        }
        binding.btGenSelect.setOnClickListener {
            Navigation.findNavController(it).navigate(
                resultFragmentDirections.actionResultFragmentToGenerationFragment()
            )
        }
        return binding.root
    }
}