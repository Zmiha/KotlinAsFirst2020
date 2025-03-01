@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

<<<<<<< .merge_file_a02576
import kotlin.math.pow
=======
import kotlin.math.min
import kotlin.math.max
>>>>>>> .merge_file_a00820
import kotlin.math.sqrt
import lesson1.task1.sqr

// Урок 3: циклы
// Максимальное количество баллов = 9
// Рекомендуемое количество баллов = 7
// Вместе с предыдущими уроками = 16/21

/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result *= i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая (2 балла)
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
    var k = n
    var i = 0
    if (n == 0) return 1
    while (k != 0) {
        k /= 10
        i += 1
    }
    return i
}

/**
 * Простая (2 балла)
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
fun fib(n: Int): Int {
<<<<<<< .merge_file_a02576
    var s = 1
    var t: Int
    var s1 = 1
    return if ((n == 1) || (n == 2))
        1
    else {
        for (i in 3..n) {
            t = s + s1
            s1 = s
            s = t
        }
        s
    }
}

=======
    var n1 = 1
    var n2 = 1
    var i = 0
    while (i < n - 2) {
        val sum = n1 + n2
        n1 = n2
        n2 = sum
        i += 1
    }
    return n2
}
>>>>>>> .merge_file_a00820

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */
fun minDivisor(n: Int): Int {
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0)
            return i
    }
    return n
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int {
    for (i in n / 2 downTo 1) {
        if (n % i == 0)
            return i
    }
    return 1
}

/**
 * Простая (2 балла)
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */
fun lcm(m: Int, n: Int): Int {
    val max = max(n, m)
    for (i in max..n * m step max) {
        if ((i % n == 0) && (i % m == 0)) return i
    }
    return n * m
}

/**
 * Средняя (3 балла)
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
<<<<<<< .merge_file_a02576
fun isCoPrime(m: Int, n: Int): Boolean = TODO()
=======
fun isCoPrime(m: Int, n: Int): Boolean {
    for (i in 2..min(n, m)) {
        if ((n % i == 0) && (m % i == 0)) return false
    }
    return true
}
>>>>>>> .merge_file_a00820

/**
 * Средняя (3 балла)
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean = TODO()

/**
 * Средняя (3 балла)
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double = TODO()

/**
 * Сложная (4 балла)
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
<<<<<<< .merge_file_a02576
fun sqr(n: Long): Long = n * n
fun count(n: Long): Int {
    var temp = n
    var c = 0
    while (temp > 0) {
        c++
        temp /= 10
    }
    return c
}

fun inversion(n: Long): Long {
    var a: Long = 0
    var x = n
    var diff = -1.0 + count(x)
    while (x > 0) {
        a += (x % 10) * (10.0.pow(diff).toLong())
        x /= 10
        diff--
    }
    return a
}

fun squareSequenceDigit(n: Int): Int {
    var counter: Long = 0
    var t = 0
    while (n > 0) {
        counter++
        val ch = sqr(counter)
        var invch = inversion((ch))
        var diff = count(ch) - count(invch)
        while (invch > 0) {
            t++
            if (t == n)
                return (invch % 10).toInt()
            invch /= 10
        }
        while (diff > 0) {
            t++
            if (t == n)
                return 0
            diff--
        }
    }
    return 0
}
=======
fun squareSequenceDigit(n: Int): Int {
    var num = 0
    var result = 0
    var length = 0
    while (length < n) {
        num++
        result = num * num
        length += digitNumber(result)
    }
    while (n < length) {
        length--
        result /= 10
    }
    return result % 10
}

>>>>>>> .merge_file_a00820

/**
 * Сложная (5 баллов)
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
<<<<<<< .merge_file_a02576

fun fibSequenceDigit(n: Int): Int {
    var counter: Long = 0
    var t = 0
    while (n > 0) {
        counter++
        val ch = fib(counter.toInt()).toLong()
        var invch = inversion((ch))
        var diff = count(ch) - count(invch)
        while (invch > 0) {
            t++
            if (t == n)
                return (invch % 10).toInt()
            invch /= 10
        }
        while (diff > 0) {
            t++
            if (t == n)
                return 0
            diff--
        }
    }
    return 0
=======
fun fibSequenceDigit(n: Int): Int {
    var num = 0
    var result = 0
    var length = 0
    while (length < n) {
        num++
        result = fib(num)
        length += digitNumber(result)
    }
    while (n < length) {
        length--
        result /= 10
    }
    return result % 10
>>>>>>> .merge_file_a00820
}