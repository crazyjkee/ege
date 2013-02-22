package ege;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * На вход программе в первой строке подается количество пришедших запросов N.
 * В каждой из последующих N строк записан номер задачи от до 12.
 * Программа должна вывести список всех задач,встречающихся в запросах,в порядке
 * возрастания(неубывания) количества запросов на проверку той или иной задачи с указанием
 * количества запросов по ней.При этом каждая задача должна быть выведена ровно один раз
 * вне зависимости от того,сколько раз она встречается в списке.
 */
public class C42 {
	public static void main(String[] args)throws Exception {
		int sum =0,maximum=1;
		HashMap<Integer, Integer> al = new HashMap<Integer, Integer>();		
		BufferedReader bufferRead = new BufferedReader
				(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferRead.readLine());
		for (int i = 0; i<N; i++){
			Integer s = Integer.parseInt(bufferRead.readLine());
			//Если совпадают числа,то прибавляет +1
			if (al.containsKey(s)){
		    sum = al.get(s) + 1;
		    if(maximum<sum)maximum=sum;
			al.put(s, sum);	
		}else
			al.put(s, 1);
			}
		//Цикл который пересортирует ключи по возрастанию
		//При условии что ключ должен ровняться i и делает вывод.
		for (int i = 1; i <= maximum; i++) 
			for (Integer list : al.keySet())
				if (al.get(list)==i) 
						System.out.println(list + " " + al.get(list));
			}
		}