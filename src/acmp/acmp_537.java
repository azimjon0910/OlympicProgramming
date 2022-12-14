package acmp;

/* acmp.ru   |   Задание №537
		Перестановки - 3
(Время: 1 сек. Память: 16 Мб Сложность: 74%)
Задано множество из N различных натуральных чисел. Перестановку элементов этого множества назовем K-перестановкой, если для любых двух соседних элементов этой перестановки их наибольший общий делитель не менее K. Например, если задано множество элементов S = {6, 3, 9, 8}, то перестановка {8, 6, 3, 9} является 2-перестановкой, а перестановка {6, 8, 3, 9} – нет.

Перестановка {p1, p2, …, pN} будет лексикографически меньше перестановки {q1, q2, …, qN}, если существует такое натуральное число i (1 ≤ i ≤ N), для которого pj = qj при j &lt; i и pi &lt; qi.

В качестве примера упорядочим все K-перестановки заданного выше множества в лексикографическом порядке. Например, существует ровно четыре 2-перестановки множества S: {3, 9, 6, 8}, {8, 6, 3, 9}, {8, 6, 9, 3} и {9, 3, 6, 8}. Соответственно, первой 2-перестановкой в лексикографическом порядке является множество {3, 9, 6, 8}, а четвертой – множество {9, 3, 6, 8}.

Требуется написать программу, позволяющую найти M-ую K-перестановку в этом порядке.

Входные данные
Входной файл INPUT.TXT в первой строке содержит три натуральных числа – N (1 ≤ N ≤ 16), M и K (1 ≤ M, K ≤ 10^9). Вторая строка содержит N различных натуральных чисел, не превосходящих 10^9. Все числа в строках разделены пробелом.

Выходные данные
В выходной файл OUTPUT.TXT необходимо вывести M-ую K-перестановку заданного множества или –1, если такой нет.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4 1 2               |3 9 6 8             |
|1 |6 8 3 9             |                    |
|--|--------------------|--------------------|
|  |4 4 2               |9 3 6 8             |
|2 |6 8 3 9             |                    |
|--|--------------------|--------------------|
|  |4 5 2               |-1                  |
|3 |6 8 3 9             |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_537 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}