package acmp;

/* acmp.ru   |   Задание №638
		Всероссийская олимпиада по информатике
(Время: 1 сек. Память: 16 Мб Сложность: 37%)
2127 год. Прошло уже много лет с тех пор, как состоялась первая Всероссийская олимпиада по информатике. Как и многие другие соревнования, наши олимпиады теперь проводятся в несколько дней. Теперь даже задача выбора подходящего времени для олимпиады представляет определенные трудности. Ведь на разных планетах, входящих в состав Российской Федерации используются разные способы отсчета времени: длина месяца, количество дней в неделе и те дни, по которым невозможно проведение олимпиады, могут различаться. Возникла необходимость написания программы, которая поможет решить эту задачу. И тогда в жюри вспомнят, что уже сейчас мы предвидели такую ситуацию и предложили вам решить подобную задачу.

В качестве первого шага найдите количество способов выбрать время проведения олимпиады.

Входные данные
В первой строке входного файла INPUT.TXT содержатся два целых числа n и k (1 ≤ k ≤ n ≤ 100000) - количество дней месяца и продолжительность олимпиады соответственно. Во второй строке задаются количество дней в неделе w, количество дней, запрещенных еженедельно, dw и день недели, на который приходится первый день месяца s (1 ≤ s ≤ w ≤ n, 0 ≤ dw ≤ w). Третья строка содержит dw номеров дней недели (например, выходных), в которые нельзя проводить олимпиаду. В четвертой строке записано количество дней месяца dm, не подходящих для проведения олимпиады по причинам отличным от еженедельного распорядка (например, такими днями являются государственные праздники). Последняя строка содержит dm целых чисел - номера этих дней. Дни месяца так же нумеруются начиная с 1. Заметим, что некоторые дни могут быть запрещенными сразу по обеим причинам.

Выходные данные
В выходной файл OUTPUT.TXT выведите единственное целое число - количество способов выбрать k подряд идущих дней, в которые возможно проведение олимпиады.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |31 3                |15                  |
|  | 7 1 7              |                    |
|1 | 7                  |                    |
|  | 2                  |                    |
|  | 1 9                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_638 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}