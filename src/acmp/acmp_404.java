package acmp;

/* acmp.ru   |   Задание №404
		Игра с камнями
(Время: 2 сек. Память: 16 Мб Сложность: 63%)
Правила игры: исходно на столе располагается кучка, содержащая N камней. Два игрока по очереди берут камни из кучки. Если перед ходом игрока кучка содержит K камней, игрок может взять из нее от 1 до [sqrt(K)] (целую часть от квадратного корня из K) камней, включительно. Например, если в кучке 10 камней, разрешается взять 1, 2 или 3 камня. Если в кучке не осталось камней, то игрок, который должен сделать ход, проигрывает.

Требуется определить: сможет ли первый игрок выиграть, если оба игрока будут придерживаться оптимальной стратегии.

Входные данные
Входной файл INPUT.TXT содержит натуральное число N – число камней в кучке (N ≤ 10^12).

Выходные данные
В выходной файл OUTPUT.TXT выведите WIN, если первый игрок может выиграть вне зависимости от действий второго игрока, либо LOSE, если второй игрок может заставить первого игрока проиграть.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |3                   |WIN                 |
|2 |5                   |LOSE                |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_404 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}