package com.paydustry.advancedsalesapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform