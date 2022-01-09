package com.example.proje_payanterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val data=ArrayList<ModelProduct>()
    data.add(ModelProduct("علیرضا",20009104587985))
    data.add(ModelProduct("محمد",200091287496512))
    data.add(ModelProduct("رضا",20009368759878))
    data.add(ModelProduct("امیر",200090554789655))

    val recycler_view=findViewById<RecyclerView>(R.id.Recycler_view)
    recycler_view.layoutManager=LinearLayoutManager(this)

    val adapter= Adapterproduct(data)
    recycler_view.adapter=adapter
}