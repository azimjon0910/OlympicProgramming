package acmp;

/* acmp.ru   |   Задание №761
		Ковбои
(Время: 1 сек. Память: 16 Мб Сложность: 65%)
Всем известно, что в позапрошлом веке ковбои занимались перегоном скота. Перегон скота всегда считался опасным делом. Ковбой Джон, готовясь к очередному перегону, изучал план местности. Так как местность гористая, то добраться из одного поселения в другое можно только по дорогам, возможно через другие поселения. Главной опасностью на пути были бандиты, проживающие в разных населенных пунктах, и организующие группировки для нападения на ковбоев. Чтобы их разобщить, Джон разработал гениальный план полной изоляции поселений друг от друга.

Посоветовавшись с напарниками, Джон пришел к выводу, что временно дороги можно вывести из строя, устроив камнепад. Под покровом ночи можно выехать из одного населения в другое, остановиться где-то посреди дороги и устроить камнепад так, чтобы по этой дороге нельзя больше проехать никому. Камни падают позади повозки, поэтому обратной дороги нет. Но зато можно ехать в другой населенный пункт, и если из него существуют дороги, то и их можно вывести из строя.

Сам Джон этого сделать не может, только он знает тайные тропы и должен перегонять стадо. Поэтому он решил использовать наемников. Наемники есть в любом поселении и в любом количестве, однако, за каждого из них приходится платить не малую сумму, поэтому Джон хочет потратить как можно меньше денег. Помогите Джону определить минимальное число наемников, которые смогут привести в непригодность абсолютно все дороги и изолировать все поселения.

Входные данные
В первой строке входного файла INPUT.TXT находятся два целых неотрицательных числа N (0 &lt; N &lt; 1000) – количество поселений и M (0 ≤ M ≤ 100 000) – количество дорог, их соединяющих. Далее следует M строк, содержащих описание дорог. В i-й строке находятся два натуральных числа V и U (1 ≤ V, U ≤ N) – номера поселений, которые соединяет i-я дорога. Между двумя различными поселениями существует не более одной дороги, но может существовать несколько маршрутов. Нет дорог, которые образуют петлю, исходящую из поселения и ведущую в него же, не заходя в другие поселения. Не гарантируется, что существует маршрут между любой парой поселений. Маршрутом называется такая последовательность поселений s1-s2- … -sn, что любые два последовательных поселения si и si+1 соединены дорогой.

Выходные данные
В выходной файл OUTPUT.TXT выведите минимальное количество наемников, необходимое для изоляции всех поселений.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|1 |1 0                 |0                   |
|--|--------------------|--------------------|
|  |2 1                 |1                   |
|2 |1 2                 |                    |
|--|--------------------|--------------------|
|  |6 6                 |2                   |
|  |1 2                 |                    |
|  |2 3                 |                    |
|3 |1 3                 |                    |
|  |4 5                 |                    |
|  |5 6                 |                    |
|  |4 6                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_761 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}