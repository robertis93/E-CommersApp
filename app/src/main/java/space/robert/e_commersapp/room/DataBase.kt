package space.robert.e_commersapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import space.robert.e_commersapp.Mobile

@Database(entities = [Mobile::class], version = 1)
abstract class DataBase : RoomDatabase() {
    abstract fun mobilesDAO(): MobilesDAO

}