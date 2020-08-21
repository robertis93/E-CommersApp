package space.robert.e_commersapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import space.robert.e_commersapp.room.DataBase

class MainActivity : AppCompatActivity() {
    lateinit var repository: Repository
    lateinit var database : DataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(applicationContext, DataBase::class.java, "DataBase").allowMainThreadQueries().build()
        repository =Repository(database)
        val frontFragment = FrontFragment()
        val backFragment = BackFragment()



        front_button.setOnClickListener {
           findNavController(R.id.fragment).navigate(R.id.action_backFragment_to_frontFragment)
                back_button.setBackgroundColor(Color.GRAY)
                front_button.setBackgroundColor(Color.CYAN)
            }


        back_button.setOnClickListener {
            findNavController(R.id.fragment).navigate(R.id.action_frontFragment_to_backFragment)
                back_button.setBackgroundColor(Color.CYAN)
                front_button.setBackgroundColor(Color.GRAY)
            }
        }
    }

