package acmp;

/* acmp.ru   |   Задание №587
		Экспедиция на Морс
(Время: 1 сек. Память: 16 Мб Сложность: 70%)
Для исследования плоского космоса была организована сверхсекретная научная экспедиция. Специально для нее был сконструирован космический корабль Z-239, а в качестве первой планеты для исследования была выбрана Зумла.

На Z-239 установлено n двигателей на антиматерии, каждый из которых характеризуется вектором силы тяги, которую он создает. Для перемещения корабля необходимо включить некоторые двигатели, при этом общая сила тяги будет равна векторной сумме тяг включенных двигателей.

При старте корабля его можно ориентировать произвольным образом, после чего включить некоторые (возможно, все) двигатели.

Очередной целью экспедиции была выбрана планета Морс. Разумеется, руководитель экспедиции хочет добраться туда как можно быстрее. Чем больше модуль суммарной силы тяги, тем быстрее полетит корабль. Какие двигатели нужно включить, чтобы добраться на Морс как можно быстрее?

Входные данные
Первая строка входного файла INPUT.TXT содержит натуральное число n - количество двигателей (1 ≤ n ≤ 30 000). В i+1-ой строке записана пара чисел - модуль силы тяги i-ого двигателя, и угол в градусах между вектором его силы тяги и направлением на Полярную звезду перед поворотом корабля (вещественное число от 0 до 360 градусов). Модуль силы тяги каждого двигателя не превосходит 10 000.

Выходные данные
В первой строке выходного файла OUTPUT.TXT выведите количество k двигателей, которые надо включить. Во строке должны быть записаны k различных чисел, разделенных пробелами - номера включаемых двигателей в любом порядке.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |2                   |
|  | 5.00 0.00          |1 3                 |
|1 | 3.00 90.00         |                    |
|  | 4.00 270.00        |                    |
|--|--------------------|--------------------|
|  |2                   |1                   |
|2 | 10.63 228.81       |2                   |
|  | 10.63 48.81        |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_587 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}