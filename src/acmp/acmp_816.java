package acmp;

/* acmp.ru   |   Задание №816
		Система пересекающихся множеств
(Время: 1 сек. Память: 16 Мб Сложность: 35%)
На вступительном экзамене в один из крупнейших университетов нашей страны Вам предложили реализовать структуру данных для хранения множеств натуральных чисел.

Структура данных должна хранить n множеств, в каждое из которых могут входить натуральные числа от 1 до m, при этом одно и то же число может принадлежать нескольким множествам одновременно. Необходимо реализовать операции добавления элемента в множество, вывода всех элементов множества и вывода номеров всех множеств, в которых лежит данный элемент.

Реализуйте описанную структуру данных.

Входные данные
Первая строка входного файла INPUT.TXT содержит натуральные числа m и n (1 ≤ m, n ≤ 100). Вторая строка входного файла содержит натуральное число k –количество операций со структурой данных, которые необходимо выполнить (0 ≤ k ≤ 10^5).

Последующие k строк описывают эти операции. Описание операции может иметь один из трех форматов:

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |10 10               |1 2                 |
|  | 5                  |1 2                 |
|  | ADD 1 1            |                    |
|1 | ADD 1 2            |                    |
|  | ADD 2 1            |                    |
|  | LISTSET 1          |                    |
|  | LISTSETSOF 1       |                    |
|--|--------------------|--------------------|
|  |10 10               |-1                  |
|  | 3                  |1                   |
|2 | ADD 1 1            |                    |
|  | LISTSET 10         |                    |
|  | LISTSET 1          |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_816 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}