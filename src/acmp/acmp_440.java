package acmp;

/* acmp.ru   |   Задание №440
		Биатлон
(Время: 1 сек. Память: 16 Мб Сложность: 24%)
На Зимних Олимпийских Играх традиционно проводятся соревнования по биатлону. Как известно, этот вид спорта содержит лыжные гонки и стрельбу по мишеням из винтовки. На каждом огневом рубеже расположены 5 мишеней. Каждая из них имеет форму круга радиусом 10 см, а расстояния между центрами соседних мишеней одинаковы и равны 25 см. Центры мишеней при этом расположены на одной горизонтали.

Введем прямоугольную систему координат так, что начало координат расположено в центре самой левой мишени, ось Ox направлена вправо, а ось Oy - вверх. Таким образом, центры мишеней имеют координаты (0, 0), (25, 0), (50, 0), (75, 0) и (100, 0).

Для информационного обеспечения проведения соревнований было решено разработать систему подсчета количества пораженных мишеней. Эта система по точкам, в которые попали пули после выстрелов спортсмена, должна определять количество пораженных мишеней. Мишень считается пораженной, если в нее попала хотя бы одна пуля (при этом, разумеется, если в мишень попали две или больше пуль, то попадание считается только один раз).

На спринтерской гонке на каждом огневом рубеже у спортсмена есть 5 пуль. Вам даны координаты точек, в которые попали пули после выстрелов спортсмена. Определите количество пораженных мишеней.

Входные данные
Входной файл INPUT.TXT содержит ровно пять строк: i-ая из них содержит два целых числа xi и yi - координаты точки, в которую попала пуля после i-ого выстрела спортсмена. Все числа во входном файле не превосходят 1000 по модулю.

Выходные данные
В выходной файл OUTPUT.TXT выведите единственное число – число пораженных мишеней.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |0 0                 |5                   |
|  | 25 0               |                    |
|1 | 50 0               |                    |
|  | 75 0               |                    |
|  | 100 0              |                    |
|--|--------------------|--------------------|
|  |0 0                 |3                   |
|  | 0 0                |                    |
|2 | 0 0                |                    |
|  | 75 0               |                    |
|  | 100 0              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_440 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}