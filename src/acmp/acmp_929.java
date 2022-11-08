package acmp;

/* acmp.ru   |   Задание №929
		Игральные кубики
(Время: 1 сек. Память: 16 Мб Сложность: 15%)
Юный математик Матвей интересуется теорией вероятностей, и по этой причине у него всегда есть с собой несколько стандартных шестигранных игральных кубиков. Стандартный шестигранный кубик имеет три противолежащих пары граней, которые размечены таким образом, что напротив грани с числом 1 находится грань с числом 6, напротив грани с числом 2 — грань с числом 5 и напротив грани с числом 3 — грань с числом 4.

Анализируя различные игры с шестигранными кубиками, Матвей придумал новую игру. В эту игру играют два игрока, и проходит она следующим образом: первый игрок бросает один или несколько стандартных кубиков (количество кубиков он определяет сам). После этого первому игроку начисляется количество очков, равное сумме чисел, оказавшихся на верхних гранях всех кубиков, а второму игроку — сумма чисел, оказавшихся на нижних гранях этих кубиков. Побеждает тот, кто набрал больше очков.

Например, если был брошен один кубик, и на верхней его грани выпало число два, то первый игрок получает два очка, а второй — пять. В свою очередь, если было брошено два кубика и на их верхних гранях выпало по единице, то первый игрок получает также два очка, а второй игрок – двенадцать очков, так как на нижних гранях этих кубиков оказались шестерки.

Матвей рассказал об этой игре своему другу, юному информатику Фоме, и они начали играть в неё через Интернет. Поскольку Фома не видит результат броска и не знает, сколько кубиков бросает Матвей как первый игрок, то о набранных каждым игроком очках он узнает только от Матвея. Чтобы проверить достоверность этой информации, Фома решил узнать, какое минимальное и максимальное количество очков мог получить он, как второй игрок, если известно, сколько очков набрал Матвей.

Требуется написать программу, которая по количеству очков, набранных первым игроком после броска, определяет наименьшее и наибольшее количество очков, которые может получить второй игрок за этот бросок.

Входные данные
Входной файл INPUT.TXT содержит одно натуральное число n — количество очков, которые получил первый игрок (n ≤ 10^10).

Выходные данные
В выходной файл OUTPUT.TXT выведите два разделенных пробелом целых числа: минимальное и максимальное количество очков соответственно, которые мог набрать второй игрок при таком броске кубиков.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |2                   |5 12                |
|2 |36                  |6 216               |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_929 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}