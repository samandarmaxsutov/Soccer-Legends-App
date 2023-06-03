package uz.it_school.soccerlegendsapp.app

import android.app.Application
import uz.it_school.soccerlegendsapp.model.local.LocalStorage
import uz.it_school.soccerlegendsapp.model.room.AppDatabase

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        LocalStorage.init(this)
        AppDatabase.init(this)
    }
}