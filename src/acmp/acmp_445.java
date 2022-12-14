package acmp;

/* acmp.ru   |   Задание №445
		Покупки
(Время: 1 сек. Память: 16 Мб Сложность: 56%)
Во многих фирмах, занимающихся торговлей, существует должность менеджера по закупкам. Как известно, они занимаются тем, что по торговому плану, представляющему собой список наименований товаров, для каждого из которых указано необходимое количество, закупает указанные в нем товары на оптовых базах. Торговый план при этом составляется руководством компании. Иногда у менеджеров по закупкам возникает желание принести выгоду не только своей фирме, но и себе.

Только что, как раз после подписания очередного торгового плана на заказ n наименований товаров, открылась новая оптовая база. Как это часто бывает сразу после открытия, ее цены на многие товары ниже заложенных в план. Наверное, этим можно воспользоваться.

На закупку товаров были выделены деньги из расчета того, что все товары будут закупаться на старой оптовой базе. Менеджер хочет, воспользовавшись возможностью покупать товары на новой базе, потратить как можно меньше денег на закупку требуемого количества товаров (не потраченные деньги он, конечно, сможет забрать себе).

Чтобы не вызывать сильных подозрений, производить на новой базе закупки, суммарная запланированная стоимость которых была больше, чем d денежных единиц, не следует. Осталось только рассчитать, какие товары и в каком количестве следует закупать на новой базе, чтобы осталось как можно больше не потраченных денег.

Входные данные
Первая строка содержит четыре числа: n (1 ≤ n ≤ 1000), d, а так же k1 и k2 (1 ≤ k1, k2 ≤ 1000) - количества наименований товаров, имеющихся на открытых ранее и новой базе соответственно. После этого идут n строк, каждая из которых содержит название товара в плане и его количество (положительное вещественное число). За ними следуют два блока из k1 и k2 строк соответственно, отделенные от предыдущего и разделенные между собой переводом строки - наименования товаров на базах и цены за единицу товара соответственно. Все цены являются положительными числами, даже на новой базе.

Названия товаров состоят из не более, чем 100 английских букв и символов подчеркивания, при этом регистр букв не учитывается. Вещественные числа заданы не более чем с двумя знаками после десятичной точки и по величине не превосходят 10^6. Гарантируется, что все товары из плана можно купить на старой базе. Считайте, что любой товар на любой базе можно покупать в любом дробном количестве, а также что при оплате можно использовать любое дробное количество денежных единиц.

Выходные данные
В выходной файл OUTPUT.TXT выведите n вещественных чисел, по одному на строке, задающих количество соответствующего товара, закупаемого на новой базе. На i-ой строке выведите количество товара, идущего i-ым в плане. Ошибки менее 0.01 будут игнорироваться.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4 11.00 5 4         |2.0000              |
|  | Salt 3             | 0.5000             |
|  | suGar 0.5          | 0.0000             |
|  | Powdered_MilK 7    | 0.0000             |
|  | fLoUR 8            |                    |
|  |                    |                    |
|  | flOuR 1            |                    |
|  | CINNAmOn 8         |                    |
|1 | saLt 0.5           |                    |
|  | SuGAr 20           |                    |
|  | poWdErED_MILk 3    |                    |
|  |                    |                    |
|  | FLOur 2            |                    |
|  | SALT 0.4           |                    |
|  | liQUID_HydRoGen 10000|                    |
|  | sUgAR 10           |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_445 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}