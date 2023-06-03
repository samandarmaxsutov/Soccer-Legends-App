package uz.it_school.soccerlegendsapp.model.room.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import uz.it_school.soccerlegendsapp.model.room.entities.SoccerPlayersData


@Dao
interface SoccerDao {
    @Query("SELECT * FROM players")
    fun getPlayers(): LiveData<List<SoccerPlayersData>>

    @Query("SELECT * FROM players WHERE id = :id")
    fun getPlayer(id: Int): LiveData<SoccerPlayersData>

    @Query("SELECT * FROM players WHERE name like '%'||:name||'%' or surname like '%'||:name||'%'")
    fun getPlayersByTitle(name:String): LiveData<List<SoccerPlayersData>>

    @Query("SELECT * FROM players where isFavorite=1")
    fun getFavoritePlayers(): LiveData<List<SoccerPlayersData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(players: List<SoccerPlayersData>)

    @Update
    fun update(player: SoccerPlayersData)
    @Query("DELETE FROM players")
    fun deleteAll()
    @Query("DELETE FROM players WHERE id = :id")
    fun delete(id: String)

    @Insert
    fun insert(player: SoccerPlayersData)


}