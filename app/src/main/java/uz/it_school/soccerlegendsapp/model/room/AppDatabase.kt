package uz.it_school.soccerlegendsapp.model.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import uz.it_school.soccerlegendsapp.model.room.daos.SoccerDao
import uz.it_school.soccerlegendsapp.model.room.entities.SoccerPlayersData


@Database(entities = [SoccerPlayersData::class], version = 1)
abstract class AppDatabase:RoomDatabase() {

    companion object{
        @Volatile var instance: AppDatabase? = null
        fun init(context: Context) {
            if (instance == null) instance = Room.databaseBuilder(context,AppDatabase::class.java,"AppDatabase")
                .allowMainThreadQueries()
                .build()
        }
        fun getAppDatabase()=instance!!
    }
    abstract fun getSoccerDao(): SoccerDao
}