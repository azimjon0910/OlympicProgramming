package acmp;

/* acmp.ru   |   Задание №558
		Упаковка
(Время: 1 сек. Память: 16 Мб Сложность: 65%)
Вот уже неделю Ваня решает сложную задачу: по данному числу n необходимо расположить на плоскости n кругов с радиусами 1, 2, ..., n таким образом, чтобы, во-первых, каждая пара кругов не пересекалась (возможно, касаясь), а во-вторых, все эти круги помещались в большой объемлющий круг как можно меньшего радиуса. В процессе решения Ваня заметил, что, расположив достаточное количество больших кругов, можно сразу начинать искать объемлющий круг, поскольку все оставшиеся маленькие круги можно поместить в промежутках, оставшихся между большими.

Теперь Ваня хочет по данному множеству радиусов оценить, как часто между тремя попарно касающимися кругами с радиусами из этого множества можно поместить четвертый круг. Для этого он ввел рейтинг упаковываемости P: для множества радиусов R = {r1, r2, …, rn} рейтинг P(R) равен количеству таких упорядоченных четверок индексов (i, j, k, l), что ri &gt; rj &gt; rk &gt; rl и между тремя попарно касающимися кругами радиусов ri, rj и rk можно поместить круг радиуса rl так, чтобы он не пересекался с ними, возможно, касаясь. Выражение «поместить между» означает, что центр четвертого круга должен лежать внутри треугольника с вершинами в центрах первых трех кругов.

Помогите Ване посчитать рейтинг упаковываемости данного множества.

Входные данные
Входной файл INPUT.TXT содержит целое число n (1 ≤ n ≤ 250). Во второй строке через пробел записаны n различных целых чисел r1, r2, ..., rn (1 ≤ ri ≤ 250) - элементы множества R. Гарантируется, что R непусто.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число – рейтинг упаковываемости P(R).

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5                   |1                   |
|1 |2 1 5 10 20         |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_558 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}