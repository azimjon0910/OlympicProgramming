package acmp;

/* acmp.ru   |   Задание №872
		Цепочка слов
(Время: 2 сек. Память: 16 Мб Сложность: 37%)
Цепочкой слов длины N назовем последовательность слов W1, W2, ..., WN такую, что для 1 ≤ i &lt; N слово Wi является собственным префиксом слова Wi+1.

Напомним, что слово U длины K называется собственным префиксом слова V длины L, если K &lt; L и первые K букв слова V совпадают со словом U.

Задан набор слов S = {S1, S2, ..., SM}. Найдите максимальную длину цепочки слов, которую можно построить, используя (возможно, не все) слова этого набора.

Входные данные
Входной файл INPUT.TXT содержит целое число M (1 ≤ M ≤ 255). Каждая из последующих M строк содержит по одному слову из набора S. Все слова не пусты, имеют длину, не превосходящую 255 символов, и состоят только из строчных букв английского алфавита.

Выходные данные
В выходной файл OUTPUT.TXT выведите ответ на задачу.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |3                   |
|  |a                   |                    |
|1 |ab                  |                    |
|  |abc                 |                    |
|--|--------------------|--------------------|
|  |5                   |2                   |
|  |a                   |                    |
|  |ab                  |                    |
|2 |bc                  |                    |
|  |bcd                 |                    |
|  |add                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_872 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}