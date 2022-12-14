package acmp;

/* acmp.ru   |   Задание №656
		Дорожный аукцион
(Время: 1 сек. Память: 16 Мб Сложность: 75%)
Где-то далеко от нас, на краю земли, есть одна небольшая, но красивая страна WWW с богатейшим историческим прошлым. Люди, населяющие ее, известны всему миру своей добротой и гостеприимством. Вся территория страны условно поделена на районы. Каждый район состоит из определенного количества городов, один из которых является районным центром.

Некоторые пары городов данного государства соединены двусторонними дорогами, причем известно, что любой районный центр соединен дорогами со всеми остальными городами района, а также не более чем с двумя другими районными центрами. Никакая дорога не соединяет два города, не являющиеся районными центрами. Дорога может соединять два города из разных районов только в том случае, если оба они являются районными центрами. Между любой парой городов может быть не более одной дороги. Дороги построены таким образом, что по ним можно доехать из любого города в любой другой.

Исторически сложилось, что право на владение всеми дорогами до недавних пор принадлежали одной известной компании «АвтоДор». В связи с этим в конституционный суд был подан антимонопольный иск, который был удовлетворен – теперь компании предстоит продать часть своих владений. Экономисты компании определили для каждой дороги ее стоимость.

Одна маленькая, небогатая, но гордая фирма «КурсИнвест», в которой Вы работаете финансовым директором, захотела выкупить часть дорог, а именно, K из них. Причем необходимо, чтобы для любых двух городов, к которым примыкает хотя бы одна из выкупленных K дорог, существовало не менее одного соединяющего их пути, состоящего только из приобретенных дорог. Вам, как финансовому директору, было поручено найти экономически выгодное решение. Решение будем называть экономически выгодным, если денежная сумма, потраченная на приобретение дорог, является минимальной.

Входные данные
В первой строке входного файла INPUT.TXT находятся три целых числа N (3 ≤ N ≤ 2000), M и К (1 ≤ K &lt; M ≤10^5), где N – общее количество городов, M – общее количество дорог, K – количество дорог, которое необходимо приобрести.

Далее следует M строк, в каждой из которых записаны три целых числа Ai, Bi и Ci, где Ai и Bi – номера городов, которые соединены дорогой (1 ≤ Ai, Bi ≤ N, Ai ≠ Bi), а Ci – стоимость дороги (1 ≤ Ci ≤ 10^6). Все числа в строках разделены одиночными пробелами.

Выходные данные
Выходной файл OUTPUT.TXT должен состоят из K строк, каждая из которых должна содержать одно число – номер приобретенной дороги. Дороги нумеруются в порядке их ввода начиная с единицы. Если решений несколько, то выведите любое из них.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |9 8 4               |4                   |
|  | 8 9 2              |1                   |
|  | 5 1 10             |8                   |
|  | 3 8 11             |3                   |
|1 | 2 5 7              |                    |
|  | 8 7 8              |                    |
|  | 5 6 12             |                    |
|  | 4 7 9              |                    |
|  | 3 5 5              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_656 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}