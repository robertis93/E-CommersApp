package space.robert.e_commersapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frontFragment = FrontFragment()
        val backFragment = BackFragment()



        front_button.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, frontFragment)
                commit()
                back_button.setBackgroundColor(Color.GRAY)
                front_button.setBackgroundColor(Color.CYAN)
            }
        }

        back_button.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, backFragment)
                commit()
                back_button.setBackgroundColor(Color.CYAN)
                front_button.setBackgroundColor(Color.GRAY)
            }
        }
    }





}