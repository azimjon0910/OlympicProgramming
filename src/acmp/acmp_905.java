package acmp;

/* acmp.ru   |   Задание №905
		Криптограмма
(Время: 1 сек. Память: 16 Мб Сложность: 31%)
На одной из лекций по информатике студент Петя узнал про новый шифр - простой замены. Он и на самом деле прост: в тексте каждая буква алфавита заменяется некоторой другой буквой того же алфавита (может быть, той же самой).

Петя написал письмо своему другу Васе. Письмо - это текст из нескольких строк, написанный на английском языке, с использованием только строчных английских букв и пробелов. В произвольное место, отдельной строкой Петя вставил ключевую фразу: "<b>the quick brown fox jumps over the lazy dog</b>", о которой они с Васей договорились заранее. После чего зашифровал письмо. Известно, что пробелы в письме не шифруются. Получив такое письмо, Вася сумеет его расшифровать и прочесть. Иногда Петя ошибается, и забывает вставить ключевую фразу. Увы, в этом случае прочесть письмо невозможно.

Так как процесс расшифровки трудоемок, Вася просит написать программу, с помощью которой он сможет быстро расшифровывать письмо от Пети.

Входные данные
Первая строка входного файла INPUT.TXT содержит целое число N – количество строк в письме (1 ≤ N ≤ 200). Далее идет N строк письма (пустые строки отсутствуют, в каждой строке не более 80 символов).

Выходные данные
В выходной файл OUTPUT.TXT в случае присутствия в тексте ключевой фразы выведите N строк расшифрованного сообщения. Если ключевой фразы нет, следует вывести «No solution» (без кавычек). Гарантируется, что есть не более одного способа расшифровки текста из входных данных.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |<td valign="top" style="font-size: 9pt">3|<td valign="top" style="font-size: 9pt">now is the time for all good men to come to the aid of the party|
|  | vtz ud xnm xugm itr pyy jttk gmv xt otgm xt xnm puk ti xnm fprxq| the quick brown fox jumps over the lazy dog|
|1 | xnm ceuob lrtzv ita hegfd tsmr xnm ypwq ktj| programming contests are fun arent they|
|  | frtjrpgguvj otvxmdxd prm iev prmvx xnmq|                    |
|--|--------------------|--------------------|
|  |<td valign="top" style="font-size: 9pt">3|<td valign="top" style="font-size: 9pt">No solution|
|  | vtz ud xnm xugm itr pyy jttk gmv xt otgm xt xnm puk ti xnm fprxq|                    |
|2 | xnm fffff lrtzv iia wwwfd tsmr xnm ypwq ktj|                    |
|  | frtjrpgguvj otvxmdxd prm iev prmvx xnmq|                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_905 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}