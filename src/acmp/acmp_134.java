package acmp;

/* acmp.ru   |   Задание №134
		Автобусы
(Время: 1 сек. Память: 16 Мб Сложность: 50%)
Между некоторыми деревнями края Власюки ходят автобусы. Поскольку пассажиропотоки здесь не очень большие, то автобусы ходят всего несколько раз в день.

Марии Ивановне требуется добраться из деревни d в деревню v как можно быстрее (считается, что в момент времени 0 она находится в деревне d).

Входные данные
Во входном файле INPUT.TXT записано число N - общее число деревень (1 ≤ N ≤ 100), номера деревень d и v, затем количество автобусных рейсов R (0 ≤ R ≤ 10000). Затем идут описания автобусных рейсов. Каждый рейс задается номером деревни отправления, временем отправления, деревней назначения и временем прибытия (все времена - целые от 0 до 10000). Если в момент t пассажир приезжает в деревню, то уехать из нее он может в любой момент времени, начиная с t.

Выходные данные
В выходной файл OUTPUT.TXT вывести минимальное время, когда Мария Ивановна может оказаться в деревне v. Если она не сможет с помощью указанных автобусных рейсов добраться из d в v, вывести -1.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |5                   |
|  | 1 3                |                    |
|  | 4                  |                    |
|1 | 1 0 2 5            |                    |
|  | 1 1 2 3            |                    |
|  | 2 3 3 5            |                    |
|  | 1 1 3 10           |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_134 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}