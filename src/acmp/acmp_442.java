package acmp;

/* acmp.ru   |   Задание №442
		Шрифты
(Время: 1 сек. Память: 16 Мб Сложность: 45%)
Третий за неделю чек по заправке картриджа для принтера в бухгалтерии приняли без особого удовольствия. Судя по всему, надо серьезно подойти к вопросу экономного использования тонера - на учет должна быть поставлена каждая буква. Вам поручена реализация утилиты, которая будет обрабатывать HTML-документы старых версий и подсчитывать в них количество символов каждого размера. HTML-документ состоит из обычного текста и тегов - управляющих элементов, заключенных в угловые скобки. Для управления размером шрифта используется тег font с атрибутом size: &lt;font size="x"&gt;. Если x - натуральное число, то размер шрифта устанавливается равным x. Кроме того, x может иметь вид +y или -y, где y - целое положительное число. В этом случае размер шрифта соответственно увеличивается или уменьшается на y. Действие тега заканчивается с появлением соответствующего закрывающего тега &lt;/font&gt;. Все остальные теги вы не должны обрабатывать. Можете считать, что теги не содержат лишних пробельных символов. По умолчанию размер шрифта равен 10, и изменения не будут выводить его из интервала от 1 до 50.

Входные данные
Входной файл INPUT.TXT содержит описание HTML-документа, по длине не превосходящее 5000 символов.

Выходные данные
В выходной файл OUTPUT.TXT выведите для каждого шрифта, которым был написан хотя бы один непробельный символ, на отдельной строке через пробел его размер и количество соответствующих ему непробельных (с ASCII кодами не равными 9, 10, 13 и 32) символов в порядке возрастания размера.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |&lt;HTML&gt;        |2 4                 |
|  | &lt;BODY&gt;       | 7 12               |
|  | &lt;b&gt; Fonts: normal &lt;font size="2"&gt; tiny &lt;font size="+9"&gt; bigger| 10 20              |
|  | &lt;p&gt;          | 11 6               |
|  | &lt;/font&gt;&lt;/font&gt; as before | 15 10              |
|  | &lt;/b&gt;         |                    |
|1 | &lt;font size="+5"&gt;|                    |
|  | very big           |                    |
|  | &lt;font size="-8"&gt;|                    |
|  | smaller again      |                    |
|  | &lt;/font&gt; &lt;a href="..."&gt;...&lt;/a&gt;&lt;/font&gt;|                    |
|  | &lt;/BODY&gt;      |                    |
|  | &lt;/HTML&gt;      |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_442 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}