package com.tsdev.simpleinitrecycler

inline fun <reified T> Any.cast() =
    this as T