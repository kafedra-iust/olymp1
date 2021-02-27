fun main() {
    val (a,b) = readLine()!!.split(" ").map(String::toInt)
    var count = 0
    for (x in a..b) {
        if (test(x)) count++
    }
    println(count)
}

fun test(x: Int): Boolean {
    return isPrime(x) && isPrime(obr(x))
}

fun obr(x: Int): Int {
    var result = 0
    var t = x
    while (t > 0) {
        val d = t % 10
        result = result * 10 + d
        t /= 10
    }
    return result
}

fun isPrime(x: Int): Boolean {
    var d = 2
    while (d * d <= x) {
        if (x % d == 0) return false
        d++
    }
    return true
}

// 13 130 131 113  11113111
