package acmp;

/* acmp.ru   |   Задание №315
		Наименьшая система счисления
(Время: 1 сек. Память: 16 Мб Сложность: 26%)
Известно, что основанием позиционной системы счисления называют количество различных символов, используемых для записи чисел в данной системе счисления. Также известно, что любое число x в b-ичной системе счисления имеет вид x=a0&#x2219;b^0+a1&#x2219;b^1+…+an&#x2219;b^n, где b ≥ 2 и 0 ≤ ai &lt; b.

Для записи чисел в b-ичной системе счисления, где b ≤ 36, могут быть использованы первые b символов из следующего списка 0,1,…, 9, A, B, …, Z. Например, для записи чисел в троичной системы используются символы 0, 1, 2, а в двенадцатеричной - 0,1,…, 9, A, B.

Требуется написать программу, которая по входной строке S определит, является ли данная строка записью числа в системе счисления, с основанием не большим 36, и, если является, определит минимальное основание этой системы счисления.

Входные данные
Входной файл INPUT.TXT содержит в единственной строке входную непустую строку. Длина строки не превышает 255. Все символы строки имеют коды от 32 до 127.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно число. Если строка является записью числа в некоторой системе счисления, то нужно вывести минимальное основание такой системы счисления. Иначе вывести -1.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |123                 |4                   |
|2 |ABCDEF              |16                  |
|3 |AD%AF               |-1                  |
|4 |03025               |6                   |
|5 |abc                 |-1                  |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_315 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}