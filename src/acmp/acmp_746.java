package acmp;

/* acmp.ru   |   Задание №746
		Гонки
(Время: 2 сек. Память: 16 Мб Сложность: 64%)
В области L находится n городов. Некоторые пары городов соединены проселочной дорогой с двусторонним движением. Начавшись в каком-то городе, дорога не может закончиться в нем же. В этом году состояние дорог позволило отделению ГИБДД области L провести гонки под лозунгом «Скажем НЕТ нарушениям скоростного режима». Было решено, что круговая трасса должна состоять из четырех дорог, но не может проходить через один город два раза. Естественно, свернуть с одной дороги на другую можно только в городе. Организаторы уже должны приступить к составлению отчета, и для этого требуется посчитать количество различных трасс.

Входные данные
В первой строке входного файла INPUT.TXT записаны количество городов n (1 ≤ n ≤ 300) и количество дорог m. В каждой из следующих m строк содержится два различных числа — номера городов, соединенных соответствующей дорогой.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число – количество круговых трасс из четырех дорог, которые могут составить организаторы.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4 6                 |3                   |
|  | 1 2                |                    |
|  | 2 3                |                    |
|1 | 3 4                |                    |
|  | 4 1                |                    |
|  | 1 3                |                    |
|  | 2 4                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_746 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}