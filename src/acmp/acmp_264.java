package acmp;

/* acmp.ru   |   Задание №264
		Оттепель
(Время: 1 сек. Память: 16 Мб Сложность: 17%)
Уставшие от необычно теплой зимы, жители решили узнать, действительно ли это самая длинная оттепель за всю историю наблюдений за погодой. Они обратились к синоптикам, а те, в свою очередь, занялись исследованиями статистики за прошлые годы. Их интересует, сколько дней длилась самая длинная оттепель.

Оттепелью они называют период, в который среднесуточная температура ежедневно превышала 0 градусов Цельсия. Напишите программу, помогающую синоптикам в работе.

Входные данные
Во входном файле INPUT.TXT сначала записано число N – общее количество рассматриваемых дней (1 ≤ N ≤ 100). В следующей строке через пробел располагается N целых чисел, разделенных пробелами. Каждое число – среднесуточная температура в соответствующий день. Температуры – целые числа и лежат в диапазоне от –50 до 50.

Выходные данные
В выходной файл OUTPUT.TXT требуется вывести одно число – длину самой продолжительной оттепели, то есть наибольшее количество последовательных дней, на протяжении которых среднесуточная температура превышала 0 градусов. Если температура в каждый из дней была неположительной, выведите 0.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |6                   |2                   |
|1 |-20 30 -40 50 10 -10|                    |
|--|--------------------|--------------------|
|  |8                   |4                   |
|2 |10 20 30 1 -10 1 2 3|                    |
|--|--------------------|--------------------|
|  |5                   |0                   |
|3 |-10 0 -10 0 -10     |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_264 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}