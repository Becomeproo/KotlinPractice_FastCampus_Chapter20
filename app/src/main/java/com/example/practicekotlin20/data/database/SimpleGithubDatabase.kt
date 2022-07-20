package com.example.practicekotlin20.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.practicekotlin20.data.dao.RepositoryDao
import com.example.practicekotlin20.data.entity.GithubRepoEntity

@Database(entities = [GithubRepoEntity::class], version = 1)
abstract class SimpleGithubDatabase : RoomDatabase() {

    abstract fun repositoryDao(): RepositoryDao
}