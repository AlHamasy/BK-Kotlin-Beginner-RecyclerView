package id.asad.daftarbuah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class BuahAdapter(val namaBuah : Array<String>, val gambarBuah : IntArray) : RecyclerView.Adapter<BuahAdapter.MyViewHolder>() {

    // 2 panggil view / widget
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.img_buah)
        val text = itemView.findViewById<TextView>(R.id.tv_buah)
    }

    // 1 panggil layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahAdapter.MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_row_buah, parent, false)
        return MyViewHolder(layout)
    }

    // 3 tampilkan banyak data
    override fun getItemCount(): Int {
       return namaBuah.size
    }

    // 4 tampilkan data
    override fun onBindViewHolder(holder: BuahAdapter.MyViewHolder, position: Int) {
        holder.image.setImageResource(gambarBuah[position])
        holder.text.text = namaBuah[position]

        // hanya textview yg bisa diklik
        holder.text.setOnClickListener {

        }

        // semua item bisa diklik
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Anda memilih : ${namaBuah[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}