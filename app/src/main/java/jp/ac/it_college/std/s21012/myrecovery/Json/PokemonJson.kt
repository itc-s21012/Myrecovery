package jp.ac.it_college.std.s21012.myrecovery.Json

data class Pokemon(
    val id: Int,
    val name: String,
)
data class PokemonJson(
    val pokemon: List<Pokemon>
)