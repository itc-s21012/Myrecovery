package jp.ac.it_college.std.s21012.myrecovery

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import jp.ac.it_college.std.s21012.myrecovery.Json.PokemonJson
import jp.ac.it_college.std.s21012.myrecovery.Json.PokemondexJson
import jp.ac.it_college.std.s21012.myrecovery.databinding.ActivityMainBinding
import java.io.InputStreamReader

lateinit var pokemondexJson: PokemondexJson
lateinit var pokemonJson: PokemonJson

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val inputStream = assets?.open("filtered_pokedex.json")
        val jsonReader = InputStreamReader(inputStream, "UTF-8").readText()
        val element = Gson().fromJson(jsonReader, PokemondexJson::class.java)
        pokemondexJson = element
        val inputStream2 = assets?.open("ordered_pokemon.json")
        val jsonReader2 = InputStreamReader(inputStream2, "UTF-8").readText()
        val element2 = Gson().fromJson(jsonReader2, PokemonJson::class.java)
        pokemonJson = element2

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        var countDownTimer = object : CountDownTimer(10000, 100) {
            override fun onTick(millisUntilFinished: Long) {
                val time = millisUntilFinished.toInt() / 1000
                val str = "あと" + time + "秒"
                (findViewById<TextView>(R.id.tv)).text = str
            }

            override fun onFinish() {
                finish()
            }
        }.start()


    }
}