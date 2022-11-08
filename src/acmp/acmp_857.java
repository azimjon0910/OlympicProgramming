package acmp;

/* acmp.ru   |   Задание №857
		Abracadabra
(Время: 5 сек. Память: 64 Мб Сложность: 59%)
Строка s называется супрефиксом для строки t, если t начинается с s и заканчивается на s. Например, «abra» является супрефиксом для строки «abracadabra». В частности, сама строка t является своим супрефиксом. Супрефиксы играют важную роль в различных алгоритмах на строках.

В этой задаче требуется решить обратную задачу о поиске супрефикса, которая заключается в следующем. Задан словарь, содержащий n слов t1, t2, …, tn и набор из m строк-образцов s1, s2, …, sm. Необходимо для каждой строки-образца из заданного набора найти количество слов в словаре, для которых эта строка-образец является супрефиксом.

Требуется написать программу, которая по заданному числу n, n словам словаря t1, t2, …, tn, заданному числу m и m строкам-образцам s1, s2, …, sm вычислит для каждой строки-образца количество слов из словаря, для которых эта строка-образец является супрефиксом.

Входные данные
Первая строка входного файла INPUT.TXT содержит целое число n (1 ≤ n ≤ 200 000). Последующие n строк содержат слова t1, t2, …, tn, по одному слову в каждой строке. Каждое слово состоит из строчных букв английского алфавита. Длина каждого слова не превышает 50. Суммарная длина всех слов не превышает 10^6. Словарь не содержит пустых слов.

Затем следует строка, содержащая целое число m (1 ≤ m ≤ 200 000). Последующие m строк содержат строки-образцы s1, s2, …, sm, по одной на каждой строке. Каждая строка-образец состоит из строчных букв английского алфавита. Длина каждой строки-образца не превышает 50. Суммарная длина всех строк-образцов не превышает 10^6. Никакая строка-образец не является пустой строкой.

Выходные данные
В выходной файл OUTPUT.TXT выведите m чисел, по одному на строке. Для каждой строки-образца в порядке, в котором они заданы во входном файле, следует вывести количество слов словаря, для которых она является супрефиксом.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |4                   |
|  | abacaba            | 2                  |
|  | abracadabra        | 0                  |
|  | aa                 |                    |
|1 | abra               |                    |
|  | 3                  |                    |
|  | a                  |                    |
|  | abra               |                    |
|  | abac               |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_857 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}