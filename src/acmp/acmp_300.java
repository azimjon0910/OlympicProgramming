package acmp;

/* acmp.ru   |   Задание №300
		Радар
(Время: 1 сек. Память: 16 Мб Сложность: 48%)
Радар подвергается атаке из четырех точек, являющихся вершинами квадрата, в центре которого и стоит радар. Радар укомплектован специальным щитом, позволяющим блокировать удар, но щит может защищать радар только с одной из четырех сторон, и поворот щита требует времени. Изначально щит направлен в сторону той вершины, откуда будет первая атака. Известно время запуска и скорость ракет, ведущих атаку.

Требуется определить, сколько ракет удастся отбить.

Входные данные
Первые четыре строки входного файла INPUT.TXT содержат время запуска в секундах Tx (0 ≤ Tx ≤ 1000) и скорость полета в метрах в секунду Vx x-ой ракеты (0 &lt; Vx ≤ 1000). Ракеты перечисляются по часовой стрелке Далее задано время в секундах, необходимое для поворота щита на 90 градусов Tpov (0 &lt; Tpov ≤ 1000) и половина диагонали квадрата D – расстояние в метрах, предстоящее каждой из ракет (0 &lt; D &lt; 1000). Все числа – целые.

Выходные данные
В выходной файл OUTPUT.TXT выведите «ALIVE», если радар уцелеет при всех выстрелах, в противном случае следует вывести число успешно отраженных ракет. Если несколько ракет подлетают к радару одновременно, и радар может защититься от хотя бы одной из них, то он защищается от одной ракеты, и ее удар считается отраженным.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |0 10                |ALIVE               |
|  | 5 10               |                    |
|1 | 10 10              |                    |
|  | 15 10              |                    |
|  | 5 100              |                    |
|--|--------------------|--------------------|
|  |0 10                |1                   |
|  | 10 10              |                    |
|2 | 5 10               |                    |
|  | 15 10              |                    |
|  | 5 100              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_300 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}