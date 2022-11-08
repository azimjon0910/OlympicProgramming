package acmp;

/* acmp.ru   |   Задание №711
		Соревнование картингистов
(Время: 1 сек. Память: 16 Мб Сложность: 18%)
После очередного этапа чемпионата мира по кольцевым автогонкам на автомобилях с открытыми колесами Формула-А гонщики собрались вместе в кафе, чтобы обсудить полученные результаты. Они вспомнили, что в молодости соревновались не на больших болидах, а на картах – спортивных автомобилях меньших размеров.

Друзья решили выяснить победителя в одной из гонок на картах. Победителем гонки являлся тот гонщик, у которого суммарное время прохождения всех кругов трассы было минимальным.

Поскольку окончательные результаты не сохранились, то каждый из n участников той гонки вспомнил и выписал результаты прохождения каждого из m кругов трассы. К сожалению, по этой информации гонщикам было сложно вычислить победителя той гонки. В связи с этим они попросили сделать это вас.

Требуется написать программу, которая вычислит победителя гонки на картах, о которой говорили гонщики.

Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа n и m (1 ≤ n, m ≤ 100). Последующие 2&#x2219;n строк описывают прохождение трассы каждым из участников. Описание прохождения трассы участником состоит из двух строк. Первая строка содержит имя участника с использованием только английских букв (строчных и заглавных). Имена всех участников различны, строчные и заглавные буквы в именах различаются.

Вторая строка содержит m положительных целых чисел, где каждое число – это время прохождения данным участником каждого из m кругов трассы (каждое из этих чисел не превосходит 1000). Длина каждой строки с именем участника не превышает 255 символов.

Выходные данные
В выходной файл OUTPUT.TXT необходимо вывести имя победителя гонки на картах. Если победителей несколько, требуется вывести имя любого из них.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5 3                 |Vasya               |
|  | Sumaher            |                    |
|  | 2 1 1              |                    |
|  | Barikelo           |                    |
|  | 2 1 2              |                    |
|1 | Olonso             |                    |
|  | 1 2 1              |                    |
|  | Vasya              |                    |
|  | 1 1 1              |                    |
|  | Fedya              |                    |
|  | 1 1 1              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_711 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}