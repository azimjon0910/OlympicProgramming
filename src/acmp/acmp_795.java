package acmp;

/* acmp.ru   |   Задание №795
		Колесо Фортуны
(Время: 1 сек. Память: 16 Мб Сложность: 37%)
__EXERCISE__



Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5                   |5                   |
|1 |1 2 3 4 5           |                    |
|  |3 5 2               |                    |
|--|--------------------|--------------------|
|  |5                   |4                   |
|2 |1 2 3 4 5           |                    |
|  |15 15 2             |                    |
|--|--------------------|--------------------|
|  |5                   |5                   |
|3 |5 4 3 2 1           |                    |
|  |2 5 2               |                    |
|--|--------------------|--------------------|
----------------------------------------------

Пояснения к примерам
В первом примере возможны следующие варианты: можно придать начальную скорость колесу равную 3 или 4, что приведет к тому, что стрелка преодолеет одну границу между секторами, или придать начальную скорость равную 5, что позволит стрелке преодолеть 2 границы между секторами. В первом варианте, если закрутить колесо в одну сторону, то выигрыш получится равным 2, а если закрутить его в противоположную сторону, то – 5. Во втором варианте, если закрутить колесо в одну сторону, то выигрыш будет равным 3, а если в другую сторону, то – 4.</p> <p class="text">Во втором примере возможна только одна начальная скорость вращения колеса – 15 градусов в секунду. В этом случае при вращении колеса стрелка преодолеет семь границ между секторами. Тогда если его закрутить в одном направлении, то выигрыш составит 4, а если в противоположном направлении, то – 3.</p> <p class="text">Наконец, в третьем примере оптимальная начальная скорость вращения колеса равна 2 градусам в секунду. В этом случае стрелка вообще не сможет преодолеть границу между секторами, и выигрыш будет равен 5.



Решение.

*/


import java.util.Scanner;

public class acmp_795 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}