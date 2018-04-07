object While {
    def main(args: Array[String]): Unit = {
        println("** ケース１ **")
        var i = 1
        while (i <= 5) {
            println(s"${i}だよ。")
            i += 1
        }
        println()

        println("** ケース２ **")
        i = 5
        while (i >= 1) {
            println(s"${i}だよ。")
            i -= 1
        }
    }
}
