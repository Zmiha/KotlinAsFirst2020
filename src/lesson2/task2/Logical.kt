@file:Suppress("UNUSED_PARAMETER")

package lesson2.task2

import kotlin.math.sqrt
import lesson1.task1.sqr
import kotlin.math.min

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
    sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая (2 балла)
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean {
<<<<<<< .merge_file_a11020
    val a = number / 1000
    val b = number / 100 % 10
    val c = number / 10 % 10
    val d = number % 10
    return a + b == c + d
=======
    val n1 = number % 10 + (number % 100 - number % 10) / 10
    val n2 = number / 1000 + (number / 100 - number / 1000 * 10)
    return n1 == n2
>>>>>>> .merge_file_a03112
}

/**
 * Простая (2 балла)
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean = TODO()


/**
 * Простая (2 балла)
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
<<<<<<< .merge_file_a11020
fun daysInMonth(month: Int, year: Int): Int =
    if ((month % 2 == 0) && (month != 2) && (month <= 7)) 30
    else if ((month % 2 == 1) && (month != 2) && (month <= 7)) 31
    else if (month > 7) if (month % 2 == 0) 31
    else 30
    else if (((year % 100 != 0) || (year % 400 == 0)) && (year % 4 == 0)) 29
    else 28

=======
fun daysInMonth(month: Int, year: Int): Int {
    return when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if (year % 4 == 0 && (year % 100 > 0 || year % 400 == 0)) 29 else 28
        else -> 0
    }
}
>>>>>>> .merge_file_a03112

/**
 * Простая (2 балла)
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(
    x1: Double, y1: Double, r1: Double,
    x2: Double, y2: Double, r2: Double,
): Boolean = ((sqrt(sqr(x2 - x1) + sqr(y2 - y1))) + r1) <= r2

/**
 * Средняя (3 балла)
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
<<<<<<< .merge_file_a11020
    val mi = minOf(a, b, c)
    val ma = maxOf(a, b, c)
    val sr = a + b + c - ma - mi
    val hmi = min(r, s)
    return (mi <= hmi) && (sr <= (r + s - hmi))
}
=======
    return (a <= r) && (c <= s) || (c <= r) && (b <= s) || (a <= r) && (b <= s) ||
            (c <= r) && (a <= s) || (b <= r) && (c <= s) || (b <= r) && (a <= s)
}
>>>>>>> .merge_file_a03112
