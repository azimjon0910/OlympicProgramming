package acmp;

/* acmp.ru   |   Задание №657
		Hello space!
(Время: 1 сек. Память: 16 Мб Сложность: 60%)
Ученые из центра космических наблюдений зафиксировали полезный информационный сигнал, который поступает из далекой галактики. Оказалось, что информацию передают некоторые разумные существа, посылая в сторону Земли луч, яркость которого изменяется с обычной на повышенную, и наоборот. Если информация не передается, то яркость луча обычная и не меняется во времени (пустой сигнал).

Ученым удалось распознать правило, по которому инопланетяне кодируют полезный сигнал. Он является двоичным кодом, причем в течение сеанса связи передача каждого бита сигнала занимает одно и то же вещественное время T. Для передачи бита “1” яркость луча в течение времени T/2 повышенная, а в течение второй половины времени T/2 – обычная. Передача бита “0” осуществляется наоборот: в течение первой половины времени T/2 яркость луча обычная, а в течение второй половины времени T/2 – повышенная. Ученые считают, что первый бит полезного сигнала всегда равен единице, а последний бит – нулю. Для наглядности пример передачи каждого из битов представлен на рисунке:

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |2                   |110                 |
|  | 5                  |ERROR               |
|  | 42                 |                    |
|  | 43                 |                    |
|  | 39                 |                    |
|  | 93                 |                    |
|1 | 44                 |                    |
|  | 5                  |                    |
|  | 10                 |                    |
|  | 10                 |                    |
|  | 22                 |                    |
|  | 10                 |                    |
|  | 30                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_657 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}