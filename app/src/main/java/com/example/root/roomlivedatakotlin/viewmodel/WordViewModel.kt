package com.example.root.roomlivedatakotlin.viewmodel

import android.app.Application
import android.app.usage.NetworkStatsManager
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.root.roomlivedatakotlin.model.WordRepository
import com.example.root.roomlivedatakotlin.model.database.Word

abstract class WordViewModel:AndroidViewModel{


    constructor(application: Application) :super(application)
    var repository:WordRepository= WordRepository(getApplication())
    var mAllWord:LiveData<List<Word>> = repository.mAllWords

    public fun insert(word:Word){
        repository.insert(word)
    }


}