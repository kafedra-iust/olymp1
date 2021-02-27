fun main() {
    readLine()!!
    val list = readLine()!!.split(" ").filterNot(String::isEmpty).map(String::toInt)
    var d = list[0]
    for (x in list) {
        d = gcd(d, x)
    }
    println("d = $d")
}

tailrec fun gcd(a: Int, b: Int): Int {
    if (b==0) return a
    return gcd(b, a % b)
}
/*

   d <= a,b
   a = b * k
   if (a==b) d = a
   if (a>b) d = gcd(a-b,b)
   if (b>a) d = gcd(b-a,a)

   a = d * k1
   b = d * k2

   a-b = d * (k1-k2)
 */