package acmp;

/* acmp.ru   |   Задание №31
		Неподвижные точки
(Время: 1 сек. Память: 16 Мб Сложность: 47%)
Перестановкой P[1..n] размера n называется набор чисел от 1 до n, расположенных в определенном порядке. При этом в нем должно присутствовать ровно один раз каждое из этих чисел. Примером перестановок являются 1,3,4,5,2 (для n=5) и 3,2,1 (для n=3), а, например, 1,2,3,4,5,1 перестановкой не является, так как число 1 встречается два раза.

Число i называется неподвижной точкой для перестановки P, если P[i] = i. Например, в перестановке 1,3,4,2,5 ровно две неподвижных точки: 1 и 5, а перестановка 4,3,2,1 не имеет неподвижных точек.

Даны два числа: n и k. Найдите количество перестановок размера n с ровно k неподвижными точками.

Входные данные
Входной файл INPUT.TXT содержит два целых числа n (1 ≤ n ≤ 9) и k (0 ≤ k ≤ n).

Выходные данные
В выходной файл OUTPUT.TXT выведите ответ на задачу.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |5 2                 |20                  |
|2 |9 6                 |168                 |
|3 |2 1                 |0                   |
|4 |9 0                 |133496              |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_031 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}