package acmp;

/* acmp.ru   |   Задание №993
		Симпатичные последовательности
(Время: 1 сек. Память: 16 Мб Сложность: 61%)
Рассмотрим последовательность a1, a2, ..., an неотрицательных целых чисел. Обозначим как ci,j количество появлений числа i среди чисел a1, a2, ... , aj. Будем называть последовательность k-симпатичной, если для всех i1 &lt; i2 и для всех j выполнено условие: ci1,j ≥ ci2,j &#x2212; k.

По заданной последовательности a1, a2, ..., an и числу k, найдите ее максимальный префикс, который является k-симпатичным.

Входные данные
Первая строка входного файла INPUT.TXT содержит числа n и k (1 ≤ n ≤ 200 000, 0 ≤ k ≤ 200 000). Вторая строка содержит n целых чисел в диапазоне от 0 до n.

Выходные данные
В выходной файл OUTPUT.TXT выведите максимальное p такое, что последовательность a1, a2, ..., ap является k-симпатичной.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |10 1                |8                   |
|1 |0 1 1 0 2 2 1 2 2 3 |                    |
|--|--------------------|--------------------|
|  |2 0                 |0                   |
|2 |1 0                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_993 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}