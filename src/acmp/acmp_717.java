package acmp;

/* acmp.ru   |   Задание №717
		Производство деталей
(Время: 2 сек. Память: 64 Мб Сложность: 48%)
Предприятие «Авто-2010» выпускает двигатели для известных во всем мире автомобилей. Двигатель состоит ровно из n деталей, пронумерованных от 1 до n, при этом деталь с номером i изготавливается за pi секунд. Специфика предприятия «Авто-2010» заключается в том, что там одновременно может изготавливаться лишь одна деталь двигателя. Для производства некоторых деталей необходимо иметь предварительно изготовленный набор других деталей.

Генеральный директор «Авто-2010» поставил перед предприятием амбициозную задачу – за наименьшее время изготовить деталь с номером 1, чтобы представить ее на выставке.

Требуется написать программу, которая по заданным зависимостям порядка производства между деталями найдет наименьшее время, за которое можно произвести деталь с номером 1.

Входные данные
Первая строка входного файла INPUT.TXT содержит число n (1 ≤ n ≤ 100000) – количество деталей двигателя. Вторая строка содержит n натуральных чисел p1, p2 … pn , определяющих время изготовления каждой детали в секундах. Время для изготовления каждой детали не превосходит 10^9 секунд.

Каждая из последующих n строк входного файла описывает характеристики производства деталей. Здесь i-ая строка содержит число деталей ki, которые требуются для производства детали с номером i, а также их номера. Сумма всех чисел ki не превосходит 200000.

Известно, что не существует циклических зависимостей в производстве деталей.

Выходные данные
В первой строке выходного файла OUTPUT.TXT должны содержаться два числа: минимальное время (в секундах), необходимое для скорейшего производства детали с номером 1 и число k деталей, которые необходимо для этого произвести. Во второй строке требуется вывести через пробел k чисел – номера деталей в том порядке, в котором следует их производить для скорейшего производства детали с номером 1.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |300 2               |
|  |100 200 300         |2 1                 |
|1 |1 2                 |                    |
|  |0                   |                    |
|  |2 2 1               |                    |
|--|--------------------|--------------------|
|  |2                   |5 2                 |
|  |2 3                 |2 1                 |
|2 |1 2                 |                    |
|  |0                   |                    |
|--|--------------------|--------------------|
|  |4                   |9 3                 |
|  |2 3 4 5             |3 2 1               |
|  |2 3 2               |                    |
|3 |1 3                 |                    |
|  |0                   |                    |
|  |2 1 3               |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_717 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}