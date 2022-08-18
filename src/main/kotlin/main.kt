fun main() {
    val likes = 105
    val digit = likes.toString()
    val digitLength = digit.length - 1
    val lastChar = digit[digitLength]
    val lastLastChar = if (likes > 10) digit[digitLength - 1] else digitLength
    val one = "человеку"
    val other = "людям"

    if (likes == 1) {
        println("$likes $one")
    } else if (likes <= 11) {
        println("$likes $other")
    } else if (lastChar.equals(lastLastChar)) {
        println("$likes $other")
    } else if (lastChar.equals('1')) {
        println("$likes $one")
    } else {
        println("$likes $other")
    }
}