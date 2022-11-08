package acmp;

/* acmp.ru   |   Задание №999
		Диверсия
(Время: 5 сек. Память: 16 Мб Сложность: 70%)
В королевстве Далеком n городов, соединенных m двусторонними дорогами. Некоторые дороги вымощены камнем, а другие представляют собой лишь обычные проселочные дороги. Столица королевства расположена в городе номер 1. Дороги устроены таким образом, что можно из любого города добраться до любого другого, перемещаясь исключительно по вымощенным камнем дорогам, причем количество каменных дорог минимальное возможное. Проселочные же дороги были построены таким образом, что если каменная дорога заблокирована или уничтожена, то все равно можно добраться из любого города до любого другого по дорогам.

Обозначим количество каменных дорог, по которым требуется проехать, чтобы попасть из города u в город v как s(u, v). Дороги подчиняются следующему правилу: если два города u и v соединены дорогой (неважно, каменной или проселочной), то либо s(1, u) + s(u, v) = s(1, v), либо s(1, v) + s(v, u) = s(1, u).

Король соседнего королевства планирует напасть на Далекое. В качестве начала операции предполагается уничтожить некоторые дороги. Расчеты показали, что финансирования, выделенного министерству атаки, достаточно, чтобы уничтожить ровно одну каменную и одну проселочную дорогу. Король хотел бы уничтожить такую пару дорог, чтобы после этого хотя бы для каких-нибудь двух городов стало невозможно добраться из одного города в другой.

Теперь он просит министра атаки посчитать количество возможных диверсионных планов. Однако министр атаки обучен только атаковать, считать для него слишком сложно. Помогите ему!

Входные данные
Первая строка входного файла INPUT.TXT содержит n и m – количество городов и дорог, соответственно (3 ≤ n ≤ 20 000, m ≤ 100 000). Следующие m строк описывают дороги, каждая строка содержит три целых числа – номера городов, соединенных соответствующей дорогой, и 1, если соответствующая дорога вымощена камнем, или 0, если соответствующая дорога – проселочная. Никакие два города не соединены более чем одной дорогой, никакая дорога не соединяет город сам с собой.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно целое число – количество способов организовать диверсию.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |6 7                 |4                   |
|  | 1 2 1              |                    |
|  | 2 3 1              |                    |
|  | 1 4 0              |                    |
|1 | 3 4 1              |                    |
|  | 4 5 1              |                    |
|  | 3 6 0              |                    |
|  | 5 6 1              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_999 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}