package com.example.root.roomlivedatakotlin.model

import android.app.Application
import android.arch.lifecycle.LiveData
import android.os.AsyncTask
import com.example.root.roomlivedatakotlin.model.database.Word
import com.example.root.roomlivedatakotlin.model.database.WordDao
import com.example.root.roomlivedatakotlin.model.database.WordRoomDatabase

class WordRepository(application: Application){
    val db = WordRoomDatabase.getInstance(application)
    var mWordDao:WordDao = db!!.wordDao()
    var mAllWords: LiveData<List<Word>> = mWordDao.getAllWords()

    public fun insert(word : Word){
        insertAsyncTask(mWordDao).execute(word)
    }

    private class insertAsyncTask internal constructor(private val mAsyncTaskDao: WordDao) : AsyncTask<Word, Void, Void>() {

        override fun doInBackground(vararg params: Word): Void? {
            mAsyncTaskDao.insert(params[0])
            return null
        }
    }
}