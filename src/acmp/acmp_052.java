package acmp;

/* acmp.ru   |   Задание №52
		Счастливый билет
(Время: 1 сек. Память: 16 Мб Сложность: 12%)
Вы пользуетесь общественным транспортом? Вероятно, вы расплачивались за проезд и получали билет с номером. Счастливым
билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех. Т.е. билет с
номером 385916 – счастливый, т.к. 3+8+5=9+1+6. Вам требуется написать программу, которая проверяет счастливость билета.

Входные данные
В единственной строке входного файла INPUT.TXT записано шесть десятичных цифр без пробелов.

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести «YES», если билет с номером N счастливый и «NO» в противном случае.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |385916              |YES                 |
|2 |123456              |NO                  |
----------------------------------------------



Решение.
Разбиваем число на цифр разрядов. Находим необходимые суммы и сравниваем.

Все шестизначные числа вмещаются в тип int, так как int до 2*10^9.
*/


import java.util.Scanner;

public class acmp_052 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d1 = n / 100000;
		int d2 = n / 10000 % 10;
		int d3 = n / 1000 % 10;
		int d4 = n / 100 % 10;
		int d5 = n / 10 % 10;
		int d6 = n % 10;
		if (d1+d2+d3 == d4+d5+d6) {
			System.out.print("YES");
		} else {
			System.out.println("NO");
		}
	}
}