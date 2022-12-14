package acmp;

/* acmp.ru   |   Задание №985
		Объявление массивов
(Время: 2 сек. Память: 16 Мб Сложность: 47%)
В языке Java для удобства работы любой объявленный массив является объектом, который содержит некоторую вспомогательную информацию и собственно сам массив.

Рассмотрим внутреннюю структуру такого объекта. В нем содержится 16 байт вспомогательной информации, 4 байта уходит на хранение длины массива, а затем сам массив, который занимает length*size памяти, где length – это его длина, а size – размер объектов хранящихся в массиве.

Если мы объявляем в программе двухмерный массив, то у нас создастся объект, который будет содержать в себе массив, каждый элемент которого будет являться одномерным массивом. Так же не следует забывать, что на каждый объект создается внешняя ссылка размером 4 байта.

Аналогично, при объявлении массивов размерности k будет создан массив, каждым элементом которого является массив размерности k&#x2212;1.

Ваша задача – по данным о размерах примитивных типов, из которых состоят массивы, выяснить, сколько памяти занимает каждый из заданных массивов.

Входные данные
В первой строке входного файла INPUT.TXT содержится количество различных примитивных типов N (1 ≤ N ≤ 100). В следующих N строках содержатся названия примитивных типов, состоящие из маленьких английских букв, длиной не более 30 символов, и через пробел размер типа в байтах. Размеры типов не превосходят 2^31&#x2212;1 байт. Следующая строка содержит число объявленных массивов M (1 ≤ M ≤ 1000). В следующих M строках содержатся описания массивов в формате «type name[number1] ... [numberk];», где type – один из примитивных типов, описанных выше, name – имя массива, состоящее из маленьких английских букв, длиной не более 30 символов, 1 ≤ numberi ≤ 1000. Размерность массива не превышает 50.

Выходные данные
В выходной файл OUTPUT.TXT выведите в M строках информацию об объеме памяти в байтах, занимаемым каждым из массивов, согласно последовательности, определенной во входных данных.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |25                  |
|  | byte 1             | 184                |
|  | short 2            | 42424              |
|  | int 4              | 1440               |
|  | long 8             |                    |
|1 | 4                  |                    |
|  | byte a[1];         |                    |
|  | short b[2][2][2];  |                    |
|  | int c[100][100];   |                    |
|  | long a[177];       |                    |
|--|--------------------|--------------------|
----------------------------------------------

Пояснение
Первый массив занимает 4 байта на внешнюю ссылку, 16 вспомогательных байт, 4 байта на хранение длины массива и 1 байт на сам массив. Итого 25 байт.</p> <p class="text">Третий массив занимает 4 байта на внешнюю ссылку, 16 вспомогательных байт, 4 байта на хранение длины массива и 100*size байт на массив, где size – размер одномерного массива из 100 чисел типа int. В данном случае size = 4 + 16 + 4 + 4*100. Итого 42424 байт.



Решение.

*/


import java.util.Scanner;

public class acmp_985 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}