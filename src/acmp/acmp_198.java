package acmp;

/* acmp.ru   |   Задание №198
		Система линейных уравнений
(Время: 1 сек. Память: 16 Мб Сложность: 57%)
Требуется решить невырожденную систему, состоящую из N линейных уравнений с N неизвестными:</p> <img src="/asp/article/image.asp?id=213" alt="Система линейных уравнений"> <h2>Входные данные
В первой строке входного файла INPUT.TXT задано натуральное число N – ранг системы, далее следуют N строк, каждая из которых состоит из N+1 целых чисел: коэффициенты i-й строки уравнения – N чисел aij и bi. (N ≤ 100, |aij|&lt;10, |bi|&lt;10^4). Числа разделены одним или несколькими пробелами. Перед первым числом строки может быть ноль, один или несколько пробелов.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести через пробел корни приведенной во входном файле системы линейных уравнений. Корни следует выводить в порядке возрастания их номеров (x1, x2, ... xn). Гарантируется, что все корни целые и не превосходят значения 10 по абсолютной величине.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |2                   |7 3                 |
|  | 5 9 62             |                    |
|1 | 9 -3 54            |                    |
|  |                    |                    |
|--|--------------------|--------------------|
|  |3                   |8 5 -9              |
|  | 7 -9 1 2           |                    |
|2 | 0 6 5 -15          |                    |
|  | 3 -3 2 -9          |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_198 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}