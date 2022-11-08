package acmp;

/* acmp.ru   |   Задание №745
		Карта
(Время: 1 сек. Память: 16 Мб Сложность: 53%)
Одним из разделов функционального анализа является теория сжимающих операторов. Важным фактом, который в ней доказывается, является теорема Банаха. Она гласит, что у оператора сжатия есть ровно одна неподвижная точка.

Интересным следствием из этой теоремы является следующее утверждение. Пусть есть карта небольшой части поверхности Земли (поверхность считается плоской). Если карту положить в некотором месте той части поверхности, которую она изображает, то будет существовать ровно одна точка, изображение которой на карте лежит на ней.

Для удобства будем считать, что изображенная на карте часть поверхности Земли имеет форму прямоугольника со сторонами 2W и 2H метров. Введем прямоугольную декартову систему координат так, что ось Ox направлена с запада на восток, а ось Oy – с юга на север. Единичный отрезок выберем равным одному метру. Кроме этого, поместим начало координат в центр рассматриваемой части поверхности Земли, а стороны рассматриваемого прямоугольника параллельны осям координат. Расположим карту размером 2a на 2b сантиметров так, что ее центр находится в точке с координатами (x, y). Таким образом, изображенная на карте поверхность Земли имеет форму прямоугольника с углами (W, H ), (&#x2212;W, H ), (&#x2212;W, &#x2212;H), (W, &#x2212;H), а углы карты расположены в точках (x +a/100, y+b/100), (x –a/100, y+b/100), (x –a/100, y&#x2212;b/100), (x +a/100, y&#x2212;b/100).

Найдите точку, изображение которой лежит на ней при таком расположении карты.

Входные данные
Входной файл INPUT.TXT содержит целые числа W, H, x, y, a, b (1 ≤ W, H, x, y, a, b ≤ 1000). Гарантируется, что карта целиком лежит внутри той части поверхности Земли, которая на ней изображена.

Выходные данные
В выходной файл OUTPUT.TXT выведите координаты искомой точки с точностью до 10&#x2212;6.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |10 10 0 0 5 5       |0.0 0.0             |
|2 |10 10 1 1 5 10      |1.0050251256281408 1.0101010101010102|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_745 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}