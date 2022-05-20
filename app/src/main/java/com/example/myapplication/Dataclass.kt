package com.example.myapplication

data class Dataclass(var type: Int, var list: listclass) {
    data class listclass(
        var imageurl1: String,
        var imageurl2: String,
        var imageurl3: String,
        var imageurl4: String,
        var imageurl5: String,
        var title: String,
    )
}