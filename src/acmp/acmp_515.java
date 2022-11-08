package acmp;

/* acmp.ru   |   Задание №515
		Ловушки
(Время: 1 сек. Память: 16 Мб Сложность: 24%)
Далеко не все в Тентуре имеют право носить малиновые штаны, и конечно, не все владеют пепелацем с гравицапой, зато один предприимчивый чатланин поставил несколько ловушек, захватывающих отваливающиеся детали с пролетающих мимо инопланетных кораблей. Каждое утро он их обходит, в надежде, что рано или поздно из этих запчастей ему удастся собрать какое-нибудь транспортное средство. Путь свой чатланин планирует по карте, на которой аккуратно отмечены ловушки, отсчитывая начало координат от собственного дома. Начинается обход от дома, и в нем же и заканчивается.

Требуется определить, какое расстояние проходит чатланин за день.

Входные данные
В первой строке входного файла INPUT.TXT находится натуральное число N – количество ловушек, установленных чатланином (N ≤ 10), далее следуют N строк формата «X Y», описывающих координаты ловушек в порядке их обхода (-10 ≤ X,Y ≤ 10; X,Y – целые числа).

Выходные данные
В выходной файл OUTPUT.TXT выведите общее расстояние, которое пройдет чатланин, обойдя все ловушки в приведенном порядке и вернувшись в начало координат от последней ловушки, с точностью до трех знаков после запятой.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |1                   |2.000               |
|1 |1 0                 |                    |
|--|--------------------|--------------------|
|  |2                   |3.414               |
|2 |1 0                 |                    |
|  |1 1                 |                    |
|--|--------------------|--------------------|
|  |3                   |4.000               |
|  |1 0                 |                    |
|3 |1 1                 |                    |
|  |0 1                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_515 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}