package acmp;

/* acmp.ru   |   Задание №860
		Паркет
(Время: 1 сек. Память: 16 Мб Сложность: 68%)
Недавно бизнесмен Борис купил себе новую квартиру в элитной новостройке. На данный момент он решил уложить весь пол в квартире паркетом. Дизайнер посоветовал ему уложить пол квадратными участками, Борису понравилась эта идея, но он потребовал узнать, сколькими способами можно это сделать. Пол в квартире должен быть весь уложен паркетом. Квадратные участки паркета не должны пересекаться или накладываться, а так же выходить на пределы квартиры. Куски паркета располагаются строго на полу параллельно стенам квартиры.

Входные данные
В первой строке входного файла INPUT.TXT содержатся два числа N и M - размеры квартиры (1 ≤ N&times;M ≤ 100). Далее следуют N строк по M символов в каждой: карта квартиры. Символ '.' обозначает пол, а '#' - стену.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT выведете количество возможных укладок паркета.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 3                 |6                   |
|  | ...                |                    |
|1 | ...                |                    |
|  | ...                |                    |
|--|--------------------|--------------------|
|  |3 3                 |1                   |
|  | .#.                |                    |
|2 | ...                |                    |
|  | .#.                |                    |
|--|--------------------|--------------------|
|  |1 1                 |1                   |
|3 |#                   |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_860 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}