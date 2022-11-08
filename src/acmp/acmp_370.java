package acmp;

/* acmp.ru   |   Задание №370
		Площадь многоугольника
(Время: 1 сек. Память: 16 Мб Сложность: 48%)
Многоугольник на плоскости задан целочисленными координатами своих N вершин в декартовой системе координат. Требуется найти площадь многоугольника. Стороны многоугольника не соприкасаются (за исключением соседних - в вершинах) и не пересекаются.

Входные данные
В первой строке входного файла INPUT.TXT находится число N. В следующих N строках находятся пары чисел (Xi,Yi) - координаты точек. Если соединить точки в данном порядке, а также первую и последнюю точки, получится заданный многоугольник. (3 ≤ N ≤ 50 000, -20 000 ≤ Xi,Yi ≤ 20 000)

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число - площадь многоугольника. Его следует округлить до ближайшего числа с одной цифрой после запятой.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |50.0                |
|  | 5 0                |                    |
|1 | 0 5                |                    |
|  | -5 0               |                    |
|  | 0 -5               |                    |
|--|--------------------|--------------------|
|  |4                   |3.5                 |
|  | 0 4                |                    |
|2 | 0 0                |                    |
|  | 3 0                |                    |
|  | 1 1                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_370 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}