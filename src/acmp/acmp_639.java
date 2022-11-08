package acmp;

/* acmp.ru   |   Задание №639
		TopCoder
(Время: 1 сек. Память: 16 Мб Сложность: 25%)
Некоторые из вас, наверное, слышали о сайте <a href="http://www.topcoder.com" target="_blank">http://www.topcoder.com</a>, на котором часто проводятся различные соревнования по программированию.

В некоторых из них участникам предлагаются три задачи, каждая из которых оценивается в некоторое количество баллов. В зависимости от того, насколько долго участник решал задачу, количество полученных им за нее баллов уменьшается. Как и в большинстве других соревнований, выигрывает участник, набравший наибольшее число баллов. Участники, набравшие одинаковое число баллов, считаются выступившими одинаково и их порядок в таблице итоговых результатов не важен. Из-за некоторых особенностей этих соревнований для предотвращения жульничества участники разделены в группы по 20 человек, называемые комнатами.

Ваша задача заключается в том, чтобы написать программу, которая по итоговым результатам в каждой комнате выводила бы суммарные итоговые результаты.

Входные данные
Первая строка входного файла INPUT.TXT содержит целое число n (1 ≤ n ≤ 100) - число комнат. Далее следуют n описаний итоговых результатов в комнатах.

Результаты в i-ой комнате заданы в следующем формате. Первая строка содержит целое число ni (1 ≤ ni ≤ 20)- количество участников в i-ой комнате. Следующие ni строк содержат информацию о выступлениях участников. j+1-ая строка описания результатов в i-ой комнате содержит информацию об участнике, занявшем в i-ой комнате j-ое место: разделенные одним пробелом вещественное число total^ij (-5000 ≤ total^ij ≤ 10000) и строку name^ij - соответственно количество набранных участником баллов и его имя. Имя участника имеет длину от 1 до 25 и может содержать только буквы английского алфавита, цифры и символ подчеркивания. При этом первый символ имени не является цифрой. Все вещественные числа заданы с двумя знаками после десятичной точки.

Гарантируется, что в каждой комнате участники упорядочены по невозрастанию набранных ими баллов.

Выходные данные
На первой строке выходного файла OUTPUT.TXT выведите N - суммарное число участников. На следующих N строках выведите информацию о выступлении участников. (k+1)-ая строка описания суммарных результатов должна содержать информацию об участнике, занявшем k-ое место: разделенные одним пробелом вещественное число totalk с двумя знаками после десятичной точки и строку namek - соответственно количество набранных участником баллов и его имя.

Не забудьте, что участники должны быть упорядочены по невозрастанию набранных ими баллов.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |2                   |11                  |
|  | 6                  | 909.94 Savior      |
|  | 909.94 Savior      | 867.15 Ying        |
|  | 439.51 tywok       | 448.12 natori      |
|  | 130.52 LimberG     | 439.51 tywok       |
|  | 0.00 BryanChen     | 195.32 aubergineanode|
|  | 0.00 angsa         | 130.52 LimberG     |
|1 | -75.00 The_Hedgehog| 0.00 angsa         |
|  | 5                  | 0.00 shalinmangar  |
|  | 867.15 Ying        | 0.00 BryanChen     |
|  | 448.12 natori      | -25.00 Excilus     |
|  | 195.32 aubergineanode| -75.00 The_Hedgehog|
|  | 0.00 shalinmangar  |                    |
|  | -25.00 Excilus     |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_639 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}