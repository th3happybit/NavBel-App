package com.roacult.kero.oxxy.projet2eme.network.entities

data class PostModel (
    val id : Long ,
    val postimg : String? ,
    val description : String ,
    val userid : Long ,
    val username : String ,
    val useryear : String ,
    val userpicture : String
)
data class CreatePostModel(val postimg: String? , val description: String ,val userid: Long)
data class CreatePostResponse(val response: Int)
data class AllPostsResponse(val response:Int ,val data:List<PostModel> )