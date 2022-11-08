package acmp;

/* acmp.ru   |   Задание №226
		Перегоны
(Время: 1 сек. Память: 16 Мб Сложность: 50%)
На некоторой железнодорожной ветке расположено N станций, которые последовательно пронумерованы числами от 1 до N. Известны расстояния между некоторыми станциями. Требуется точно вычислить длины всех перегонов между соседними станциями или указать, что это сделать невозможно (то есть приведенная информация является противоречивой или ее недостаточно).

Входные данные
Во входном файле INPUT.TXT записаны сначала числа N — количество станций (2 ≤ N ≤ 100) и E — количество пар станций, расстояния между которыми заданы (0 ≤ E ≤ 10000). Далее, идет E троек чисел, первые два числа каждой тройки задают номера станций (это числа из диапазона от 1 до N), а третье — расстояние между этими станциями (все эти расстояния заданы точно и выражаются вещественными неотрицательными числами не более чем с 3-я знаками после десятичной точки).

Выходные данные
В случае, когда восстановить длины перегонов можно однозначно, в выходной файл OUTPUT.TXT выведите сначала «YES», а затем N–1 вещественное число. Первое из этих чисел должно соответствовать расстоянию от 1-й станции до 2-й, второе — от 2-й до 3-й, и так далее. Все числа должны быть выведены с точностью до 3-х знаков после десятичной точки (например, число 2.3 следует выводить как 2.300). Если приведенная информация о расстояниях между станциями является противоречивой или не позволяет однозначно точно восстановить длины перегонов, выведите в выходной файл «NO».

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 2                 |YES                 |
|1 | 1 2 1.250          | 1.250 1.750        |
|  | 3 1 3              |                    |
|--|--------------------|--------------------|
|  |4 4                 |YES                 |
|  | 1 2 1.250          | 1.250 0.005 0.005  |
|2 | 3 1 1.255          |                    |
|  | 2 4 0.010          |                    |
|  | 1 1 0.000          |                    |
|--|--------------------|--------------------|
|  |3 1                 |NO                  |
|3 | 1 1 1              |                    |
|--|--------------------|--------------------|
|  |3 3                 |NO                  |
|  | 1 2 1.250          |                    |
|4 | 1 3 1.300          |                    |
|  | 2 3 1.000          |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_226 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}