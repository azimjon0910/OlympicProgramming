package acmp;

/* acmp.ru   |   Задание №556
		Есть ли жизнь на Марсе?
(Время: 1 сек. Память: 16 Мб Сложность: 37%)
- Ты врешь, Коля! На Марсе жизни нет! Кто тебе такую чушь сказал?

- Петя. А ему сказал Саша.

- Да от Пети я в жизни правдивого слова не слышал! Ему что ни скажут, он все переврет. Да и Саше откуда знать?

- А Саше рассказал про это Владимир Алексеевич, наш учитель биологии.

- Ну, Владимиру Алексеевичу-то можно верить... Только вряд ли он так сказал, это либо Саша, либо Петя придумал. А может, это ты меня разыгрываешь?..

- Минуточку, ребята, - вмешался подошедший к спорящим учитель математики, Глеб Тимофеевич, - давайте подойдем к проблеме формально. Допустим, что все диалоги - Владимира Алексеевича с Сашей, Саши с Петей и Пети с Колей - действительно имели место. Пронумеруем ребят числами 1, 2 и 3. Предположим также, что каждый из ребят независимо друг от друга передал полученную информацию относительно жизни на Марсе верно с вероятностью pi, а соврал с вероятностью qi = 1 - pi для i = 1, 2, 3. Вероятности – это вещественные числа от нуля до единицы; событие, имеющее вероятность 0, никогда не произойдет, событие же с вероятностью 1 произойдет без всякого сомнения. Зная, что Коля после этого объявил, что жизнь на Марсе все-таки есть, найдите по данным pi вероятность того, что так действительно сказал Владимир Алексеевич.

- А как искать эту вероятность? И что значит независимо друг от друга? – растерялись ребята.

- Независимость означает, что действие одного из ребят никак не отражается на том, как поступят другие. К примеру, Пете неважно, соврал ли Саша - в любом случае он передаст сказанное Сашей правильно с вероятностью ровно p2. Задача несложная, и можно рассмотреть все восемь возможных случаев. Первый случай - все ребята говорили правду, и вероятность этого случая равна p1&#x2219;p2&#x2219;p3. В этом случае жизнь на Марсе, без сомнения, есть - Владимиру Алексеевичу мы верим, а ребята передали его слова правильно. Второй случай, когда соврал только Саша, имеет место с вероятностью q1&#x2219;p2&#x2219;p3, и в этом случае жизни на Марсе нет. Далее переберем остальные шесть случаев, каждый раз перемножая соответствующие вероятности, а потом просуммируем вероятности тех случаев, в которых слова учителя переданы правильно. То, что вероятности для отдельных ребят в каждом случае надо перемножить - это и есть формальное определение независимости. Ну, в скольких случаях будет передано именно то, что говорил Владимир Алексеевич?

- В одном …

- А вот и нет. Например, если Петя и Коля соврали, а Саша сказал правду, то истина, дважды исказившись, дойдет до нас в неизменном виде. И вообще, четное количество отрицаний, примененных к утверждению, дает само утверждение. В нашей задаче случаев с четным количеством отрицаний - четыре, и итоговая вероятность равна p1&#x2219;p2&#x2219;p3+q1&#x2219;q2&#x2219;p3+q1&#x2219;p2&#x2219;q3+p1&#x2219;q2&#x2219;q3.

- То есть если Петя и Коля точно соврут, а Саша точно скажет правду, то от Коли мы услышим в точности то, что говорил учитель?

- Совершенно верно. А теперь решите-ка задачу для общего случая, когда ребят не трое, а n. Первому, кто решит - пятерка на следующей контрольной!

Входные данные
Входной файл INPUT.TXT содержит целое число n (1 ≤ n ≤ 100). Во второй строке через пробел записаны n вещественных чисел - это числа p1, p2, ..., pn (0 ≤ pi ≤ 1). Числа даны с не более чем шестью десятичными знаками после запятой.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно вещественное число, округленное до шести знаков после запятой - вероятность существования жизни на Марсе.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |0.18                |
|1 |1 0.1 0.9           |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_556 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}