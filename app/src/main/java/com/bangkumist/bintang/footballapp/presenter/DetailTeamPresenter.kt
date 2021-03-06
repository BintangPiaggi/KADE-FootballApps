package com.bangkumist.bintang.footballapp.presenter

import com.bangkumist.bintang.footballapp.api.ApiRepository
import com.bangkumist.bintang.footballapp.api.TheSportDBApi
import com.bangkumist.bintang.footballapp.model.detailTeam.DetailTeamResponse
import com.bangkumist.bintang.footballapp.test.CoroutineContextProvider
import com.bangkumist.bintang.footballapp.view.DetailTeamView
import com.google.gson.Gson
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DetailTeamPresenter(
    private val view: DetailTeamView,
    private val apiRepository: ApiRepository,
    private val gson: Gson,
    private val context: CoroutineContextProvider = CoroutineContextProvider()
) {
    fun getDetailTeam(league: String?) {

        GlobalScope.launch(context.main) {
            val data = gson.fromJson(
                apiRepository
                    .doRequest(TheSportDBApi.getDetailTeam(league)).await(),
                DetailTeamResponse::class.java
            )

            data.teams?.let { view.showDetailTeam(it) }
        }
    }
}