package acmp;

/* acmp.ru   |   Задание №332
		Минимальная стоимость проезда
(Время: 1 сек. Память: 16 Мб Сложность: 40%)
На прямой ветке железной дороги расположено несколько станций. Задана стоимость проезда между любыми двумя станциями.

Требуется написать программу нахождения минимальной стоимости проезда между крайними станциями. Двигаться по железной дороге можно только в одном направлении (от станции с меньшим номером до станции с большим номером.).

Входные данные
Входной файл INPUT.TXT содержит в первой строке натуральное число N, не большее 250. Всего на дороге расположено N+1 станций, пронумерованных от 0 до N. В следующих строках записано N(N+1)/2 чисел, задающих стоимости проезда между станциями: сначала стоимость проезда от станции 0 до станций 1, 2, 3, …, N, затем от станции 1 до станций 2, 3, …, N, …, от станции N-1 до станции N. Все стоимости проезда – неотрицательные целые числа, не превосходящие 10000.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно число – минимальную стоимость проезда от станции 0 до станции N с возможными пересадками.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |12                  |
|  |7 10 20             |                    |
|1 |4 8                 |                    |
|  |2                   |                    |
|--|--------------------|--------------------|
----------------------------------------------

Пояснение
В приведенном примере всего 4 станции с номерами 0, 1, 2, 3. Оптимальный маршрут проходит через станции 0, 2 и 3. Его стоимость равна 10+2=12.



Решение.

*/


import java.util.Scanner;

public class acmp_332 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}