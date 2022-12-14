package acmp;

/* acmp.ru   |   Задание №983
		Бег по эскалатору
(Время: 2 сек. Память: 16 Мб Сложность: 33%)
Пусть N человек бегут вниз по эскалатору, причем i-ый пробегает одну ступеньку за ti секунд. По технике безопасности бега по эскалатору, на эскалаторе запрещены «обгоны», то есть если человек A в процессе бега догнал человека B, который бежит с более низкой скоростью, то далее, до конца эскалатора, человек A бежит со скоростью человека B. Однако ступени эскалатора таковы, что на них может помещаться несколько человек одновременно.

Ваша задача написать программу, которая поможет работникам станции рассчитать, когда закончит свой бег по эскалатору каждый бегущий человек.

Входные данные
В первой строке входного файла INPUT.TXT записано число N (1 ≤ N ≤ 10^5). В следующих N строках перечислены пары чисел ti, wi (1 ≤ ti, wi ≤ 10^6) – время пробега одной ступени и количество ступеней до конца эскалатора для i-го человека. Гарантируется, что изначально всем людям осталось бежать различное число ступеней.

Выходные данные
В i-ой строке выходного файла OUTPUT.TXT выведите время в секундах, через которое i-ый человек сойдет с эскалатора.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |20                  |
|  |2 10                |33                  |
|1 |3 11                |33                  |
|  |1 12                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_983 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}