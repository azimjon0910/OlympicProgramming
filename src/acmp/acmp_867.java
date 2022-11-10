package acmp;

/* acmp.ru   |   Задание №867
		Экзамен - 2
(Время: 1 сек. Память: 16 Мб Сложность: 45%)
Экзамен по берляндскому языку проходит в узкой и длинной аудитории. На экзамен пришло N студентов. Все они посажены в ряд. Таким образом, позиция каждого человека задается координатой на оси Ox (эта ось ведет вдоль длинной аудитории). Два человека могут разговаривать, если расстояние между ними меньше или равно D. Какое наименьшее количество типов билетов должен подготовить преподаватель, чтобы никакие два студента с одинаковыми билетами не могли разговаривать? Выведите способ раздачи преподавателем билетов.



Входные данные
В первой строке входного файла INPUT.TXT содержится два целых числа N, D (1 ≤ N ≤ 10^4; 0 ≤ D ≤ 10^6). Вторая строка содержит последовательность различных целых чисел X1, X2, ... , XN, где Xi (0 ≤ Xi ≤ 10^6) обозначает координату вдоль оси Ox i-го студента.

Выходные данные
В первую строку выходного файла OUTPUT.TXT выведите Q – наименьшее количество типов билетов, необходимых для проведения экзамена. Во вторую строку выведите последовательность N целых чисел от 1 до Q, i-ое число этой последовательности обозначает номер типа билета i-го студента. Если ответов несколько, выведите любой.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4 1                 |2                   |
|1 |11 1 12 2           |1 1 2 2             |
|--|--------------------|--------------------|
|  |4 0                 |1                   |
|2 |11 1 12 2           |1 1 1 1             |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_867 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}