package acmp;

/* acmp.ru   |   Задание №937
		Макрос
(Время: 1 сек. Память: 16 Мб Сложность: 72%)
Однажды Бараш решил поучаствовать в литературном конкурсе программистов. Стихотворения принимались на четырех языках: Assembly, Foxy, Lispy, Prology. Как старый поэт-программист, Бараш признавал только Assembly. Поэтому писать пришлось на нем. Он запустил свой верный edit.com под Dos 6.22 и приступил к делу. Учитывая то, что Бараш был ленивым программистом, он вовсю использовал макросы. Это чрезвычайно ускоряло процесс стихосложения, так как у Бараша было множество заготовок, как и у любого старого поэта-программиста.

Стих получился шикарным, но, посовещавшись со своей подругой Нюшей, Бараш понял, что стих недоступен для понимания подавляющего большинства ценителей искусства. Поэтому Бараш решил пожертвовать формой произведения, дабы донести его высший смысл. Для этого он решил отказаться от использования макроопределений в своем произведении, выполнив макроподстановку.

Проблема в том, что одно стихотворное макроопределение могло содержать другие макроопределения. Также Бараш был большим любителем циклической макрогенерации, что не могло не отразиться в его произведениях. Ему не хватило душевных сил корежить произведение собственными руками, поэтому он попросил о помощи вас. Помогите Барашу!

Бараш использовал следующий формат макроопределений (вместо каждого символа ‘_’ во входном и выходном файлах будет стоять точно один пробел):

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5                   |                    |
|  | ##a_               | a                  |
|  | #a_{a}##a_         |                    |
|1 | #b_{##a__#a_{b}##a_#c_{##a_}_##c_}| a_b_b              |
|  | ##b_##c_           | a                  |
|  | ##a_               |                    |
|--|--------------------|--------------------|
|  |4                   |a                   |
|  | #a_{#b_{#c_{a}##c_}##b_}##a_| b                  |
|2 | #e_{#b_{#c_{b}##c_}##b_}##e_| c                  |
|  | #f_{#b_{#c_{c}##c_}##b_}##f_| abc                |
|  | ##a_##e_##f_##b_##c_|                    |
|--|--------------------|--------------------|
----------------------------------------------

Примечание
В примерах символы пробелов во входных и выходных данных обозначены символом "_" (подчеркивание).



Решение.

*/


import java.util.Scanner;

public class acmp_937 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}