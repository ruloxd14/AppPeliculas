package molina.raul.apppeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        agregar_peliculas()

        val adaptador: AdaptadorPeliculas = AdaptadorPeliculas(this, peliculas)
        val listview: ListView = findViewById(R.id.listview)

        listview.adapter = adaptador

    }

    fun agregar_peliculas() {
        peliculas.add(
            Pelicula(
                1,
                "Dune",
                "Característica adaptación de la novela de ciencia ficción de Frank Herbert, sobre el hijo de una familia noble a quien se le ha confiado la protección del activo más valioso y el elemento más vital de la galaxia.",
                R.drawable.dune
            )
        )
        peliculas.add(
            Pelicula(
                2,
                "Free Guy",
                "Un cajero de banco descubre que en realidad es un NPC dentro de un videojuego brutal de mundo abierto.",
                R.drawable.freeguy
            )
        )
        peliculas.add(
            Pelicula(
                3,
                "Joker",
                "En Gotham City, la sociedad ignora y maltrata al comediante con problemas mentales Arthur Fleck. Luego se embarca en una espiral descendente de revolución y crímenes sangrientos. Este camino lo pone cara a cara con su alter ego: el Joker.",
                R.drawable.joker
            )
        )
        peliculas.add(
            Pelicula(
                4,
                "The Suicide Squad",
                "Los supervillanos Harley Quinn, Bloodsport, Peacemaker y una colección de estafadores locos en la prisión de Belle Reve se unen al súper secreto y sombrío Task Force X cuando los dejan en la remota isla de Corto Maltese, infundida de enemigos.",
                R.drawable.thesuicidesquad
            )
        )
    }

}