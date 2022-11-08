package acmp;

/* acmp.ru   |   Задание №233
		Автобусная экскурсия
(Время: 1 сек. Память: 16 Мб Сложность: 14%)
Оргкомитет Московской городской олимпиады решил организовать обзорную экскурсию по Москве для участников олимпиады. Для этого был заказан двухэтажный автобус (участников олимпиады достаточно много и в обычный они не умещаются) высотой 437 сантиметров. На экскурсионном маршруте встречаются N мостов. Жюри и оргкомитет олимпиады очень обеспокоены тем, что высокий двухэтажный автобус может не проехать под одним из них. Им удалось выяснить точную высоту каждого из мостов. Автобус может проехать под мостом тогда и только тогда, когда высота моста превосходит высоту автобуса.

Помогите организаторам узнать, закончится ли экскурсия благополучно, а если нет, то установить, где произойдет авария.

Входные данные
Первая строка входного файла INPUT.TXT содержит число N (1 ≤ N ≤ 1000). Вторая строка содержит N натуральных чисел, не превосходящих 10000, через пробел - высоты мостов в сантиметрах в том порядке, в котором они встречаются на пути автобуса.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести фразу "No crash", если экскурсия закончится благополучно. Если же произойдет авария, то нужно вывести сообщение "Crash k", где k - номер моста, где произойдет авария. Фразы выводить без кавычек ровно с одним пробелом внутри.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |1                   |No crash            |
|1 |763                 |                    |
|--|--------------------|--------------------|
|  |3                   |Crash 2             |
|2 |763 245 113         |                    |
|--|--------------------|--------------------|
|  |1                   |Crash 1             |
|3 |437                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_233 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}