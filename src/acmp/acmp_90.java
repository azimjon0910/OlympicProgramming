package acmp;

/* acmp.ru   |   Задание №90
		Треугольные страны
(Время: 1 сек. Память: 16 Мб Сложность: 37%)
Эта история происходила на одной плоской планете. С незапамятных времен на ней существовал город N, находящийся в точке xn,yn. Кроме этого, в разное время на этой же планете существовали страны, каждая из которых имела форму треугольника.

Теперь перед историками встала серьезная задача — по имеющимся у них данным о треугольных странах определить, в какие страны мог входить город N. Город мог входить в страну, если он находится строго внутри нее.

Входные данные
Первая строка входного файла содержит два числа: xn и yn — координаты города N. Вторая строка входного файла содержит количество k треугольных стран (1 ≤ k ≤ 1000). Последующие k строк каждая описывают одну треугольную страну. Описание треугольной страны состоит из шести целых чисел x1,y1,x2,y2,x3,y3, где (x1,y1), (x2,y2), (x3,y3) — координаты вершин этой страны.

Гарантируется, что все страны имеют ненулевую площадь. Все координаты не превосходят 10000 по абсолютной величине.

Выходные данные
В первой строке выходного файла выведите количество стран, в которые мог входить город N. Во второй строке выведите через пробел номера этих стран в возрастающем порядке. Страны нумеруются с единицы в том порядке, в каком они заданы во входном файле.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |0 1                 |2                   |
|  | 2                  | 1 2                |
|1 | -2 0 2 0 0 2       |                    |
|  | -3 0 3 0 0 3       |                    |
|--|--------------------|--------------------|
|  |0 2                 |1                   |
|  | 2                  | 2                  |
|2 | -2 0 2 0 0 2       |                    |
|  | -3 0 3 0 0 3       |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_90 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}