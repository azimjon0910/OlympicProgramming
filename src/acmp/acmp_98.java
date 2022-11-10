package acmp;

/* acmp.ru   |   Задание №98
		Игра в числа
(Время: 1 сек. Память: 16 Мб Сложность: 23%)
Игра в числа ведётся на одномерном массиве целых положительных чисел. Перед началом, жеребьёвкой определяется, кто будет ходить первым (первый игрок), а кто – вторым (второй игрок). Процесс игры состоит в том, что игроки по очереди (сначала первый игрок, затем второй, следом опять первый и так далее) вычёркивают числа из массива. Вычеркнуть можно только число, находящееся в конце или начале оставшегося массива. При этом всегда вычёркивается максимальное число из этих двух. Если первое и последнее числа массива равны, то вычёркивается первое. Игра продолжается до того момента, пока не будут вычеркнуты все числа. Каждое вычеркнутое число идёт в актив тому игроку, который его вычеркнул. После окончания игры каждый игрок суммирует вычеркнутые им числа. Победителем объявляется тот, кто наберет больше очков.

Некоторые игроки поняли, что результат не зависит от стратегии игры, и решили попросить Вас написать программу для получения результата.

Входные данные
В первой строке входного файла INPUT.TXT находится одно целое число N – количество чисел в массиве (1 ≤ N ≤ 10^4). Во второй строке находятся N целых положительных чисел из диапазона [1, 32000], разделённых пробелом.

Выходные данные
В выходной файл OUTPUT.TXT выведите два числа, разделенные двоеточием. Первое число – количество очков, набираемых первым игроком при игре на этом массиве, второе число – для второго.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5                   |9:9                 |
|1 |4 4 1 5 4           |                    |
|--|--------------------|--------------------|
|  |1                   |1234:0              |
|2 |1234                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_98 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}