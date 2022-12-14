package acmp;

/* acmp.ru   |   Задание №749
		Неправильный RSA
(Время: 3 сек. Память: 16 Мб Сложность: 64%)
Рома, Сережа и Андрюша решили улучшить знаменитый алгоритм шифрования RSA. Они решили, что в RSA в качестве модуля можно использовать в качестве числа n не только произведение двух простых чисел, но и произведение вида n = p^kq^k, где p и q – простые числа, а k – некоторое натуральное число.

Однако Коля указал, что помимо различных математических трудностей, новая схема может оказаться менее устойчивой к взлому. А именно, большое число, равное произведению двух различных простых чисел, тяжело разложить на множители, в частности, поскольку у него существует ровно одно нетривиальное разложение. А у числа вида n = p^kq^k их может быть больше. Например, у числа 100 = 22•52 есть целых восемь нетривиальных разложений на множители: 2•50, 2•2•25, 2•2•5•5, 2•5•10, 4•25, 4•5•5, 5•20 и 10•10.

Теперь Рома, Сережа и Андрюша думают – сколько же различных нетривиальных разложений на множители есть у числа n = p^kq^k?

Входные данные
Входной файл INPUT.TXT содержит число n (6 ≤ n ≤ 10^18, гарантируется, что n = p^kq^k для различных простых p и q и натурального k).

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число — количество нетривиальных разложений на множители числа n.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |6                   |1                   |
|2 |100                 |8                   |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_749 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}