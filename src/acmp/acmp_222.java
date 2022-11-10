package acmp;

/* acmp.ru   |   Задание №222
		Дремучий лес
(Время: 1 сек. Память: 16 Мб Сложность: 59%)
Будем говорить, что для наблюдателя лес является дремучим, если из своего текущего положения наблюдатель видит только деревья. Вам дана карта леса и координаты точки, в которой находится наблюдатель. Требуется определить, кажется ли лес дремучим данному наблюдателю.

На карте леса все деревья изображаются кругами. При этом в лесу бывают сросшиеся деревья (изображения таких деревьев на карте пересекаются), также одно дерево может находиться внутри другого. Точка, в которой стоит наблюдатель, не лежит внутри или на границе ни одного из деревьев.

Входные данные
Во входном файле INPUT.TXT содержится сначала целое число N — количество деревьев (1 ≤ N ≤ 50 000). Затем идут два числа, задающих координаты наблюдателя. Затем идет N троек чисел, задающих деревья. Первые два числа xi и yi задают координаты центра, а третье ri — радиус. Все координаты и радиусы деревьев задаются точно, и выражаются вещественными числами не более чем с 2 знаками после десятичной точки (-10^5 ≤ xi, yi ≤ 10^5, 0 &lt; ri ≤ 10^5).

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести сообщение YES, если лес является дремучим, и NO иначе.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |YES                 |
|  | 0 0                |                    |
|  | 2 2 2              |                    |
|1 | -2 2 2             |                    |
|  | -2 -2 2            |                    |
|  | 2 -2 2             |                    |
|--|--------------------|--------------------|
|  |2                   |NO                  |
|  | 10 10              |                    |
|2 | 0 0 1              |                    |
|  | 0.5 0 2            |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_222 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}