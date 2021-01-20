package com.sample

data class User(
    @AnnotationOne
    @AnnotationTwo
    @AnnotationThree
    val firstName: String,
    @AnnotationOne
    @AnnotationTwo
    @AnnotationThree
    var lastName: String
)
