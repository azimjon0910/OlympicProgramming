package acmp;

/* acmp.ru   |   Задание №51
		Факториалы!!!
(Время: 1 сек. Память: 16 Мб Сложность: 26%)
<u>Определение 1</u>:

n!!...!=n(n-k)(n-2k)...(n mod k), если n не делится на k,

n!!...!=n(n-k)(n-2k)...k, если n делится на k (знаков ! в обоих случаях k штук).

<u>Определение 2</u>:

X mod Y — остаток от деления X на Y.

Например, 10 mod 3 = 1; 3! = 3•2•1; 10!!! = 10•7•4•1;

Мы по заданным n и k смогли вычислить значение выражения из определения 1. А вам слабо?

Входные данные
Во входном файле INPUT.TXT содержится ровно одна строка. Сначала – целое число n, (1 ≤ n ≤ 10) , затем ровно один пробел, затем k восклицательных знаков (1 ≤ k ≤ 20).

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число – значение n!!..! .

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |10 !!!              |280                 |
|2 |9 !!                |945                 |
|3 |3 !                 |6                   |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_051 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}