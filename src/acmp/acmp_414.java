package acmp;

/* acmp.ru   |   Задание №414
		Расследование
(Время: 0,5 сек. Память: 16 Мб Сложность: 40%)
В городском управлении полиции одного прибрежного города ведется расследование крупного дела, в котором могут быть замешаны сотрудники полиции. Было принято решение о тайной установке оборудования для просмотра информации, поступающей через Интернет. Под подозрение попадают два отдела, но добиться выделения денег на покупку двух комплектов оборудования не удалось. К счастью, внутренняя сеть управления имеет древовидную структуру, то есть каждый отдел имеет выход в Интернет через какой-либо другой отдел. Исключение составляет отдел по борьбе с компьютерными преступлениями, который имеет непосредственный доступ в Интернет по модемной линии.

Можно было бы установить оборудование для слежения прямо в этом отделе, но для предотвращения злоупотреблений лучше найти такое расположение, чтобы нарушалась секретность как можно меньшего количества лишних отделов.

Как наиболее опытному в подобных вопросах сотруднику, решение этой задачи поручили вам. Подчиненные уже пронумеровали все отделы натуральными числами, начиная с 1, первый номер присвоен отделу по борьбе с компьютерными преступлениями.

Входные данные
Первая строка входного файла INPUT.TXT содержит натуральное число N (N ≤ 30000) – количество отделов. Во второй строке записаны номера двух отделов, за которыми необходимо установить слежение. На третьей строке находятся n-1 натуральных чисел, i-е из них не больше i и задает номер отдела, к которому подсоединен отдел i + 1.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число – номер отдела, в котором следует установить следящее оборудование.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |3                   |
|1 | 3 4                |                    |
|  | 1 1 3              |                    |
|--|--------------------|--------------------|
|  |8                   |1                   |
|2 | 3 6                |                    |
|  | 1 1 2 4 5 1 1      |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_414 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}