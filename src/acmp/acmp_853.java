package acmp;

/* acmp.ru   |   Задание №853
		Игра с числами
(Время: 2 сек. Память: 16 Мб Сложность: 77%)
Сегодня на уроке математики Петя и Вася изучали понятие арифметической прогрессии. Арифметической прогрессией с разностью d называется последовательность чисел a1, a2, …, ak, в которой разность между любыми двумя последовательными числами равна d. Например, последовательность 2, 5, 8, 11 является арифметической прогрессией с разностью 3.

После урока Петя и Вася придумали новую игру с числами. Игра проходит следующим образом.

В корзине находятся n фишек, на которых написаны различные целые числа a1, a2, …, an. По ходу игры игроки выкладывают фишки из корзины на стол. Петя и Вася делают ходы по очереди, первым ходит Петя. Ход состоит в том, что игрок берет одну фишку из корзины и выкладывает ее на стол. Игрок может сам решить, какую фишку взять. После этого он должен назвать целое число d ≥ 2 такое, что все числа на выбранных к данному моменту фишках являются членами некоторой арифметической прогрессии с разностью d, не обязательно последовательными. Например, если на столе выложены фишки с числами 2, 8 и 11, то можно назвать число 3, поскольку эти числа являются членами приведенной в начале условия арифметической прогрессии с разностью 3.

Игрок проигрывает, если он не может сделать ход из-за отсутствия фишек в корзине или из-за того, что добавление любой фишки из корзины на стол приводит к тому, что он не сможет подобрать соответствующее число d.

Например, если в корзине имеются числа 2, 3, 5 и 7, то Петя может выиграть. Для этого ему необходимо первым ходом выложить на стол число 3. После первого хода у него много вариантов назвать число d, например он может назвать d = 3. Теперь у Васи два варианта хода.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |1                   |
|1 |2 3 5 7             |3                   |
|--|--------------------|--------------------|
|  |2                   |0                   |
|2 |2 4                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_853 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}