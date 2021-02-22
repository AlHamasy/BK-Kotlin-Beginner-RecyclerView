package id.asad.daftarbuah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var buahAdapter : BuahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = arrayOf("Alpukat", "Apel", "Ceri", "Durian",
                                        "Jambu Air", "Manggis", "Strawberry")

        val gambar = intArrayOf(R.drawable.alpukat, R.drawable.apel,
                                         R.drawable.ceri, R.drawable.durian,
                                         R.drawable.jambuair, R.drawable.manggis,
                                         R.drawable.strawberry)

        buahAdapter = BuahAdapter(nama, gambar)

        // tampilan recyclerview
        rv_buah.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = buahAdapter
        }
    }

    // panggil layout menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_recycler_view, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // action klik menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list){

            // tampilan recyclerview
            rv_buah.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = buahAdapter
            }
        }
        else if (item.itemId == R.id.menu_grid){

            // tampilan recyclerview
            rv_buah.apply {
                setHasFixedSize(true)
                layoutManager = GridLayoutManager(this@MainActivity, 2)
                adapter = buahAdapter
            }
        }
        return super.onOptionsItemSelected(item)
    }

}