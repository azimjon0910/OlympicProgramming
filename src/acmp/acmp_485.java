package acmp;

/* acmp.ru   |   Задание №485
		Рыбаки
(Время: 1 сек. Память: 16 Мб Сложность: 29%)
<i>Говорят, что однажды Дираку предложили решить следующую задачу.</i>

<i>Трое рыбаков отправились на рыбалку. Наловив рыбы, они устроились на ночлег. Проснувшись, один из рыбаков решил взять свою долю (третью часть) и отправиться домой. Пересчитав рыбу, он заметил, что на троих выловленная рыба не делится – остается одна лишняя. Недолго думая, первый рыбак выкинул лишнюю рыбу в море, взял свою долю и отправился домой. </i>

<i>Затем проснулся второй рыбак. Не заметив, что один из его товарищей уже уехал, он тоже стал делить оставшуюся рыбу на троих, и у него тоже получилась одна лишняя рыба. Поступив с лишней рыбой, также как и первый рыбак, он забрал долю, которую считал своей и поехал домой. </i>

<i>Третий рыбак также не обнаружил исчезновения своих товарищей и тоже стал делить рыбу на троих. И у него получилась одна лишняя рыба, которую он выкинул, после чего забрал третью часть и отбыл домой. </i>

<i>Вопрос, заданный Дираку, звучал так: сколько рыбы поймали рыбаки?</i>

Обобщим данную задачу следующим образом.

Однажды N рыбаков отправились на рыбалку, где поймали X рыб. После этого рыбаки легли спать. Утром, просыпаясь друг за другом, каждый из них делил выловленную рыбу на N частей. Каждый раз в остатке оставалось ровно K рыб (0 &lt; K &lt; N). Эти K рыб выбрасывались обратно в море. Рыбак забирал свою часть улова и отбывал домой, не зная ничего о том, поступал ли уже кто-либо из остальных рыбаков таким же образом.

Ваша задача – определите при заданных N и K минимально возможное целое положительное значение X – число рыб, удовлетворяющее условию задачи.

Входные данные
Входной файл INPUT.TXT содержит два целых числа N и K, разделенные пробелом (2 ≤ N ≤ 8, 0 &lt; K &lt; N).

Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно целое положительное число X – наименьшее возможное количество выловленной рыбаками рыбы.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |3 1                 |25                  |
|2 |4 3                 |247                 |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_485 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}