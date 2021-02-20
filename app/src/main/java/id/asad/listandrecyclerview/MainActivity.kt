package id.asad.listandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import id.asad.listandrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kota = arrayOf("Jakarta", "Bandung", "Bekasi", "Tangerang", "Bogor", "Depok")

        val arrayAdapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, kota)
        binding.listView.adapter = arrayAdapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity, "Anda memilih kota : ${kota[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}