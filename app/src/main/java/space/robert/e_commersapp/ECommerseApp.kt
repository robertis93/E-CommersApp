package space.robert.e_commersapp

import android.app.Application
import androidx.room.Room
import space.robert.e_commersapp.room.DataBase

class ECommerseApp : Application() {
    companion object{
        lateinit var repository: Repository
        lateinit var database : DataBase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(applicationContext, DataBase::class.java, "DataBase").allowMainThreadQueries().build()
        repository =Repository(database)
    }

}