package molina.raul.apppeliculas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorPeliculas: BaseAdapter {
    lateinit var context: Context
    var peliculas: ArrayList<Pelicula> = ArrayList()

    constructor(context: Context, peliculas: ArrayList<Pelicula>){
        this.context = context
        this.peliculas = peliculas
    }

    override fun getCount(): Int {
        return peliculas.size
    }

    override fun getItem(position: Int): Any {
        return peliculas[position]
    }

    override fun getItemId(position: Int): Long {
        return peliculas[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflador = LayoutInflater.from(context)
        val vista = inflador.inflate(R.layout.pelicula_view, null)

        val tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)
        val tv_desc: TextView = vista.findViewById(R.id.tv_desc)
        val img: ImageView = vista.findViewById(R.id.img_peli)

        var pelicula: Pelicula = peliculas[position]

        tv_nombre.setText(pelicula.nombre)
        tv_desc.setText(pelicula.descripcion)
        img.setImageResource(pelicula.img)

        return vista

    }

}