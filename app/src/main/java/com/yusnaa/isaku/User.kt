package com.yusnaa.isaku

data class User(
    val username: String,
    val email: String,
    val password: String,
    val isLogin: Boolean = false
)