package acmp;

/* acmp.ru   |   Задание №570
		Квадрат
(Время: 1 сек. Память: 16 Мб Сложность: 43%)
На сайте сотового оператора BeepLine сделали защиту от роботов, рассылающих SMS-сообщения: прежде, чем отправить SMS, пользователь должен написать, какую фигуру он видит в специальном окошке: квадрат или круг. Причем, для усиления защиты, в рисунок внесены небольшие помехи.

Коле срочно нужно разослать всем друзьям сообщение, поэтому он просит Вас написать программу, распознающую изображение.

Экспериментально установлено, что система рисует квадрат с помехами следующим образом: сначала на белом фоне рисуется черный квадрат k&times;k клеток (k ≥ 3), затем некоторые клетки на границе квадрата (на рисунке обозначены цифрой 1) закрашиваются белым, а некоторые клетки (если таковые существуют), граничащие с квадратом (на рисунке обозначены цифрой 2), закрашиваются черным.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |10 10               |SQUARE              |
|  | ..........         |                    |
|  | ..........         |                    |
|  | ..........         |                    |
|  | ..........         |                    |
|1 | ..***.....         |                    |
|  | ..***.....         |                    |
|  | ..***.....         |                    |
|  | ..........         |                    |
|  | ..........         |                    |
|  | ..........         |                    |
|--|--------------------|--------------------|
|  |10 10               |SQUARE              |
|  | ..........         |                    |
|  | ..........         |                    |
|  | ..........         |                    |
|  | ....*.....         |                    |
|  | ..*****...         |                    |
|2 | ..******..         |                    |
|  | .******...         |                    |
|  | ..*****...         |                    |
|  | ..*.*.*...         |                    |
|  | ...*......         |                    |
|  |                    |                    |
|--|--------------------|--------------------|
|  |10 10               |CIRCLE              |
|  | ..........         |                    |
|  | ..........         |                    |
|  | ..****....         |                    |
|  | .******...         |                    |
|3 | ******.**.         |                    |
|  | ********..         |                    |
|  | ********..         |                    |
|  | .******...         |                    |
|  | ..****....         |                    |
|  | ....*.....         |                    |
|--|--------------------|--------------------|
|  |3 3                 |CIRCLE              |
|  | ...                |                    |
|4 | ...                |                    |
|  | ...                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_570 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}