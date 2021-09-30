package molina.raul.apppeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val tv_nombre: TextView = findViewById(R.id.tv_nombre_detalle)
        val tv_desc: TextView = findViewById(R.id.tv_desc_detalle)
        val iv_pelicula: ImageView = findViewById(R.id.iv_img_detalle)

        val bundle = intent.extras

        if (bundle != null) {
            var nombre: String? = bundle.getString("nombre")
            var desc: String? = bundle.getString("desc")
            var img = bundle.getInt("img")

            tv_nombre.setText(nombre)
            tv_desc.setText(desc)
            iv_pelicula.setImageResource(img)

        }

    }
}