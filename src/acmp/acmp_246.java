package acmp;

/* acmp.ru   |   Задание №246
		Вагоны
(Время: 1 сек. Память: 16 Мб Сложность: 23%)
Ежедневно диспетчеру железнодорожной станции приходится переставлять вагоны во многих поездах, чтобы они шли в заданном порядке. Для этого диспетчер может расцепить пришедший на станцию состав в произвольных местах и переставить образовавшиеся сцепки из одного или нескольких вагонов в произвольном порядке. Порядок вагонов в одной сцепке менять нельзя, также нельзя развернуть всю сцепку так, чтобы последний вагон в сцепке оказался первым в ней.

Диспетчер просит вашей помощи в определении того, какое минимальное число соединений между вагонами необходимо расцепить, чтобы переставить вагоны в составе в требуемом порядке.

Входные данные
В первой строке входного файла INPUT.TXT содержится целое число N (1 ≤ N ≤ 100). Во второй строке содержится перестановка натуральных чисел от 1 до N (то есть все натуральные числа от 1 до N в некотором порядке). Числа разделяются одним пробелом. Эта перестановка задает номера вагонов в приходящем на станцию составе. Требуется, чтобы в уходящем со станции составе вагоны шли в порядке их номеров.

Выходные данные
Программа должна записать в выходной файл OUTPUT.TXT единственное целое число, равное минимальному количеству соединений между вагонами, которое нужно расцепить в данном составе, чтобы их можно было переставить по порядку.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |2                   |
|1 | 3 1 2 4            |                    |
|--|--------------------|--------------------|
|  |5                   |4                   |
|2 | 5 4 3 2 1          |                    |
|--|--------------------|--------------------|
|  |2                   |0                   |
|3 | 1 2                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_246 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}