fun main() {
    var n = readLine()!!.toInt()
    val list = listOf(500, 200, 100, 50, 20, 10)
    if (n%10!=0) {
        println(-1)
    } else {
        var k = 0
        var count = 0
        while (n > 0) {
            while (n >= list[k]) {
                n -= list[k]
                count++
            }
            k++
        }
        println(count)
    }
}
