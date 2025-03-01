@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.PI
import kotlin.math.*

// Урок 1: простые функции
// Максимальное количество баллов = 5
// Рекомендуемое количество баллов = 4

/**
 * Пример
 *
 * Вычисление квадрата целого числа
 */
fun sqr(x: Int) = x * x

/**
 * Пример
 *
 * Вычисление квадрата вещественного числа
 */
fun sqr(x: Double) = x * x

/**
 * Пример
 *
 * Вычисление дискриминанта квадратного уравнения
 */
fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

/**
 * Пример
 *
 * Поиск одного из корней квадратного уравнения
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
    (-b + sqrt(discriminant(a, b, c))) / (2 * a)

/**
 * Пример
 *
 * Поиск произведения корней квадратного уравнения
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}

/**
 * Пример главной функции
 */
fun main() {
    val x1x2 = quadraticRootProduct(1.0, 13.0, 42.0)
    println("Root product: $x1x2")
}

/**
 * Тривиальная (3 балла).
 *
 * Задача имеет повышенную стоимость как первая в списке.
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */
<<<<<<< .merge_file_a03924
fun seconds(hours: Int, minutes: Int, seconds: Int): Int =
    seconds + minutes * 60 + hours * 3600
=======
fun seconds(hours: Int, minutes: Int, seconds: Int): Int = hours * 3600 + minutes * 60 + seconds
>>>>>>> .merge_file_a09756

/**
 * Тривиальная (1 балл)
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */
fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double =
<<<<<<< .merge_file_a03924
    (4.445 * (vershoks + 16 * (arshins + 3 * sagenes))) / 100
=======
    ((sagenes * 48 * 4.445) + (arshins * 16 * 4.445) + (vershoks * 4.445)) / 100
>>>>>>> .merge_file_a09756

/**
 * Тривиальная (1 балл)
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double = (deg * 60 * 60 + min * 60 + sec) * PI / 180 / 3600

/**
 * Тривиальная (1 балл)
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double = sqrt((sqr(x2 - x1)) + (sqr(y2 - y1)))

/**
 * Простая (2 балла)
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
<<<<<<< .merge_file_a03924
fun thirdDigit(number: Int): Int {
    val b = number / 100
    return b % 10
}
=======
fun thirdDigit(number: Int): Int = (number % 1000) / 100
>>>>>>> .merge_file_a09756

/**
 * Простая (2 балла)
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
<<<<<<< .merge_file_a03924
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {
    val sumD = minutesDepart + hoursDepart * 60
    val sumA = minutesArrive + hoursArrive * 60
    return abs(sumD - sumA)
}
=======
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int =
    ((hoursArrive - hoursDepart - 1) * 60) + 60 + minutesArrive - minutesDepart
>>>>>>> .merge_file_a09756

/**
 * Простая (2 балла)
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int): Double {
<<<<<<< .merge_file_a03924
    val sum = initial.toDouble() / 100 * percent + initial
    val sum2 = sum + sum / 100 * percent
    return sum2 + sum2 / 100 * percent
=======
    val p = percent * 0.01 + 1
    return (initial * p * p * p)
>>>>>>> .merge_file_a09756
}

/**
 * Простая (2 балла)
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int {
<<<<<<< .merge_file_a03924
    val n1 = number / 100
    val n2 = number / 10 % 10
    val n3 = number % 10
    return n3 * 100 + n2 * 10 + n1
=======
    val n1 = (number % 10)
    val n2 = (number % 100 / 10)
    val n3 = (number / 100)
    return n1 * 100 + n2 * 10 + n3
>>>>>>> .merge_file_a09756
}
