package acmp;

/* acmp.ru   |   Задание №718
		Новое слово в рекламе
(Время: 1 сек. Память: 64 Мб Сложность: 71%)
В наши дни предоставление поверхностей заборов и стен промышленных зданий рекламодателям – уже не оригинальный способ получить дополнительный заработок, а нечто само собой разумеющееся.

Небольшая компания «Домострой» также решила выйти на этот рынок и стала предлагать место для рекламы на своих блоках заборов. Блок представляет собой параллелепипед размером 1&times;1&times;L, на одной из сторон которого есть место для рекламы – пространство размера 1&times;L, в которое можно вписать ровно L букв английского алфавита.

К сожалению, иногда сделки у компании срывались, и заранее подготовленные блоки с рекламой отправлялись на склад. Со временем там скопилось приличное количество блоков различных типов (блоки разных типов отличаются друг от друга только надписью), поэтому было решено использовать их вторично.

Была предложена следующая идея: если поставить несколько блоков друг на друга и закрасить ненужные буквы, то, читая сверху вниз и слева направо, можно будет прочитать какой-нибудь другой текст, как показано на рисунке.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 4                 |3                   |
|  |tiet                |1 2 3               |
|1 |oink                |                    |
|  |ezin                |                    |
|  |zenit               |                    |
|--|--------------------|--------------------|
|  |2 11                |1                   |
|  |sillysample         |2                   |
|2 |happysample         |                    |
|  |sam                 |                    |
|--|--------------------|--------------------|
|  |2 3                 |2                   |
|  |baa                 |2 2                 |
|3 |aab                 |                    |
|  |bb                  |                    |
|--|--------------------|--------------------|
|  |2 3                 |-1                  |
|  |aaa                 |                    |
|4 |bbb                 |                    |
|  |cc                  |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_718 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}