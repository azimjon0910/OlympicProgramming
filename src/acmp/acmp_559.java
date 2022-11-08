package acmp;

/* acmp.ru   |   Задание №559
		Сосиска в тесте
(Время: 1 сек. Память: 16 Мб Сложность: 48%)
Аня еще учится в школе, однако она уже много слышала о трудностях студенческой жизни. Ее это очень волнует, так как она задумывается о своем будущем и понимает, что после окончания школы ей придется учиться в ВУЗе. Из многочисленных рассказов она узнала, что излюбленной пищей студентов являются сосиски. А так как студенты часто испытывают недостатки в средствах, сосиски часто приходится делить. Однако никто не доверяет делению «на глаз», всегда найдется кто-нибудь, утверждающий, что его обделили.

Сосиска представляет собой практически плоскую фигуру (таковы уж студенческие столовые), которую можно описать следующим образом. Рассмотрим некоторый горизонтальный отрезок на плоскости, а также некоторый круг. Тогда, если центр круга провести по всем точкам отрезка от начальной до конечной, то любая точка, лежавшая, хотя бы в какой-то момент в круге, принадлежит сосиске. Можно описать сосиску и другим способом. Рассмотрим тот же отрезок и два круга одинакового радиуса с центрами в его крайних точках. Тогда точка принадлежит сосиске ровно в том случае, если она лежит на некотором отрезке, у которого каждый из концов лежит в одном из кругов.

Подумав, Аня понимает, что при наличии линейки можно легко отмерить нужное расстояние от левого края сосиски и вертикально отрезать необходимую часть. Но если при этом отмерять одинаковые расстояния, то те, кому достанутся крайние куски, получат меньше. Помогите Ане разместить разрезы в нужных местах сосиски, чтобы все получили поровну.

Входные данные
Входной файл INPUT.TXT содержит в первой строке два числа: d - расстояние между центрами крайних кругов и r - радиус каждого из них. Оба числа вещественные, положительные и не превосходят 10 000 и располагаются на первой строке входного файла. На второй строке находится n – количество студентов, претендующих на сосиску (2 ≤ n ≤ 1000).

Выходные данные
В выходном файле OUTPUT.TXT должно содержаться n-1 строка. В i-ой строке должно содержаться расстояние от левого края сосиски до правого края i куска (куски нумеруются слева направо). Все числа должны быть вычислены с точностью до 6 десятичных знаков после запятой.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |1 1                 |1.500000            |
|1 |2                   |                    |
|--|--------------------|--------------------|
|  |1 1                 |0.856810            |
|2 |4                   | 1.500000           |
|  |                    | 2.143190           |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_559 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}