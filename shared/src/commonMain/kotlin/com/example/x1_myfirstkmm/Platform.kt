package com.example.x1_myfirstkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform