package com.beeg.beeconv

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform