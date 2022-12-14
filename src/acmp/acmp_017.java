package acmp;

/* acmp.ru   |   Задание №17
		Поле чудес
(Время: 0,5 сек. Память: 16 Мб Сложность: 31%)
Для игры в «Поле чудес» используется круглый барабан, разделенный на сектора, и стрелка. В каждом секторе записано некоторое число. В различных секторах может быть записано одно и то же число. Однажды ведущий игры решил изменить правила. Он сам стал вращать барабан и называть игроку (который барабана не видел) все числа подряд в том порядке, в котором на них указывала стрелка в процессе вращения барабана. Получилось так, что барабан сделал целое число оборотов, то есть последний сектор совпал с первым. После этого, ведущий задал участнику вопрос: какое наименьшее число секторов может быть на барабане? Требуется написать программу, отвечающую на этот вопрос ведущего.

Входные данные
В первой строке входного файла INPUT.TXT записано число N – количество чисел, которое назвал ведущий (2 ≤ N ≤ 30000). Во второй строке записано N чисел, на которые указывала стрелка в процессе вращения барабана. Первое число всегда совпадает с последним (в конце стрелка указывает на тот же сектор, что и в начале). Числа, записанные в секторах барабана – натуральные, не превышающие 32000.

Выходные данные
В выходной файл OUTPUT.TXT необходимо вывести одно число – минимальное число секторов, которое может быть на барабане.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |13                  |6                   |
|1 | 5 3 1 3 5 2 5 3 1 3 5 2 5|                    |
|--|--------------------|--------------------|
|  |4                   |1                   |
|2 | 1 1 1 1            |                    |
|--|--------------------|--------------------|
|  |4                   |3                   |
|3 | 1 2 3 1            |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_017 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}