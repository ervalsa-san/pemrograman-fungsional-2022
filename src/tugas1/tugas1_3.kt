package tugas1

fun main() {
    val numbers = listOf(4, 2)
    print(squared(numbers))
}

fun squared(num: List<Int>): Int {
    return num.reduce { x, y -> x * squared(y)}
}