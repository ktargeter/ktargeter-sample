package sample

data class User(
    @SampleAnnotation
    val firstName: String,
    @SampleAnnotation
    val lastName: String,
    @SampleAnnotation
    val active: Boolean,
)
