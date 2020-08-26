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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val frontFragment = FrontFragment()
        val backFragment = BackFragment()



        front_button.setOnClickListener {
           findNavController(R.id.fragment).navigate(R.id.frontFragment)
                back_button.setBackgroundColor(Color.GRAY)
                front_button.setBackgroundColor(Color.BLUE)
            }


        back_button.setOnClickListener {
            findNavController(R.id.fragment).navigate(R.id.backFragment)
                back_button.setBackgroundColor(Color.BLUE)
                front_button.setBackgroundColor(Color.GRAY)
            }
        }
    }

