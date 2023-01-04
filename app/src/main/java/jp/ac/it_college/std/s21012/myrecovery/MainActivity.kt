package jp.ac.it_college.std.s21012.myrecovery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.ac.it_college.std.s21012.myrecovery.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}