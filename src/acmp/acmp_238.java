package acmp;

/* acmp.ru   |   Задание №238
		Побег с космической станции
(Время: 1 сек. Память: 16 Мб Сложность: 46%)
Представьте, что вы состоите на службе во внешней разведке Межгалактического Альянса Республиканских Сил (МАРС). Одному из агентов разведки крупно не повезло, и он был захвачен на засекреченной космической базе. К счастью, внешней разведке МАРС удалось заполучить план этой базы. И вот теперь вам поручено разработать план побега.

База представляет собой прямоугольник размером NхM, со всех сторон окружённый стенами, и состоящий из квадратных отсеков единичной площади. База снабжена K выходами, до одного из которых агенту необходимо добраться. В некоторых отсеках базы находятся стены. Ваш агент может перемещаться из отсека в любой из четырех соседних с ним, если в том отсеке, куда он хочет переместиться, нет стены.

Кроме того, база снабжена системой гипертуннелей, способных перемещать агента из одного отсека базы (вход в гипертуннель) в другой (выход из гипертуннеля). Когда агент находится в отсеке, где есть вход в гипертуннель, он может (но не обязан) им воспользоваться.

Начальное положение вашего агента известно. Вам необходимо найти кратчайший путь побега (то есть путь, проходящий через минимальное количество отсеков).

Входные данные
В первой строке входного файла INPUT.TXT записаны числа N и M (2 ≤ N ≤ 100, 2 ≤ M ≤ 100), задающие размеры базы: N — количество строк в плане базы, M — количество столбцов. Во второй строке записаны начальные координаты агента XA,YA (1 ≤ XA ≤ N, 1 ≤ YA ≤ M). Первая координата задает номер строки, вторая — номер столбца. Строки нумеруются сверху вниз, столбцы слева направо. Далее следуют N строк по M чисел, задающих описание стен внутри базы: 1 соответствует стенке, 0 — её отсутствию. Далее в отдельной строке записано число H (0 ≤ H ≤ 1000) — количество гипертуннелей. В последующих H строках идут описания гипертуннелей. Каждый гипертуннель задается 4 числами: X1, Y1, X2, Y2 (1 ≤ X1,X2 ≤ N; 1 ≤ Y1,Y2 ≤ M) — координатами входа и выхода гипертуннеля. Никакие два гипертуннеля не имеют общего входа. После этого в отдельной строке следует число K (1 ≤ K ≤ 10) — количество выходов с базы. В последующих K строках идут описания выходов с базы. Каждый выход задается двумя координатами X и Y (1 ≤ X ≤ N; 1 ≤ Y ≤ M).

Гарантируется, что начальные координаты агента не совпадают ни с одним из выходов и он не стоит в отсеке, занятом стеной. Никакие входы и выходы гипертуннелей, а также выходы с базы не находятся в отсеках, занятых стенами. Никакой вход в гипертуннель не совпадает с выходом с базы.

Выходные данные
Если побег невозможен, выведите в выходной файл OUTPUT.TXT "Impossible". В противном случае следует вывести количество отсеков в кратчайшем пути побега.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4 5                 |4                   |
|  | 2 1                |                    |
|  | 0 0 0 0 0          |                    |
|  | 0 1 0 0 0          |                    |
|  | 0 0 0 0 0          |                    |
|1 | 0 0 0 0 0          |                    |
|  | 2                  |                    |
|  | 1 2 1 4            |                    |
|  | 3 1 1 4            |                    |
|  | 1                  |                    |
|  | 2 4                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_238 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}