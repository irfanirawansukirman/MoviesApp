package com.scoproject.moviesapp.repository

import com.scoproject.moviesapp.api.BaseApiResponse
import com.scoproject.moviesapp.api.NetworkService
import com.scoproject.moviesapp.data.Movie
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.Flowable

/**
 * Created by ibnumuzzakkir on 8/8/17.
 */
class MovieRepository(networkService: NetworkService) : BaseRepository(networkService) {

    /**
     * Get Movies Data
     * @Param Sorting Type
     * *
     */
    fun getMovies(sort: String): Flowable<BaseApiResponse<List<Movie>>>? {
        return networkService.getMoviesData(sort,"08225e8f2017efb2bb80528de1674d0e" )
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
//                .map { ApiWrapper.fetchApi(it) }
    }
}