package acmp;

/* acmp.ru   |   Задание №871
		Автогонки
(Время: 3 сек. Память: 32 Мб Сложность: 35%)
В городе N в ближайшее время состоится этап чемпионата мира по автогонкам среди автомобилей класса Формула-0. Поскольку специальный автодром для этих соревнований организаторы построить не успели, было решено организовать трассу на улицах города.

В городе N есть n перекрестков, некоторые пары которых соединены дорогами, движение по которым возможно в обоих направлениях. При этом любые два перекрестка соединены не более чем одной дорогой, и есть возможность доехать по дорогам от любого перекрестка до любого другого.

Трасса, на которой будут проводиться соревнования, должна быть круговой (т.е. должна начинаться и заканчиваться на одном и том же перекрестке), при этом в процессе движения по ней никакой перекресток не должен встречаться более одного раза.

На предварительном этапе подготовки оргкомитетом был создан список всех дорог города. Теперь настало время его использовать. Первый вопрос, который необходимо решить, вопрос о существовании в городе требуемой круговой трассы (разумеется, если ответ будет отрицательным, организаторам придется в срочном порядке построить еще несколько дорог). Единственная проблема заключается в том, что у организаторов есть подозрение, что, поскольку список составлялся не очень внимательно, в нем некоторые дороги указаны больше одного раза.

Напишите программу, которая по заданному списку дорог города определит, возможна ли организация в городе требуемой круговой трассы.

Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа: n (1 ≤ n ≤ 10^3) – количество перекрестков в городе N и m (0 ≤ m ≤ 10^5) – количество дорог в составленном списке.

Последующие m строк описывают дороги. Каждая дорога описывается двумя числами: u и v (1 ≤ u, v ≤ n, u ≠ v) номерами перекрестков, которые она соединяет. Так как дороги двухсторонние, то пара чисел (u, v) и пара чисел (v, u) описывают одну и ту же дорогу.

Выходные данные
В выходной файл OUTPUT.TXT выведите слово YES, если в городе возможно организовать круговую трассу для соревнований, и слово NO в противном случае.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 4                 |YES                 |
|  |1 2                 |                    |
|1 |2 3                 |                    |
|  |3 1                 |                    |
|  |3 2                 |                    |
|--|--------------------|--------------------|
|  |2 3                 |NO                  |
|  |1 2                 |                    |
|2 |2 1                 |                    |
|  |2 1                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_871 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}