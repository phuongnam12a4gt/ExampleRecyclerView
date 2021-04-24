package com.example.examplerecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.graphics.createBitmap
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class MainActivity : AppCompatActivity() ,OnItemClickListener<Club>{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listFootball = mutableListOf<Club>()
        listFootball.add(Club("ManchesterUnited", "ANH", R.drawable.manchesterunited))
        listFootball.add(Club("Chelsea", "ANH", R.drawable.chelsea))
        listFootball.add(Club("Arsenal", "ANH", R.drawable.arsernal))
        listFootball.add(Club("ManchesterCity", "ANH", R.drawable.manchestercity))
        listFootball.add(Club("ManchesterUnited", "ANH", R.drawable.manchesterunited))
        listFootball.add(Club("Chelsea", "ANH", R.drawable.chelsea))
        listFootball.add(Club("Arsenal", "ANH", R.drawable.arsernal))
        listFootball.add(Club("ManchesterCity", "ANH", R.drawable.manchestercity))
        listFootball.add(Club("ManchesterUnited", "ANH", R.drawable.manchesterunited))
        listFootball.add(Club("Chelsea", "ANH", R.drawable.chelsea))
        listFootball.add(Club("Arsenal", "ANH", R.drawable.arsernal))
        listFootball.add(Club("ManchesterCity", "ANH", R.drawable.manchestercity))
        listFootball.add(Club("ManchesterUnited", "ANH", R.drawable.manchesterunited))
        listFootball.add(Club("Chelsea", "ANH", R.drawable.chelsea))
        listFootball.add(Club("Arsenal", "ANH", R.drawable.arsernal))
        listFootball.add(Club("ManchesterCity", "ANH", R.drawable.manchestercity))
        listFootball.add(Club("ManchesterUnited", "ANH", R.drawable.manchesterunited))
        listFootball.add(Club("Chelsea", "ANH", R.drawable.chelsea))
        listFootball.add(Club("Arsenal", "ANH", R.drawable.arsernal))
        listFootball.add(Club("ManchesterCity", "ANH", R.drawable.manchestercity))
        var adapterClub = ClubAdapter()
        adapterClub.updateData(listFootball)
        adapterClub.registerOnItemClickListener(this)
        recyclerViewFootball.adapter = adapterClub
    }

    override fun onItemClick(item: Club?)
    {
//        Toast.makeText(this,item?.nameClub.toString(),Toast.LENGTH_LONG).show()
        var itent= Intent(this,MainActivity2::class.java)
        var bundle=Bundle()
        bundle.putSerializable("key1",item)
        itent.putExtra("key2",bundle)
        startActivity(itent)
    }
}
