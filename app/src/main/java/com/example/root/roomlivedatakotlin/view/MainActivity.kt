package com.example.root.roomlivedatakotlin.view


import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.root.roomlivedatakotlin.R
import com.example.root.roomlivedatakotlin.databinding.ActivityMainBinding
import com.example.root.roomlivedatakotlin.viewmodel.WordViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var wordViewModel: WordViewModel
    private var NEW_WORD_ACTIVITY_REQUEST_CODE: Int = 1
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initialize()
    }

    fun initialize() {
    }
}
