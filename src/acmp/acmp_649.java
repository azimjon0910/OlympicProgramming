package acmp;

/* acmp.ru   |   Задание №649
		Защищенный пароль
(Время: 2 сек. Память: 16 Мб Сложность: 50%)
Очень надежная и совершенно бесплатная операционная система «Vokna» известна своей безопасностью, так как при проектировании разработчики уделили большое внимание проблемам генерации паролей. Ядро операционной системы содержит в себе строку S длиной N символов. Генерация пароля происходит с использованием символов строки S. Паролем будем называть подстроку Si,j строки S длиной не менее одного и не более N символов. Подстрокой Si,j строки S называется строка, последовательно составленная из символов S[i], S[i+1], S[i+2], … , S[j-1], S[j]. Символы в строке нумеруются последовательно начиная с единицы. Пароль Si,j считается защищенным, если в нем встречается не более K одинаковых символов. Вашей задачей является по заданной строке S и числу K определить количество различных вариантов выбора защищенного пароля. Два варианта выбора пароля S^1i,j и S^2i',j' называются различными, если i ≠ i' или j ≠ j'.

Входные данные
Первая строка входного файла INPUT.TXT содержит два натуральных числа N (1 ≤ N ≤ 10^6) и K (1 ≤ K ≤ N), разделенных одиночным пробелом, где N – количество символов в строке S; K – максимальное количество одинаковых символов в пароле. Вторая строка входного файла содержит ровно N символов. Каждый символ является либо маленькой английской буквой, либо цифрой. Каждая строка входного файла заканчивается символом перевода строки.

Выходные данные
Единственная строка выходного файла OUTPUT.TXT должна содержать одно целое число – количество вариантов выбора защищенного пароля.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |6 2                 |15                  |
|1 |7aaarr              |                    |
|--|--------------------|--------------------|
|  |4 1                 |7                   |
|2 |ayay                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_649 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}