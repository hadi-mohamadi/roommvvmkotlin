package com.example.root.roomlivedatakotlin.model.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "word_table")
data class Word(@PrimaryKey var word:String)