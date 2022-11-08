package acmp;

/* acmp.ru   |   Задание №958
		Осмотр королевства
(Время: 1 сек. Память: 16 Мб Сложность: 62%)
Давным давно в одном королевстве правил мудрый король. В том королевстве было n городов, любые два из которых были соединены дорогой. С целью безопасности дорожного движения, по каждой дороге разрешалось перемещаться только в одну сторону.

Король любил свое королевство. Каждый год он k раз осуществлял осмотр королевства. Каждый осмотр начинался в столице, затем король, перемещаясь по дорогам, посещал некоторые города, и, наконец, прибывал в курортный город на берегу моря, где он отдыхал после нелегкой работы. Таким образом король посещал каждый город в королевстве ровно один раз в течении года (за исключением столицы, где каждый осмотр начинался, и морского курорта, где каждый осмотр заканчивался).

Но годы уходили, и король становится стар. И ему было все сложнее делать эти k осмотров. Так что однажды он позвал своего министра транспорта и приказал ему сделать новую программу для осмотра королевства. Осмотр должен начинаться в столице и заканчиваться на морском курорте. Однако теперь весь этот путь должен посещать все города, которые ранее посещались в процессе k осмотров. И более того, если ранее некоторые города A и B посещались в процессе одного осмотра и причем A посещался до B, то новый осмотр также должен посещать A до B.

Помогите королю сделать осмотр королевства менее утомительным, разработайте новый маршрут для осмотра.

Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа: n и k (3 ≤ n ≤ 400, 1 ≤ k ≤ 100). Следующие n строк описывают дороги. Каждая строка содержит n символов, i-й символ i-й из этих строк равен '.'. Для всех j≠i j-й символ i-й строки равен '+', если дорога идет из j-го города в i-й, либо '-', если дорога идет из i-го города в j-й. Столица имеет номер 1, морской курорт имеет номер n.

Следующие k строк содержат описание маршрутов, по которым король традиционно осуществлял осмотр. Каждый маршрут описывается на одной строке. Описание содержит номера городов в том порядке, в котором король посещал города в процессе соответствующего осмотра. Гарантируется, что каждый осмотр начинается в столице, заканчивается в морском курорте, и следует по всем дорогам в корректном направлении. Каждый город, за исключением столицы и морского курорта, посещается ровно в одном маршруте. Ни один маршрут не идет непосредственно из столицы в морской курорт. Ни один маршрут не посещает в качестве промежуточного города столицу или морской курорт.

Выходные данные
В выходной файл OUTPUT.TXT выведите n чисел – порядок, в котором следует посещать города. Если выполнить требования короля невозможно, выведите &#x2212;1.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |7 2                 |1 3 2 4 5 6 7       |
|  | .------            |                    |
|  | +.+----            |                    |
|  | +-.-+++            |                    |
|  | +++.---            |                    |
|1 | ++-+.--            |                    |
|  | ++-++.-            |                    |
|  | ++-+++.            |                    |
|  | 1 3 4 7            |                    |
|  | 1 2 5 6 7          |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}