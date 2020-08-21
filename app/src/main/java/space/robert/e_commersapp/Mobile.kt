package space.robert.e_commersapp

import androidx.room.Entity
import java.util.*
@Entity
class Mobile(val name:String, val price:Int, val count:Int, val id: String = UUID.randomUUID().toString())