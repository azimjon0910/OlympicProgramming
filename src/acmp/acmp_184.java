package acmp;

/* acmp.ru   |   Задание №184
		Рабочее время
(Время: 1 сек. Память: 16 Мб Сложность: 35%)
Иван Иванович – очень ответственный, но очень рассеянный человек. Поэтому когда он начинает очередное дело, он на отдельном листочке пишет дату и время начала (например, 29.01. 10:30), а когда заканчивает, то так же на отдельном листочке – дату и время окончания (например, 02.02. 12:15). Листочки аккуратно укладываются в стопку один на другой. А так как одновременно Иван Иванович может заниматься только одним делом, то листочки однозначно упорядочены в стопке: листок начала какого-то дела, листок окончания этого дела, листок начала, листок окончания… и т.д. Дело начинается в начале минуты, указанной в листочке начала этого дела, а заканчивается в конце минуты, указанной на листочке окончания. Иван Иванович ходит на работу каждый день и его рабочий день продолжается с 10:00 до 18:00. Таким образом, пара листочков «18.11. 15:13» — «20.11. 10:27» была написана при начале и окончании дела длительностью 11ч.15м.

Однажды в конце декабря уборщица Дуся нечаянно уронила эту стопку на пол и, не зная важной закономерности их укладки, собрала листочки обратно в каком-то произвольном порядке. Иван Иванович обнаружил этот прискорбный факт только 31 декабря, когда ему надо было произвести учет своего рабочего времени за год. Год был невисокосный.

Помогите Ивану Ивановичу найти его суммарные затраты времени за год.

Входные данные
Входной файл INPUT.TXT содержит в первой строке число листочков K, (K – четное число, не большее 5000). Далее записаны K строк с данными на листочках в формате DD.MM. hh:mm, где DD – число, MM – номер месяца, hh – часы и mm – минуты.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать запись вида h:mm – количество часов и минут, отработанных Иваном Ивановичем. При этом число h ≥ 0 выводится без ведущих нулей, а число 0 ≤ mm ≤ 59 выводится с ведущими нулями.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |103:02              |
|  | 15.01. 17:00       |                    |
|1 | 16.01. 12:00       |                    |
|  | 11.02. 14:00       |                    |
|  | 30.01. 10:00       |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_184 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}