package tugas1

fun main() {
    val numbers = 6
    println(triangluar(numbers))
}

fun triangluar(num: Int): Int {
    val list = (1..num).map { it }
    for (i in list) {
        return if (num == 1) {
            num
        } else {
            num + triangluar(num - 1)
        }
    }

    return num
}
