package acmp;

/* acmp.ru   |   Задание №990
		Пирожные
(Время: 2 сек. Память: 16 Мб Сложность: 76%)
Санта Клаус планирует принести подарки на новый год n ребятам. У него есть m пирожных, и он собирается подарить каждому ребенку несколько пирожных. Однако неожиданно возникла проблема. Детям не нравится, когда кому-то достается больше пирожных, чем ему.

Каждый ребенок характеризуется своей жадностью, жадность i-го ребенка равна gi. Если ai ребят получат больше пирожных чем i-й, то его неудовлетворенность будет равна gi&#x2219;ai.

Теперь у Санты проблема: надо поделить пирожные между ребятами так, чтобы суммарная неудовлетворенность была минимальна. Каждый ребенок должен получить хотя бы одно пирожное. Санта собирается раздать все m пирожных. Помогите ему распределить их между ребятами!

Входные данные
Первая строка входного файла INPUT.TXT содержит числа n и m (1 ≤ n ≤ 30, n ≤ m ≤ 5000). Вторая строка содержит n целых чисел g1, g2, ..., gn (1 ≤ gi ≤ 10^7).

Выходные данные
На первой строке выходного файла OUTPUT.TXT выведите минимально возможную суммарную неудовлетворенность. Вторая строка должна содержать n целых чисел: сколько пирожных следует дать каждому ребенку. Если решений несколько, то выведите любое.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 20                |2                   |
|1 |1 2 3               |2 9 9               |
|--|--------------------|--------------------|
|  |4 9                 |7                   |
|2 |2 1 5 8             |2 1 3 3             |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_990 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}