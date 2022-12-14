package acmp;

/* acmp.ru   |   Задание №270
		Java vs C++
(Время: 1 сек. Память: 16 Мб Сложность: 34%)
Сторонники языков Java и C++ часто спорят о том, какой язык лучше для решения олимпиадных задач. Одни говорят, что в Java есть масса полезных библиотек для работы со строками, хорошо реализованы механизмы чтения и вывода данных, а так же радует встроенные возможности для реализации длинной арифметики. С другой стороны, С++ является классическим языком, скорость выполнения программ благодаря существующим компиляторам (например, Intel Compiler 10.0) гораздо выше, чем у Java.

Но сейчас нас интересует лишь небольшие отличия, а именно соглашения, которыми пользуются программисты при описании имен переменных в Java и C++. Известно, что для понимания значений переменных часто используют английские слова или даже целые предложения, описывающие суть переменных, содержащих те или иные значения. Приведем ниже правила описания переменных, которыми руководствуются программисты, реализующие программы на Java и C++.

В языке Java принято первое слово, входящее в название переменной записывать с маленькой английской буквы, следующее слово идет с большой буквы (только первая буква слова большая), слова не имеют разделителей и состоят только из английских букв. Например, правильные записи переменных в Java могут выглядеть следующим образом: javaIdentifier, longAndMnemonicIdentifier, name, nEERC.

В языке C++ для описания переменных используются только маленькие английские символы и символ «_», который отделяет непустые слова друг от друга. Примеры: java_identifier, long_and_mnemonic_identifier, name, n_e_e_r_c.

Вам требуется написать программу, которая преобразует переменную, записанную на одном языке в формат другого языка.

Входные данные
Во входном файле INPUT.TXT задано наименование переменной длиной от 1 до 100 символов, в котором могут встречаться только заглавные и строчные буквы английского алфавита, а также символ подчёркивания.

Выходные данные
В выходной файл OUTPUT.TXT требуется вывести аналог имени переменной в другом языке. Т.е. если переменная представлена в формате Java, то следует перевести в формат C++ и наоборот. В том случае, когда имя переменной не соответствует ни одному из вышеописанных языков, следует вывести «Error!»

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |long_and_mnemonic_identifier|longAndMnemonicIdentifier|
|2 |anotherExample      |another_example     |
|3 |i                   |i                   |
|4 |bad_Style           |Error!              |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_270 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}