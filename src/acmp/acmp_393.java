package acmp;

/* acmp.ru   |   Задание №393
		Плейлист
(Время: 1 сек. Память: 16 Мб Сложность: 48%)
Антон – большой любитель музыки. Но в разные моменты ему нравится разная музыка. Однажды он решил составить рейтинг своих песен, причем считать его так – если песня дослушана до конца, то ее рейтинг увеличивается на единицу, если же он так и не дослушал ее, переключив на следующую, то уменьшается на единицу. Отметим, что вследствие этого рейтинг может стать отрицательным.

Он попросил Вас написать ему программу, которая подсчитывала бы такой рейтинг. Для этого он записал в каком порядке прослушивались песни и в какие моменты времени он переключал песню на следующую. Изначально рейтинги всех песен равны нулю.

Входные данные
Первая строка входного файла INPUT.TXT содержит одно число n (1 ≤ n ≤ 1000) – количество песен у Антона. В следующих n строках следуют описания песен – название песни, состоящее не более, чем из 50 маленьких английских букв, и длина песни в секундах, разделенные пробелом. Каждая песня длится положительное число секунд и не более 30 минут. (n + 2)-я строка содержит два числа m, k (0 ≤ k ≤ m ≤ 1000) – количество прослушанных песен и количество переключений на следующую. В следующих m строках следуют названия прослушанных песен в порядке их прослушивания (все эти песни из списка). И, наконец, в последней строке – k целых неотрицательных чисел – последовательные (в неубывающем порядке) времена переключения на следующую песню (гарантируется, что она всегда существует), отсчитываемые в секундах от начала прослушивания первой. Считается, что если Антон переключил песню в момент окончания какой-нибудь, то он пропускает уже следующую.

Выходные данные
В выходной файл OUTPUT.TXT выведите n чисел – рейтинги песен в том порядке, в котором они даны во входном файле.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |2                   |1 0                 |
|  | songa 10           |                    |
|  | songb 20           |                    |
|  | 5 2                |                    |
|  | songa              |                    |
|1 | songb              |                    |
|  | songb              |                    |
|  | songa              |                    |
|  | songa              |                    |
|  | 40 55              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_393 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}