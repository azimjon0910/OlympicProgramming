package acmp;

/* acmp.ru   |   Задание №340
		Коробки
(Время: 1 сек. Память: 16 Мб Сложность: 19%)
На столе лежат коробка размера A1 &times; B1 &times; C1 и коробка размера A2 &times; B2 &times; C2. Выясните можно ли одну из этих коробок положить в другую, если разрешены повороты коробок вокруг любого ребра на угол 90 градусов.

Входные данные
Первая строка входного файла содержит три целых числа A1, B1 и C1. Вторая строка входного файла содержит три целых числа A2, B2 и C2. Все числа положительны и не превосходят 1000.

Выходные данные
Если коробки одинаковы, выведите "Boxes are equal". Если первая коробка может быть положена во вторую, выведите "The first box is smaller than the second one". Если вторая коробка может быть положена в первую, выведите "The first box is larger than the second one". Иначе, выведите "Boxes are incomparable".

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |1 2 3               |Boxes are equal     |
|1 |3 2 1               |                    |
|--|--------------------|--------------------|
|  |2 2 3               |The first box is larger than the second one|
|2 |3 2 1               |                    |
|--|--------------------|--------------------|
|  |2 2 3               |The first box is smaller than the second one|
|3 |3 2 3               |                    |
|--|--------------------|--------------------|
|  |3 4 5               |Boxes are incomparable|
|4 |2 4 6               |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_340 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}