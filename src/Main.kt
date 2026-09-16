import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Номер 12.")
    print("Введите x (x<-1): ")
    val x = scanner.nextDouble()
    if (x < -1) {
        print("Введите n: ")
        val n = scanner.nextDouble()
        var res: Double = 0.0
        var i: Int = 1
        while (i <= n) {
            res += Math.pow(-1.0, i + 1.0) / ((2 * i + 1) * Math.pow(x, 2.0 * i + 1.0))
            i++
        }
        res = -Math.PI / 2 + res
        println("Результат: $res")
    } else {
        println("Ошибка! x должен быть меньше -1!")
    }
}