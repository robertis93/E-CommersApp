package space.robert.e_commersapp

import androidx.lifecycle.LiveData
import space.robert.e_commersapp.room.DataBase

class Repository(val database:DataBase) {
    val mobiles: LiveData<List<Mobile>> = database.mobilesDAO().observeMobiles()

    fun updateMobile(mobile: Mobile){

    }

    fun buyMobile(mobile: Mobile){

    }
}