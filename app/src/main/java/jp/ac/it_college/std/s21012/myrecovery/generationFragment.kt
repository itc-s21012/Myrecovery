package jp.ac.it_college.std.s21012.myrecovery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import jp.ac.it_college.std.s21012.myrecovery.databinding.FragmentGenerationBinding

class generationFragment : Fragment() {
    private var _binding: FragmentGenerationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGenerationBinding.inflate(inflater, container,false)
        val element = pokemondexJson

        binding.gen1.setOnClickListener {
            val list = element.pokedex[0].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen2.setOnClickListener {
            val list = element.pokedex[1].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen3.setOnClickListener {
            val list = element.pokedex[2].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen4.setOnClickListener {
            val list = element.pokedex[3].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen5.setOnClickListener {
            val list = element.pokedex[4].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen6.setOnClickListener {
            val list = element.pokedex[5].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen7.setOnClickListener {
            val list = element.pokedex[6].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen8.setOnClickListener {
            val list = element.pokedex[7].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen9.setOnClickListener {
            val list = element.pokedex[8].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen10.setOnClickListener {
            val list = element.pokedex[9].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen11.setOnClickListener {
            val list = element.pokedex[10].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen12.setOnClickListener {
            val list = element.pokedex[11].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen13.setOnClickListener {
            val list = element.pokedex[12].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }
        binding.gen14.setOnClickListener {
            val list = element.pokedex[13].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                generationFragmentDirections.actionGenerationFragmentToQuizFragment(list)
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}