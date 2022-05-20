package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.webqbms.Constants.Constants.Companion.section
import com.webqbms.Constants.Constants.Companion.sectiontwo

class MainActivity : AppCompatActivity() {

    lateinit var rvsection: RecyclerView
    var secctionadapter: AllSectionAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain)
        fakedata()

    }

    private fun fakedata() {

        val demolist = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 1"
        )
        val demolisttwo = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 2"
        )
        val demolistthree = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 3"
        )
        val demolistfour = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 4"
        )
        val demolistfive = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 5"
        )
        val demolistSix = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 6"
        )
        val demolistSeven = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 7"
        )
        val demolisteight = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 8"
        )
        val demolistnine = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 9"
        )
        val demolistten = Dataclass.listclass(
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg",
            "https://www.codelare.net//demo//music//files//data//med//7299e42e-fcc1-4a86-bf89-111a1dcfd63f.jpg", "Section 10"
        )
        val data = Dataclass(section, demolist)
        val datatwo = Dataclass(sectiontwo, demolisttwo)
        val datathree = Dataclass(section, demolistthree)
        val datafour = Dataclass(sectiontwo, demolistfour)
        val datafive = Dataclass(section, demolistfive)
        val dataSix = Dataclass(sectiontwo, demolistSix)
        val dataSeven = Dataclass(section, demolistSeven)
        val dataEight = Dataclass(sectiontwo, demolisteight)
        val datanine = Dataclass(section, demolistnine)
        val dataten = Dataclass(sectiontwo, demolistten)

        val multiplelist = ArrayList<Dataclass>()
        multiplelist.add(0, data)
        multiplelist.add(1, datatwo)
        multiplelist.add(2, datathree)
        multiplelist.add(3, datafour)
        multiplelist.add(4, datafive)
        multiplelist.add(5, dataSix)
        multiplelist.add(6, dataSeven)
        multiplelist.add(7, dataEight)
        multiplelist.add(8, datanine)
        multiplelist.add(9, dataten)

        rvsection = findViewById(R.id.rvsection) as RecyclerView
        rvsection.setLayoutManager(GridLayoutManager(this, 1, RecyclerView.VERTICAL, false))
        secctionadapter = AllSectionAdapter(multiplelist, this@MainActivity)
        rvsection.setAdapter(secctionadapter)
    }

}