package tugas1

fun main() {
    val string = "malam"
    print(isPalindrome(string))
}

fun isPalindrome(inputString: String): Boolean {
    val reverseString = inputString.reversed()
    return inputString.equals(reverseString, ignoreCase = true)
}