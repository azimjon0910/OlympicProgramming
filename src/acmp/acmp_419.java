package acmp;

/* acmp.ru   |   Задание №419
		Палиндром
(Время: 0,25 сек. Память: 16 Мб Сложность: 41%)
Одно из известных развлечений со словами - составление палиндромов. Палиндромом называется предложение, которое, после удаления из него всех пробелов и знаков препинания, читается одинаково справа налево и слева направо. Создатели одного известного текстового редактора пишут новую версию модуля для проверки орфографии. Они хотят реализовать возможность вывода подсказки для пользователя на тот случай, если он допустил опечатку при наборе какого-нибудь палиндрома. Конечно же, они решили обратиться именно к вам.

Более точно, по заданной строке нужно определить, может ли она быть результатом замены, удаления или добавления не более чем одного символа в некотором палиндроме. При этом строчные и прописные английские буквы не различаются, а все остальные символы должны игнорироваться.

Входные данные
Во входном файле INPUT.TXT содержится заданная строка. Гарантируется, что она содержит хотя бы одну букву. Длина строки не превосходит 10^5.

Выходные данные
В первой строке выходного файла OUTPUT.TXT выведите YES, если строка может быть получена каким-нибудь из описанных выше преобразований из некоторого палиндрома, и NO в противном случае. В случае положительного ответа во второй строке выведите какой-нибудь из палиндромов, в которых мог допустить опечатку пользователь.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |Never odd or even   |YES                 |
|1 |                    |NeVErODDoREVen      |
|--|--------------------|--------------------|
|2 |Eat it!             |NO                  |
|--|--------------------|--------------------|
|  |Mums are not set as a test on Erasmus.|YES                 |
|3 |                    |Sums are not set as a test on Erasmus.|
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_419 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}