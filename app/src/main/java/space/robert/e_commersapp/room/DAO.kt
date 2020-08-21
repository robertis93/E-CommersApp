package space.robert.e_commersapp.room

import androidx.lifecycle.LiveData
import androidx.room.*
import space.robert.e_commersapp.Mobile
@Dao
interface MobilesDAO{
    @Query("SELECT*FROM Mobile")
    fun observeMobiles():LiveData<List<Mobile>>
    @Insert
    fun insertMobile(mobile: Mobile)
    @Update
    fun updateMobile(mobile: Mobile)
    @Delete
    fun deleteMobile(mobile: Mobile)
}