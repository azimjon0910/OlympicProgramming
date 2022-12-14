package acmp;

/* acmp.ru   |   Задание №435
		Несчастливые номера
(Время: 1 сек. Память: 16 Мб Сложность: 88%)
Обычно автобусный билет с номером, состоящим из 6 цифр, считается счастливым, если сумма первых трех цифр его номера была равна сумме трех последних. Школьник Вася очень любил получать счастливые билеты, однако это случалось не так часто. Поэтому для себя он изменил определение счастливого билета.

Счастливым он считал тот номер, сумма некоторых цифр которого равнялась сумме оставшихся цифр. В его представлении билет с номером 561743 счастливый, так как 5+1+4+3=6+7.

Вася вырос, но по привычке в номерах различных документов пытается найти признаки счастливого номера <img src="/images/sm1.gif" alt="Смайлик - улыбка" onclick="alert('А ну, не нажимай!!!')">. Для этого он расширил свое определение счастливого номера на N значные номера лицевых счетов и других документов, состоящих из цифр от 0 до K. Номер документа он называет счастливым, если сумма некоторых цифр этого номера равняется сумме оставшихся. Остальные номера для него несчастливые. К сожалению, несмотря на расширенное понимание “счастья”, несчастливых номеров остается еще много...

Вам предлагается определить количество несчастливых N-значных номеров, которые можно составить, используя цифры от 0 до K. В номерах допускается любое количество ведущих нулей.

Входные данные
Входной файл INPUT.TXT содержит описание вида номеров в виде двух чисел N и K, разделенных пробелом. (1 ≤ N ≤ 100, 1 ≤ K ≤ 9, N*K ≤ 300)

Выходные данные
В выходной файл OUTPUT.TXT выведите количество несчастливых номеров для заданных N и K.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |1 7                 |7                   |
|2 |4 3                 |164                 |
|3 |11 9                |50184219171         |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_435 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}