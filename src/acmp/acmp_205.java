package acmp;

/* acmp.ru   |   Задание №205
		Таймер
(Время: 1 сек. Память: 16 Мб Сложность: 31%)
Таймер - это часы, которые умеют подавать звуковой сигнал по прошествии некоторого периода времени. Напишите программу, которая определяет, когда должен быть подан звуковой сигнал.

Входные данные
В первой строке входного файла INPUT.TXT записано текущее время в формате ЧЧ:ММ:СС (с ведущими нулями). При этом оно удовлетворяет ограничениям: ЧЧ - от 00 до 23, ММ и СС - от 00 до 59.

Во второй строке записан интервал времени, который должен быть измерен. Интервал записывается в формате Ч:М:С (где Ч, М и С - от 0 до 10^9, без ведущих нулей). Дополнительно если Ч=0 (или Ч=0 и М=0), то они могут быть опущены. Например, 100:60 на самом деле означает 100 минут 60 секунд, что то же самое, что 101:0 или 1:41:0. А 42 обозначает 42 секунды. 100:100:100 - 100 часов, 100 минут, 100 секунд, что то же самое, что 101:41:40.

Выходные данные
В выходной файл OUTPUT.TXT выведите в формате ЧЧ:ММ:СС время, во сколько прозвучит звуковой сигнал. При этом если сигнал прозвучит не в текущие сутки, то дальше должна следовать запись +&lt;кол во&gt; days. Например, если сигнал прозвучит на следующий день – то +1 days.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |01:01:01            |01:01:01+2 days     |
|1 |48:0:0              |                    |
|--|--------------------|--------------------|
|  |01:01:01            |02:01:00            |
|2 |58:119              |                    |
|--|--------------------|--------------------|
|  |23:59:59            |00:00:00+1 days     |
|3 |1                   |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_205 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}