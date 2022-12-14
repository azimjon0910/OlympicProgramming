package acmp;

/* acmp.ru   |   Задание №554

            Пицца
(Время: 1 сек. Память: 16 Мб Сложность: 20%)

Пицца – любимое лакомство Васи, он постоянно покупает и с удовольствием употребляет различные сорта этого великолепного блюда. Однажды, в очередной раз, разрезая круглую пиццу на несколько частей, Вася задумался: на какое максимальное количество частей можно разрезать пиццу за N прямых разрезов?

Помогите Васе решить эту задачу, определив максимальное число не обязательно равных кусков, которые может получить Вася, разрезая пиццу таким образом.


Входные данные

Входной файл INPUT.TXT содержит натуральное число N – число прямых разрезов пиццы (N ≤ 1000).


Выходные данные

В выходной файл OUTPUT.TXT выведите ответ на задачу.


Пример:
---------------------------------
|№ |  INPUT.TXT  |  OUTPUT.TXT  |
|-------------------------------|
|1 |2            |4             |
|2 |3            |7             |
---------------------------------


Решение.
Начнем с одного разреза. Тут все понятно – получим 2 куска. Далее режем второй раз. Нужно резать так, чтобы вторая линия разреза пересекала первую. Тогда получим 4 кусков. Третью линию проводим так же – пересекаем две предыдущие линии. Получится 7 кусков. И так далее. Каждый раз линию разреза проводим так, чтобы она пересекала все предыдущие.
Давайте посмотрим на последовательность:
n    куски
0    1
1    2
2    4
3    7
4    11
5    16
... 
Видем, что количество кусков получается на единицы больше, чем сумма арифметической прогрессии натуральных чисел от 1 до n. Другими словами каждый разрез дает (1+n)*n/2 + 1.

*/

import java.util.Scanner;

public class acmp_554 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.print(1 + (1 + n) * n / 2);
    }
}
