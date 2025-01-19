package org.example.learnkmp

interface Platform {
    val name: String
}


expect fun getPlatform(): Platform