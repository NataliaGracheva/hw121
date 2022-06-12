fun main() {
    var amount1 = 4700.00
    println(calculateCommission(amount1))
    var amount2 = 4600.00
    println(calculateCommission(amount2))
}

fun calculateCommission(amount: Double): Double {
    val minComission = 35.0
    val rate = 0.0075

    return if (amount * rate > minComission) amount * rate else minComission
}