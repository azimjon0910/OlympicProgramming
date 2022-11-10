package acmp;

/* acmp.ru   |   Задание №643
		Временной ключ
(Время: 1 сек. Память: 16 Мб Сложность: 20%)
Практически каждый уважающий себя программист знает, что для полного успеха зачастую мало написать программный продукт, его также успешно надо уметь продать, и тем более также успешно защитить от взлома, а соответственно и от несанкционированного распространения.

Многие годы основным способом защиты программного обеспечения от незаконного распространения было использование, так называемого, активационного ключа. Вся проблема заключалась и заключается в том, что зачастую используется статический ключ, то есть активационный ключ для конкретного программного продукта не зависит ни от каких параметров и всегда является неизменным.

Знаменитая компания "Gold&amp;Silver Soft" решилась на революционный шаг – было решено разработать принципиально новый способ динамической генерации активационного ключа. В данном алгоритме ключ зависит от времени и меняется каждую минуту, что существенно затрудняет взлом.

Будем считать, что активационным ключом является обычное целое положительное число. В данной версии алгоритма значение ключа на следующей минуте целиком и полностью зависит от значения ключа в текущий момент. Если в данный момент ключ равен N, то через минуту он будет равен N + S(N), где S(N) – это число, называемое контрольной суммой числа N и равняется количеству единиц в двоичной записи числа N. То есть если N = 6, то в следующую минуту значение ключа будет равно 8, если быть точнее, то N’ = N + S(N) = 6 + S(6) = 610 + S(1102) = 6 + 2 = 8.

Будем считать, что на данный момент времени значение ключа равно N, вашей задачей является вычислить значение ключа через одну минуту.

Входные данные
В первой и единственной строке входного файла INPUT.TXT находится одно натуральное число – N (1 ≤ N ≤ 2&times;10^9).

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число – значение активационного ключа на следующей минуте, учитывая, что на данный момент времени значение ключа равно N.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |2                   |3                   |
|2 |6                   |8                   |
|3 |27                  |31                  |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_643 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}