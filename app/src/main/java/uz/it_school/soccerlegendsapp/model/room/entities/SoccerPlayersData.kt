package uz.it_school.soccerlegendsapp.model.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.it_school.soccerlegendsapp.R

@Entity("players")
data class SoccerPlayersData(
    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
    val name:String="Messi",
    val surname:String="Lionel",
    val description:String="Lionel Andrés Messi  born 24 June 1987, also known as Leo Messi, is an Argentine professional footballer who plays as a forward for Ligue 1 club Paris Saint-Germain and captains the Argentina national team. Widely regarded as one of the greatest players of all time, Messi has won a record seven Ballon d'Or awards[note 2] and a record six European Golden Shoes, and in 2020 he was named to the Ballon d'Or Dream Team. Until leaving the club in 2021, he had spent his entire professional career with Barcelona, where he won a club-record 34 trophies, including ten La Liga titles, seven Copa del Rey titles and the UEFA Champions League four times.[note 3] With his country, he won the 2021 Copa América and the 2022 FIFA World Cup. A prolific goalscorer and creative playmaker, Messi holds the records for most goals in La Liga (474), most hat-tricks in La Liga (36) and the UEFA Champions League (eight), and most assists in La Liga (192) and the Copa América (17). He also has the most international goals by a South American male (102). Messi has scored over 800 senior career goals for club and country, and has the most goals by a player for a single club ",
    val image:Int = R.drawable.ic_launcher_background,
    val isFavorite:Boolean=false,
    val url:String=""
)
