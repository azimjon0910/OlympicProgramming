package acmp;

/* acmp.ru   |   Задание №181
		Космический мусорщик
(Время: 1 сек. Память: 16 Мб Сложность: 42%)
В околоземном космическом пространстве накопилось много мусора, поэтому ученые сконструировали специальный аппарат ловушку для космического мусора. Аппарат должен двигаться по достаточно сложной траектории, сжигая по пути мусор. Ловушка может передвигаться в пространстве по 6 направлениям: на север (N), на юг (S), на запад (W), на восток (E), вверх (U) и вниз (D). Движением ловушки управляет процессор. Программа движения задается шестью правилами движения, которые соответствуют каждому из указанных направлений. Каждое такое правило представляет собой строку символов из множества {N, S, W, E, U, D}.

Команда ловушки состоит из символа направления и целого положительного числа M. Если параметр больше 1, то ловушка перемещается на один метр в направлении, которое указано в команде, а затем последовательно выполняет команды, заданные правилом для данного направления, с параметром меньше на 1. Если же параметр равен 1, то просто перемещается на один метр в указанном направлении.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |N                   |34                  |
|  | NUSDDUSE           |                    |
|  | UEWWD              |                    |
|1 |                    |                    |
|  | U                  |                    |
|  | WED                |                    |
|  | S 3                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_181 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}