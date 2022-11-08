package acmp;

/* acmp.ru   |   Задание №382
		Покраска лабиринта
(Время: 1 сек. Память: 16 Мб Сложность: 46%)
<img src="/asp/article/image.asp?id=257" align="right" vspace="10" hspace="10">Лабиринт представляет собой квадрат, состоящий из N&times;N сегментов. Каждый из сегментов может быть либо пустым, либо заполненным монолитной каменной стеной. Гарантируется, что левый верхний и правый нижний сегменты пусты. Лабиринт обнесён сверху, снизу, слева и справа стенами, оставляющими свободными только левый верхний и правый нижний углы. Директор лабиринта решил покрасить стены лабиринта, видимые изнутри (см. рисунок). Помогите ему рассчитать количество краски, необходимой для этого.

Входные данные
В первой строке входного файла INPUT.TXT находится число N, затем идут N строк по N символов: точка обозначает пустой сегмент, решётка - сегмент со стеной. Размер сегментов – 5х5 метров, высота стен – 5 метров. (3 ≤ N ≤ 50)

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число - площадь видимой части внутренних стен лабиринта в квадратных метрах.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5                   |550                 |
|  | .....              |                    |
|  | ...##              |                    |
|1 | ..#..              |                    |
|  | ..###              |                    |
|  | .....              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_382 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}