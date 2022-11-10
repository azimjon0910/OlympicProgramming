package acmp;

/* acmp.ru   |   Задание №164
		Счастливый билет - 2
(Время: 1 сек. Память: 16 Мб Сложность: 26%)
Билет называется счастливым, если его можно разрезать прямой линией между цифр на две части таким образом, что оказавшиеся на них числа имеют одинаковые цифровые корни. Чтобы вычислить цифровой корень числа, его цифры складывают, если в результате получится число большее или равное 10, то цифры складывают снова и так далее, пока не получится число от 0 до 9 – это и есть цифровой корень. Например, билет с номером 0015420 является счастливым, так как разрезав его на части с числами 0015 и 420 имеем у этих чисел одинаковые цифровые корни.

Требуется написать программу, которая определит, является ли счастливым билет с заданным номером.

Входные данные
Входной файл INPUT.TXT содержит номер счастливого билета. Номер может начинаться с нулей и содержит от 1 до 100 цифр.

Выходные данные
В выходной текстовый файл OUTPUT.TXT выведите «YES», если билет счастливый и «NO» иначе.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |0015420             |YES                 |
|2 |00100               |NO                  |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_164 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}