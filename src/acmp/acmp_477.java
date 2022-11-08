package acmp;

/* acmp.ru   |   Задание №477
		Простая игра
(Время: 1 сек. Память: 16 Мб Сложность: 50%)
Дед Мазай и заяц играют в очень простую игру. Перед ними – огромная куча из N одинаковых морковок. Каждый из них во время своего хода может взять из этой кучи любое количество морковок, равное неотрицательной степени числа 2, т.е. 1, 2, 4, 8,… . Начинает игру либо дед Мазай, либо заяц. Затем игроки ходят по очереди. Тот, кто возьмет последнюю морковку, тот и выигрывает.

Требуется написать программу, которая при заданных исходных данных определяет победителя в этой игре. При этом следует учитывать, что игроки играют оптимально.

Входные данные
Входной файл INPUT.TXT содержит единственное целое положительное число N (N ≤ 10^250), задающее число морковок в начале игры.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать в первой строке цифру «1», если выиграет тот, кто ходит первым, или цифру «2» – в противном случае. Если игру выиграл тот, кто ходил первым, то во второй строке этого файла должно содержаться минимальное число морковок, которое должен взять игрок, выполнявший ход первым, чтобы гарантировать свою победу.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|1 |3                   |2                   |
|--|--------------------|--------------------|
|  |8                   |1                   |
|2 |                    |2                   |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_477 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}