package acmp;

/* acmp.ru   |   Задание №620
		Бассейн реки
(Время: 1 сек. Память: 16 Мб Сложность: 67%)
Дана карта рек некоторого континента. Каждая река показана как ломаная линия, которая начинается у истока реки и заканчивается или в точке, где река впадает в другую, или устьем реки. Вершины ломаной – или точки поворота реки, или точки впадения притоков.

Будем рассматривать бассейн реки как выпуклый многоугольник минимальной площади, который содержит реку и все её притоки. Одна и та же территория может принадлежать бассейнам различных рек.

В качестве примера приведем континент с тремя реками. Координаты рек и площади бассейнов даны в таблице:

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |16.00               |
|  | 5                  |                    |
|  | 6 9                |                    |
|  | 5 11               |                    |
|  | 3 12               |                    |
|  | 2 10               |                    |
|  | 1 7                |                    |
|  | 3                  |                    |
|  | 7 9                |                    |
|1 | 5 7                |                    |
|  | 5 5.5              |                    |
|  | 6                  |                    |
|  | 3 10               |                    |
|  | 5 8                |                    |
|  | 4 6                |                    |
|  | 5 5.5              |                    |
|  | 6 5                |                    |
|  | 3 5                |                    |
|--|--------------------|--------------------|
|  |2                   |12.50               |
|  | 5                  |                    |
|  | 6 9                |                    |
|  | 5 11               |                    |
|  | 3 12               |                    |
|  | 2 10               |                    |
|  | 1 7                |                    |
|2 | 6                  |                    |
|  | 3 10               |                    |
|  | 5 8                |                    |
|  | 4 6                |                    |
|  | 5 5.5              |                    |
|  | 6 5                |                    |
|  | 3 5                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_620 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}