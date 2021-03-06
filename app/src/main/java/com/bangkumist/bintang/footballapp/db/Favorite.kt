package com.bangkumist.bintang.footballapp.db


data class Favorite(
    val id: Long?,
    val matchId: String?,
    val homeTeam: String?,
    val awayTeam: String?,
    val homeTeamScore: String,
    val awayTeamScore: String
) {
    companion object {
        const val TABLE_FAVORITE: String = "TABLE_FAVORITE"
        const val ID: String = "ID_"
        const val MATCH_ID: String = "MATCH_ID"
        const val HOME_TEAM: String = "HOME_TEAM"
        const val AWAY_TEAM: String = "AWAY_TEAM"
        const val HOME_TEAM_SCORE: String = "HOME_TEAM_SCORE"
        const val AWAY_TEAM_SCORE: String = "AWAY_TEAM_SCORE"
    }
}