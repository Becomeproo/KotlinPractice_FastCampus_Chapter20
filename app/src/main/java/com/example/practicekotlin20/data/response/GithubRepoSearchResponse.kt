package com.example.practicekotlin20.data.response

import com.example.practicekotlin20.data.entity.GithubRepoEntity

data class GithubRepoSearchResponse (
    val totalCount: Int,
    val items: List<GithubRepoEntity>
)