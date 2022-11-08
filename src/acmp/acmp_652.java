package acmp;

/* acmp.ru   |   Задание №652
		Квантовый имитатор
(Время: 2 сек. Память: 16 Мб Сложность: 70%)
Знаменитая компания по разработке аппаратного обеспечения «Zhaleza» после многолетних исследований разработала опытный образец квантового компьютера. Разработанная архитектура концептуально отличалась от используемой микропроцессорной архитектуры. Будущей областью применения своего изобретения компания видит обработку и хранение огромных объемов информации. Основным объектом манипулирования квантового компьютера является одномерный массив. На данный момент в процессоре квантового компьютера реализованы операции двух типов:

1. <i>Инвертирование части массива, начиная с индекса L и заканчивая индексом R</i>. Под инвертированием части массива понимается изменение прямого порядка следования элементов массива на обратный, начиная с индекса L и заканчивая индексом R, то есть элемент L меняется местами с элементом R, элемент L+1 с элементом R-1 и так далее. На псевдоязыке эту операцию можно записать следующим образом:

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |10 2                |19                  |
|1 | I 1 5              |                    |
|  | S 3 7              |                    |
|--|--------------------|--------------------|
|  |15 4                |65                  |
|  | S 2 11             |21                  |
|2 | I 10 15            |                    |
|  | I 1 10             |                    |
|  | S 5 10             |                    |
|--|--------------------|--------------------|
|  |1000 9              |11039               |
|  | S 17 149           | 101519             |
|  | I 199 428          | 86244              |
|  | I 17 417           | 194331             |
|  | I 212 987          |                    |
|3 | S 300 420          |                    |
|  | I 400 700          |                    |
|  | I 633 759          |                    |
|  | S 11 238           |                    |
|  | S 477 872          |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_652 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}