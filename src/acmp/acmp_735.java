package acmp;

/* acmp.ru   |   Задание №735
		Циклическое k-расширение
(Время: 1 сек. Память: 16 Мб Сложность: 53%)
Вася недавно узнал, что такое циклическое k-расширение строки S. Его можно получить следующим образом: склеить k экземпляров строки S, а потом взять первые k символов результата.

Узнав это, Вася обрадовался, взял некоторую строку, и начал к ней применять описанную операцию, не запоминая, какое он каждый раз брал k.

Вам дана часть строки, получившейся у Васи. Ваша задача определить, не ошибся ли Вася в своих сложных преобразованиях, т. е., мог ли у него из первоначальной строки получиться ответ, содержащий данную строку в качестве подстроки.

Входные данные
В первой строке входного файла INPUT.TXT находится изначальная строка, которую Вася бережно записал перед тем, как приступить к своим действиям. Во второй строке находится подстрока результата, полученного Васей. Обе строки не пусты и по длине не превышают 5 000 символов. Строки могут состоять из больших и маленьких английских букв (с учетом регистра), а также цифр.

Выходные данные
В выходной файл OUTPUT.TXT выведите "NO", если можно точно сказать, что Вася ошибся, и "YES", если мог и не ошибиться.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |abc                 |YES                 |
|1 |abc                 |                    |
|--|--------------------|--------------------|
|  |abcd                |YES                 |
|2 |bcabc               |                    |
|--|--------------------|--------------------|
|  |abcabc              |NO                  |
|3 |abcA                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_735 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}