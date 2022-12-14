package acmp;

/* acmp.ru   |   Задание №663
		Предприимчивый Петя
(Время: 1 сек. Память: 16 Мб Сложность: 72%)
Петя решил организовать у себя в классе чемпионат по решению математических головоломок. В нем изъявили желание участвовать N человек. Каждый человек при регистрации указывает свое имя, состоящее из маленьких английских букв. Петя предлагает участникам решить M задач, каждая из которых имеет название, состоящее из больших английских букв.

Проверку решений задач осуществляет Петя. За каждое решение он ставит некоторое количество баллов и заносит эту информацию в некоторую базу данных на своем карманном компьютере как строку вида “A-B-C”, где A – имя участника, который сдал решение на проверку, B – название задачи, решение которой сдал этот участник, C – количество баллов, полученное решением. На каждую из предложенных задач участник мог сдать не более одного решения, кроме того, участник мог не сдавать решения некоторых задач. Количество баллов, которое набрал участник в итоге соревнования, равно сумме баллов, полученных каждым из решений, которые этот участник сдавал на проверку.

После окончания проверки решений Петя обнаружил, что информация в базе данных была повреждена, так как карманный компьютер, на котором она хранилась, был заражен компьютерным вирусом. А именно, некоторые большие и/или маленькие английские буквы в строках, которые хранятся в базе данных, могли быть заменены на вопросительные знаки. В этот момент Петя очень пожалел, что не может заново проверить все работы, так как они у него не сохранились. Но все же Петя хочет использовать возникшую ситуацию определенным образом. Дело в том, что некоторые из участников – его хорошие друзья, и он им симпатизирует. Поэтому Петя хочет объявить результаты соревнования таким образом, чтобы все участники, которым он симпатизирует, набрали в сумме максимальное количество баллов. Однако, объявленные Петей результаты не должны противоречить информации, которая хранится в базе данных.

Сформулируем условие задачи более точно. Известны имена N человек Name1, …, NameN и названия M задач Problem1, …, ProblemM. Назовем статусной строкой строку вида “A-B-C”, где A = Namei для некоторого i, B = Problemj для некоторого j, С – целое неотрицательное число и ‘-‘ – символ с ASCII-кодом 45. Величины A, B и C будем называть атрибутами статусной строки. Набор статусных строк назовем статусом, если никакие две статусные строки в этом наборе не имеют одновременно одинаковые атрибуты A и B. Назовем маской статусной строки произвольную строку, символами которой могут быть большие и маленькие английские буквы, цифры и символы ‘-‘ и ‘?’ (ASCII-код 63). Будем говорить, что некоторая статусная строка S соответствует маске Q, если в маске Q можно заменить каждый символ ‘?’ на большую или маленькую английскую букву так, что в результате получится строка S. Произвольный набор масок статусных строк назовем маской статуса. Будем говорить, что маска статуса MS соответствует статусу ST, если количество масок в MS равно количеству статусных строк в ST и маски статусных строк из MS и статусные строки из ST можно расположить в некотором порядке так, что i-я статусная строка в ST будет соответствовать i-й маске в MS. Результатом i-го участника, вычисленным по статусу ST, назовем целое число, равное сумме значений атрибутов C по всем статусным строкам из ST, для которых значение атрибута A равно Namei. Множеством симпатий назовем произвольное множество, элементами которого являются числа от 1 до N. Значением симпатичности статуса ST относительно множества симпатий L будем называть число, равное сумме результатов i-х участников, вычисленных по статусу ST, по всем i из множества L.

Ваша задача заключается в следующем. Вашей программе на вход подается маска статуса MS и множество симпатий L. Пусть X – это множество всех статусов, соответствующих маске MS. Необходимо найти максимальное из значений симпатичности по всем статусам из множества X относительно множества L.

Входные данные
Первая строка входного файла INPUT.TXT содержит целые числа N и M – количества участников и задач соответственно. Следующие N строк описывают имена участников. В i-й из этих строк записано значение Namei – имя i-го участника. Следующие M строк описывают названия задач. В j-й из этих строк записано значение Problemj – название j-й задачи.

В следующей строке записано целое число K – количество строк в исходной маске статуса. В каждой из следующих K строк записана одна маска статусной строки.

В следующей строке находится целое число P – количество чисел в исходном множестве симпатий. В следующей строке находятся P различных целых чисел от 1 до N, разделенных одиночными пробелами – элементы исходного множества симпатий.

Ограничения: 2 ≤ N ≤ 10, 2 ≤ M ≤ 10, Namei – непустая строка из не более 100 маленьких английских букв, Problemj – непустая строка из не более 100 больших английских букв. Каждая маска статусной строки содержит не более 5 цифр. Существует хотя бы один статус, соответствующий исходной маске статуса

Выходные данные
В первой строке выходного файла OUTPUT.TXT выведите одно целое число, равное максимальному из значений симпатичности по всем статусам, соответствующим исходной маске статуса, относительно исходного множества симпатий.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 2                 |160                 |
|  | petr               |                    |
|  | lexa               |                    |
|  | sergey             |                    |
|  | PROBA              |                    |
|  | PROBB              |                    |
|1 | 4                  |                    |
|  | lexa-PROBA-100     |                    |
|  | ???g??-?????-0     |                    |
|  | ?e??-PROBA-70      |                    |
|  | ?e??-PROB?-60      |                    |
|  | 2                  |                    |
|  | 3 2                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_663 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}