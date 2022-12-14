package acmp;

/* acmp.ru   |   Задание №987
		Обмен пакетами
(Время: 1 сек. Память: 16 Мб Сложность: 32%)
Вася получает доступ в Интернет с помощью мобильного телефона. Однако такая связь очень нестабильна, поэтому каждый раз после подключения ему приходиться проверять подключение. Для этого он просто в командной строке набирает примерно следующую фразу: «ping name», где name – это имя удаленного сервера, который точно находится в сети. Затем идет обмен пакетами с сервером и выдается статистика. Однако у Васи недавно сломался модуль, отвечающий за подсчет и вывод статистики. Вам надо будет помочь Васе – написать аналогичный модуль.

После вызова команды «ping» на удаленный сервер по очереди посылаются 4 пакета по 32 байта. Как только удаленный сервер получил пакет, он отвечает на него. Если пакет не уложился в определенное время (он должен дойти до удаленного сервера и вернуться обратно) в силу тех или иных причин (низкая скорость, отсутствие подключения и т.д.), он считается утерянным.

Дана информация обо всех 4 пакетах. Требуется определить количество потерянных пакетов, максимальное, минимальное и среднее время обмена одного пакета.

Входные данные
Входной файл INPUT.TXT содержит ровно 5 строк. В первой строке находится фраза «ping name», где name – это имя сервера. Имя сервера представляет собой IP адрес. IP-адрес – это 4 однобайтных числа (т.е. числа от 0 до 255), отделенные друг от друга точкой. В каждой из следующих 4 строк содержится либо фраза «Time out», если пакет считается утерянным, либо «Reply from name Time=number», где name – это имя удаленного сервера, а number – время за которое вернулся пакет (number – целое число, 0 ≤ number ≤ 10^4).

Выходные данные
В выходной файл OUTPUT.TXT выведите статистику по обмену пакетами с удаленным сервером. Следуйте формату, приведенному в примере. Среднее время округлите до целого числа по математическим правилам. Если все 4 пакета утеряны, то выведите только первые две строки.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |ping 209.85.135.147 |Ping statistics for 209.85.135.147:|
|  | Time out           | Packets: Sent = 4 Received = 3 Lost = 1 (25% loss)|
|1 | Reply from 209.85.135.147 Time=100| Approximate round trip times:|
|  | Reply from 209.85.135.147 Time=300| Minimum = 100 Maximum = 300 Average = 200|
|  | Reply from 209.85.135.147 Time=200|                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_987 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}