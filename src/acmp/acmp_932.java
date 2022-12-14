package acmp;

/* acmp.ru   |   Задание №932
		Столицы
(Время: 5 сек. Память: 256 Мб Сложность: 92%)
В стране Триландии близятся выборы новых столиц. Столицы в Триландии необычные, поскольку ими являются одновременно сразу три различных города. Такая идея размещения столиц основана на исследованиях эффективности управления страной, выполненных ведущими экономистами Триландии.

Всего в Триландии n городов, из которых некоторые пары городов соединены дорогами и по каждой из них можно проехать в обе стороны. Время проезда по каждой дороге в одну сторону равно одному часу. При этом все города соединены дорогами таким образом, что из каждого города можно добраться в любой другой, причем это можно сделать единственным способом, если по каждой дороге проезжать не более одного раза и только в одну сторону.

Как показали результаты проведенных триландскими экономистами исследований, управление страной будет наиболее эффективным, если три столицы будут выбраны так, что время проезда по кратчайшему пути между каждой парой столиц составит ровно d часов. Перед проведением выборов необходимо знать, сколько существует различных троек городов, удовлетворяющих описанным выше свойствам. Две тройки городов считаются различными, если в первой тройке есть хотя бы один город, которого нет во второй тройке, и наоборот.

Требуется написать программу, которая по количеству городов в Триландии и описанию дорог находит количество троек городов, которые могут быть столицами.

Входные данные
Первая строка входного файла INPUT.TXT содержит два разделенных пробелом целых числа: количество городов в Триландии n и требуемое время в пути между столицами d (3 ≤ n ≤ 10^5, 1 ≤ d &lt; n). Каждая из последующих (n – 1) строк содержит описание одной дороги: пару разделенных пробелом различных целых чисел ai и bi — номера городов, которые соединены двусторонней дорогой (1 ≤ ai ≤ n, 1 ≤ bi ≤ n, ai ≠ bi). Каждая пара городов соединена не более чем одной дорогой.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно целое число — количество подходящих троек городов, которые могут быть выбраны столицами. В случае, если подходящих троек городов не окажется, выходной файл должен содержать ноль.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4 2                 |1                   |
|  | 1 2                |                    |
|1 | 1 3                |                    |
|  | 1 4                |                    |
|--|--------------------|--------------------|
|  |7 2                 |5                   |
|  | 1 2                |                    |
|  | 1 3                |                    |
|2 | 1 4                |                    |
|  | 5 1                |                    |
|  | 5 6                |                    |
|  | 5 7                |                    |
|--|--------------------|--------------------|
----------------------------------------------

Пояснения к примерам
В первом примере существует единственный способ выбрать три столицы: города с номерами 2, 3 и 4. Рисунок, соответствующий первому примеру, приведен ниже.</p> <p class="text"><img src="/asp/article/image.asp?id=478"></p> <p class="text">Во втором примере существует четыре варианта выбора трёх столиц из четверки городов: 2, 3, 4 и 5. Можно также выбрать столицами города с номерами 1, 6 и 7. Рисунок, соответствующий второму примеру, приведен ниже.</p> <p class="text"><img src="/asp/article/image.asp?id=479">



Решение.

*/


import java.util.Scanner;

public class acmp_932 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}