package acmp;

/* acmp.ru   |   Задание №961
		Все, что движется
(Время: 1 сек. Память: 16 Мб Сложность: 28%)
Дано поле N&times;M и объекты на нем в моменты времени T и T+1. Каждый объект представлен одной английской буквой и в любой момент времени может занимать ровно одну клетку поля.

Объект движется, если в два последовательных момента времени его положения различаются.

Найдите все, что движется.

Входные данные
В первой строке входного файла INPUT.TXT записаны два целых числа N и M (1 ≤ N, M ≤ 100). В следующих N строках по M символов – поле в момент времени T. Каждый символ либо является точкой «.», и это означает, что в этом месте поля ничего нет, либо английская буква, обозначающая то, что в этом месте находится объект. Никакие два различных объекта не обозначены одним и тем же символом.

Далее идет пустая строка.

В следующих N строках находится описание того же поля в момент времени T+1 в том же формате. Множество объектов, находящихся на поле в момент времени T, равно множеству объектов в момент времени T + 1.

Выходные данные
В первой строке выходного файла OUTPUT.TXT выведите количество движущихся объектов. Во второй строке выведите символы, соответствующие движущимся объектам, в алфавитном порядке, причем сначала выведите все маленькие английские буквы, затем все большие. Пробелы между символами выводить не следует.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |2 2                 |1                   |
|  | .A                 |A                   |
|  | ..                 |                    |
|1 |                    |                    |
|  | A.                 |                    |
|  | ..                 |                    |
|--|--------------------|--------------------|
|  |3 3                 |0                   |
|  | x.O                |                    |
|  | .X.                |                    |
|  | .o.                |                    |
|2 |                    |                    |
|  | x.O                |                    |
|  | .X.                |                    |
|  | .o.                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_961 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}