package acmp;

/* acmp.ru   |   Задание №201
		Пакетная обработка процессов
(Время: 1 сек. Память: 16 Мб Сложность: 53%)
Для ускорения прохождения «коротких» заданий на ЭВМ выбран пакетный режим работы с квантованием времени процессора. Это значит, что всем заданиям пакета по очереди представляется процессор на одинаковое время 10 с (круговой циклический алгоритм разделения времени). Если в течение этого времени заканчивается выполнение задания, оно покидает систему и освобождает процессор. Если же очередного кванта времени не хватает для завершения задания, оно помещается в конец очереди — пакета. Последнее задание пакета выполняется без прерываний. Пакет считается готовым к вводу в ЭВМ, если в нем содержится K заданий. Новый пакет вводится в ЭВМ после окончания обработки предыдущего. Задания поступают в систему с интервалом времени 60 ± 30 с и характеризуются временем работы процессора 50 ± 45 с.

Требуется смоделировать процесс обработки N заданий и определить время начала и окончания каждого процесса.

Входные данные
На первой строке входного файла INPUT.TXT находятся числа N и K - число процессов и количество процессов в пакете (1 ≤ N ≤ 1000, 1 ≤ K ≤ 100). Гарантируется, что N делится на K. Далее следуют N строк с информацией о времени формирования и необходимое время на выполнение для каждого процесса. Все процессы стартуют в один день и следуют в порядке возрастания времени ввода их в систему.

Выходные данные
Выведите в выходной файл OUTPUT.TXT для каждого процесса в отдельной строке время его старта и время окончания через пробел в формате ЧЧ:ММ:СС.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |6 2                 |00:02:14 00:04:17   |
|  | 00:01:02 63        | 00:02:24 00:04:33  |
|  | 00:02:14 76        | 00:04:33 00:04:57  |
|1 | 00:03:16 14        | 00:04:43 00:05:06  |
|  | 00:04:02 19        | 00:05:45 00:06:12  |
|  | 00:04:36 17        | 00:05:55 00:07:17  |
|  | 00:05:45 75        |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_201 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}