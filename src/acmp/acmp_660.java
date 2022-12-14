package acmp;

/* acmp.ru   |   Задание №660
		Контрольная работа
(Время: 3 сек. Память: 16 Мб Сложность: 60%)
Петя для выполнения контрольной работы по математике аккуратно вырезал из бумаги в клеточку лист прямоугольной формы размером N клеток по вертикали и M клеток по горизонтали.

Перед уроком, в ожидании учителя, чтобы как-нибудь развлечься, Петя раскрасил ручкой на листе бумаги K различных клеток. Получив замечание учителя, Петя решил вырезать из этого листа бумаги меньший прямоугольный листок, на котором не было бы раскрашенных клеток, и сказал учителю, что знает сколькими различными способами это можно сделать.

Петя считает, что два способа вырезания прямоугольных листков являются различными, если на листе бумаги найдется хотя бы одна клетка, которая принадлежит одному из вырезаемых листков и не принадлежит другому. На самом деле, Петя не знает точного числа всевозможных способов вырезания листка прямоугольной формы. Однако он слышал о больших возможностях современных вычислительных машин, поэтому решил попросить помощи у участников республиканской олимпиады по информатике.

Производить разрезы разрешается только по линиям, разделяющим клетки друг от друга.

Входные данные
В первой строке входного файла INPUT.TXT находятся три числа N, M и K, разделенные пробелами, где N и M – размеры листа бумаги, а K – количество закрашенных Петей клеток. Каждая из следующих K строк содержит два числа, разделенные пробелом и описывающие одну закрашенную клетку. Первое число определяет номер строки листа бумаги, в которой находится закрашенная клетка, а второе число – номер столбца. Строки листа бумаги нумеруются сверху вниз от 1 до N, а столбцы – слева направо от 1 до M.

Ограничения: все числа натуральные, K ≤ 100000; N, M ≤ 5000; K &lt; NM .

Выходные данные
Выходной файл OUTPUT.TXT должен состоять из одной строки, содержащей одно целое число, равное количеству способов, которыми можно вырезать прямоугольный листок, не содержащий раскрашенных клеток, из испорченного Петей листа бумаги.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4 3 3               |22                  |
|  | 1 2                |                    |
|1 | 4 3                |                    |
|  | 3 1                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_660 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}