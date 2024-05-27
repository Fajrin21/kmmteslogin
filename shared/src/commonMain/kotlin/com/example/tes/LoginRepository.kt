package com.example.tes

class LoginRepository {
    fun login(username: String, password: String): Boolean {
        return username == "user" && password == "password"
    }
}