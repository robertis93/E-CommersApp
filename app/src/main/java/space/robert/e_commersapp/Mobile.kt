package space.robert.e_commersapp

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
class Mobile(val name:String, val price:Int, val count:Int, @PrimaryKey val id: String = UUID.randomUUID().toString())