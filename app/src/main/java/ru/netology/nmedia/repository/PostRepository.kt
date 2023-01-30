package ru.netology.nmedia.repository

import kotlinx.coroutines.flow.Flow
import ru.netology.nmedia.dto.Post

interface PostRepository {
    val data: Flow<List<Post>>
    suspend fun getAll()
    //Результат - количество непрочитанных постов
    fun getNewerCount(id: Long): Flow<Int>
    suspend fun save(post: Post)
    suspend fun removeById(id: Long)
    suspend fun likeById(id: Long, isLiked: Boolean)
    //присваиваем постам в базе данных параметр "прочитано"
    suspend fun update()
}

