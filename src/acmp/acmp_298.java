package acmp;

/* acmp.ru   |   Задание №298
		Стрелок
(Время: 1 сек. Память: 16 Мб Сложность: 28%)
Стрелок стоит в центре стрельбища. На стрельбище несколько мишеней. Пули стрелка пробивают мишени насквозь, не теряя скорости, и могут поразить все мишени, стоящие на одной линии.

Будем считать, что стрелок стоит в центре начала координат. Известны координаты всех мишеней (для простоты будем считать их геометрические размеры пренебрежимо малыми). Определите минимальное число выстрелов, необходимых стрелку для поражения всех мишеней.

Входные данные
Первая строка входного файла INPUT.TXT содержит натуральное число N – количество мишеней (N ≤ 20). Далее идет N строк с информацией о координатах каждой мишени, при этом в каждой строке указывается два целых числа через пробел X и Y (-10 ≤ X, Y ≤ 10).

Выходные данные
В выходной файл OUTPUT.TXT выведите одно целое число – наименьшее количество выстрелов, необходимых для поражения всех мишеней.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |4                   |
|  | 2 2                |                    |
|1 | -2 2               |                    |
|  | -2 -2              |                    |
|  | 2 -2               |                    |
|--|--------------------|--------------------|
|  |6                   |5                   |
|  | 2 2                |                    |
|  | -2 2               |                    |
|2 | -2 -2              |                    |
|  | 2 -2               |                    |
|  | 1 1                |                    |
|  | -1 3               |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_298 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}