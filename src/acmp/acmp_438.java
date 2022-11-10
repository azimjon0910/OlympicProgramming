package acmp;

/* acmp.ru   |   Задание №438
		Сочи-2014
(Время: 1 сек. Память: 16 Мб Сложность: 90%)
К предстоящей олимпиаде в Сочи требуется возвести N олимпийских объектов. Процесс строительства каждого объекта определяется освоением выделяемых на него денежных средств.

В строительстве объектов готовы участвовать K фирм. Фирмы имеют разные строительные мощности, выраженные в количестве денежных средств, которые фирма может осваивать в единицу времени.

В каждый момент времени фирма может осуществлять работы только на одном объекте. В строительстве одного объекта не могут одновременно участвовать несколько фирм. В любой момент времени любой объект может быть передан для продолжения строительства любой фирме.

Администрация строительства олимпийских объектов заинтересована в скорейшем освоении денежных средств, поэтому хочет составить такой график работ, при следовании которому строительство будет завершено в кратчайшие сроки. В графике будет указано время, в течение которого тот или иной объект будет строиться какой-то фирмой.

Напишите программу, результаты работы которой позволят администрации построить требуемый график.

Входные данные
Первая строка входного файла INPUT.TXT содержит целое число N — количество объектов (1 ≤ N ≤ 50). Во второй строке содержатся разделенные пробелами целочисленные значения S1, S2, S3, …, SN объемов денежных средств, выделяемых для строительства каждого из объектов. Числа Si выражены в тысячах рублей, положительные и не превышают 1000.

В третьей строке находится целое число K — количество строительных фирм (1 ≤ K ≤ 50). Четвертая строка содержит разделенные пробелами целочисленные значения мощностей каждой из фирм V1, V2, V3, …, VK в тыс. руб / час. Числа Vj положительные и не превышают 1000.

Выходные данные
Первая строка выходного файла OUTPUT.TXT содержит действительное число T — время в часах окончания всех работ, считая с начала строительства, выведенное не менее чем с тремя точными знаками после запятой. Далее в каждой строке выходного файла содержатся разделенные пробелами три числа: t, i, j, где действительное число t — время от начала строительства в часах, в которое j-я фирма приступает к строительным работам на i-м объекте.

Значения времен необходимо выводить с максимально возможной точностью. Строки должны быть отсортированы по неубыванию t.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |2                   |8.800               |
|  | 24 20              | 0 1 1              |
|1 | 2                  | 0 2 2              |
|  | 3 2                | 6.4000000 1 2      |
|  |                    | 6.4000000 2 1      |
|--|--------------------|--------------------|
|  |3                   |12.00000            |
|  | 100 100 100        | 0 1 3              |
|  | 4                  | 0 2 4              |
|  | 5 5 10 10          | 0 3 1              |
|2 |                    | 4 2 2              |
|  |                    | 4 3 4              |
|  |                    | 8 1 1              |
|  |                    | 8 3 4              |
|  |                    | 8 2 3              |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_438 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}