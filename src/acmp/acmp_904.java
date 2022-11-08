package acmp;

/* acmp.ru   |   Задание №904
		Crimsonland
(Время: 1 сек. Память: 16 Мб Сложность: 56%)
Гриша третий день играет в Crimsonland, он «застрял» на самом сложном уровне: Panic Rush, так как ему постоянно не хватает боеприпасов.

На уровне Panic Rush есть несколько особенностей. Персонаж Гриши вооружён плазменным дробовиком с углом атаки &#x3b1; и неограниченной дальностью. Все монстры, попадающие в угол атаки, при выстреле тут же погибают. Дробовик достаточно тяжёлый, переносить его нельзя, но можно быстро поворачивать вокруг своей оси на любой угол. Монстры появляются все одновременно в произвольных точках карты, при этом их местоположение не совпадает с местоположением персонажа.

Гриша нашел в интернете чит-код, и теперь он знает, где появятся монстры и какой будет угол атаки дробовика. Помогите Грише подсчитать минимальное количество выстрелов, необходимых для отражения атаки.

Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа N и &#x3b1;, где N (1 ≤ N ≤ 10^4) — количество монстров, а &#x3b1; (1 ≤ &#x3b1; ≤ 180) — угол атаки дробовика в градусах. В следующей строке указано местоположение персонажа X0 и Y0, затем в N строках описаны координаты появления монстров Xi и Yi (все координаты — целые числа, не превосходящие по модулю 10^4).

Выходные данные
В выходной файл OUTPUT.TXT выведите наименьшее количество выстрелов, необходимых для отражения атаки.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4 90                |2                   |
|  | 1 1                |                    |
|  | 2 2                |                    |
|1 | 0 2                |                    |
|  | 0 0                |                    |
|  | 2 0                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_904 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}