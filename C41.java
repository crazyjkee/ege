package ege;
import java.io.*;
import java.util.HashMap;
public class C41 {
	/*
	 * На вход программе в первой строке подается количеество пришедших sms-сообщений N.
	 * В каждой из последующих N строк записано название фильма в виде текстовой строки
	 * Пример входных данных
	 * 6
	 * Белое солнце пустыни
	 * Бриллиантовая рука
	 * Белое солнце пустыни
	 * Белое солнце пустыни
	 * Гараж
	 * Бриллиантовая рука
	 * 
	 * Пример выходных данных
	 * Белое солнце пустни 3
	 * Бриллиантовая рука 2
	 * Гараж 1
	 */
	public static void main(String[] args)throws Exception {
		HashMap<String, Integer> al = new HashMap<String, Integer>();
		int sum =0;
		BufferedReader bufferRead = new BufferedReader
				(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferRead.readLine());
		for (int i = 0; i<N; i++){
			String s = bufferRead.readLine();
			if (al.containsKey(s)){
		    sum = al.get(s) + 1;

			al.put(s, sum);	
		}else
			al.put(s, 1);
			}
		for (int i = al.size(); i >= 0; i--) 
			for (String list : al.keySet())
				if (al.get(list) == i) 
						System.out.println(list + " " + al.get(list));
			}
		}