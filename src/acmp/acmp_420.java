package acmp;

/* acmp.ru   |   Задание №420
		Химическая формула
(Время: 1 сек. Память: 16 Мб Сложность: 36%)
Запись химической реакции всегда содержит описания нескольких веществ. В свою очередь, описание одного химического вещества - строка, в которой входящие в него атомы химических элементов перечисляются в определенном порядке. При этом последовательности из двух и более одинаковых атомов, идущих подряд, группируются: записывается сокращенное название химического элемента и количество одинаковых элементов подряд. Например, вместо HH пишут H2. Обозначения химических элементов состоят из одной или двух английских букв, из которых первая - прописная, а вторая - строчная. В этой задаче не будут рассматриваться более сложные правила. Например, не используются скобки. Вы должны проверить, что заданная последовательность символов подходит под данное выше описание формулы химического вещества. При этом не нужно рассматривать корректность заданной строки, исходя из каких-либо других соображений, даже если они продиктованы здравым смыслом.

Входные данные
В единственной строке входного файла INPUT.TXT записана непустая последовательность символов, содержащая только цифры и строчные и прописные английские буквы. Гарантируется, что в последовательности перед каждой строчной буквой идет прописная, а все однобуквенные и двухбуквенные подстроки, начинающиеся с прописной буквы - правильные обозначения химических элементов (поэтому здесь даже не приводится их список). Длина последовательности от 1 до 1000 символов.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно слово YES, если данная строка подходит под упрощенное описание формулы химического вещества из условия и NO, если не подходит.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |OHNaOHNa            |YES                 |
|2 |H2O                 |YES                 |
|3 |HH                  |NO                  |
|4 |CHC                 |YES                 |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_420 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}