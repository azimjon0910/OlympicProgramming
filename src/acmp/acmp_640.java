package acmp;

/* acmp.ru   |   Задание №640
		Test-The-Best
(Время: 1 сек. Память: 16 Мб Сложность: 50%)
Конкурс Test-the-best, в котором участвуют лучшие программисты из Беларуси, России и других стран, проводит очный тур. Стараясь не отставать от времени, организаторы решили позаботиться о безопасности. В последнее время на рынке техники есть много аппаратуры, позволяющей осуществлять видеонаблюдение.

Широко распространены программы, позволяющие автоматически обрабатывать полученные результаты. Однако имея дело с участниками этих соревнований, на существующие разработки полагаться небезопасно. Поэтому у оргкомитета возникла необходимость написания собственной системы анализа изображений. Перед вами поставлена задача сравнения двух черно-белых изображений на клетчатой сетке. Изображения считаются одинаковыми, если множества черных пикселей в них могут быть получены друг из друга поворотом на 90, 180, или 270 градусов и, возможно, отражением относительно вертикальной оси.

Входные данные
Входной файл INPUT.TXT содержит описания двух изображений в следующем формате: первая строка содержит два целых числа n и m (1 ≤ n, m ≤ 500) - высоту и ширину изображения соответственно. Затем следуют n строк, содержащих по m символов: «#» обозначает черный пиксель, «.» - белый.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно слово: «Yes», если изображения одинаковы и «No» в противном случае.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |7 8                 |Yes                 |
|  | ........           |                    |
|  | ..###...           |                    |
|  | ..#.....           |                    |
|  | ........           |                    |
|  | ........           |                    |
|  | ........           |                    |
|1 | ........           |                    |
|  | 6 10               |                    |
|  | ..........         |                    |
|  | ...#......         |                    |
|  | ...#......         |                    |
|  | ...##.....         |                    |
|  | ..........         |                    |
|  | ..........         |                    |
|--|--------------------|--------------------|
|  |1 1                 |No                  |
|  | #                  |                    |
|2 | 1 1                |                    |
|  | .                  |                    |
|--|--------------------|--------------------|
|  |1 3                 |No                  |
|  | #.#                |                    |
|3 | 1 4                |                    |
|  | #..#               |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_640 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}