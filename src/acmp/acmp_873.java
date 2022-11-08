package acmp;

/* acmp.ru   |   Задание №873
		Шифр «Решетка»
(Время: 1 сек. Память: 16 Мб Сложность: 54%)
Рассмотрим перестановочный шифр, называемый «Решетка» («перестановочный» означает, что символы, составляющие послание, не изменяются, но меняются местами). Суть его заключается в следующем. Выбирается четное число n, затем в квадрате n&times;n вырезается n^2/4 клеток. При этом клетки выбираются так, что если наложить решетку на квадрат n х n, и затем последовательно развернуть ее на 90, 180 и 270 градусов, то каждый раз квадратики, совмещенные с вырезанными клетками, будут различны.

Такой квадрат n&times;n называется «правильным ключом». Ваша задача посчитать количество «правильных ключей». Так как это число может быть очень большим, мы предлагаем Вам найти его значение по модулю m. Ключи, получаемые поворотом на 90, 180 и 270 градусов считаются различными.

Входные данные
Входной файл INPUT.TXT содержит целые числа n и m (2 ≤ n, m ≤ 10^6), n - четно.

Выходные данные
В выходной файл OUTPUT.TXT выведите количество «правильных ключей» размером n&times;n по модулю m.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |2 100               |4                   |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_873 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}