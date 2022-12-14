package acmp;

/* acmp.ru   |   Задание №252
		Сортировка масс
(Время: 1 сек. Память: 16 Мб Сложность: 44%)
Как известно, Россия является одним из ведущих экспортеров нефти. Разные страны мира, от достаточно больших до сравнительно маленьких, нуждаются в этой нефти как в воздухе. В ее состав в больших количествах входят ароматические углеводороды, которые обуславливают ее высокое качество. Доставка нефти в пункт назначения осуществляется с помощью нефтепровода. Считается, что количество нефти, отправленное в страну назначения, равно количеству полученной нефти. На самом деле это, конечно, не так. Как и многое другое, нефть воруют некоторые несознательные личности. Причем неофициально считается, что больше нефти воруют в нефтепроводах тех стран, куда нефти посылается больше (может быть, несознательные личности считают, что приносят, таким образом, меньше ущерба, кто знает...). Официальное руководство компании «Русская Нефть» решило узнать, правдивый это слух или нет, чтобы усилить (а может просто установить) охрану на тех нефтепроводах, где больше всего воруют нефть.

Для этого им нужно отсортировать нефтепроводы по количеству нефти, которая протекает в направлении какой-то страны за сутки. У компании «Русская Нефть», как и у любой уважающей себя компании, есть несколько штатных программистов, и руководство предложило им решить эту, в сущности, нетрудную задачу. Но программистов поставило в тупик то, что данные о количестве нефти представлены в разных единицах измерения (начиная от граммов и заканчивая тоннами).

Поэтому они решили найти человека, который был бы в силах решить эту задачу за них, и обещают взять его на работу в эту перспективную и процветающую компанию. Решите задачу, и, кто знает, может, повезет именно Вам?

Входные данные
В первой строке входного файла INPUT.TXT находится целое число N (1 ≤ N ≤ 1000) — количество нефтепроводов. В каждой из следующих N строк находится количество (точнее — масса) нефти, транспортированной по соответствующему нефтепроводу за сутки, по одному в строке. Масса нефти задана целым числом от 1 до 10000 с указанием соответствующей единицы измерения. Число и единица измерения разделены ровно одним пробелом. Единица измерения задается одной из трех букв: g (граммы), p (пуды), t (тонны), причем перед этой буквой может стоять одна из приставок: m (милли-), k (кило-), M (мега-), G (гига-). Напомним, что эти приставки обозначают умножение единицы измерения на 10^–3, 10^3, 10^6 и 10^9 соответственно. 1 пуд = 16380 граммов, 1 тонна = 10^6 граммов.

Выходные данные
В выходной файл OUTPUT.TXT выведите N строк, в которых должны быть записаны массы нефти в порядке неубывания. Каждая строка должна описывать массу нефти в одном из нефтепроводов. Массы должны быть описаны в том же формате, в котором записаны во входном файле. Приоритет равных масс, записанных в разных форматах должен соответствовать порядку, в котором они следуют во входном файле.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5                   |32 mg               |
|  | 234 g              | 234 g              |
|  | 4576 mp            | 4576 mp            |
|1 | 2 t                | 2 t                |
|  | 32 mg              | 2 Mg               |
|  | 2 Mg               |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_252 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}