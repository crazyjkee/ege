package ege;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/*
 * Название сортов кофе в свободном отчете не должны повторяться.
 * Сводный отчет должен быть отсортирован в порядке возрастания суммарной
 * стоимости каждого проданного сорта кофе
 * Пример входных данных:
 * 5
 * Суаре 500
 * Робуста 120
 * Арабика 700
 * Арабика 130
 * Суаре 130
 * 
 * Пример выходных данных:
 * Робуста 120
 * Суаре 630
 * Арабика 830
 * 
 */
public class С44 {
	public static void main(String[] args)throws Exception {
		Map<String, Integer> al = new HashMap<String, Integer>();
		int sum=0;int n=0;
		BufferedReader bufferRead = new BufferedReader
				(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferRead.readLine());
		for (int i = 0; i<N; i++){
		String s = bufferRead.readLine();
		n=s.indexOf(" ");
		sum = Integer.parseInt(s.substring(n, s.length()).trim());
		s = s.substring(0,n).trim();
			if (al.containsKey(s)){
		    sum = al.get(s) + sum;
			al.put(s, sum);	
		}else
			al.put(s, sum);
			}
		Map<String,Integer> sortedMap = sortByComparator(al);
		printMap(sortedMap);
	}
	private static Map sortByComparator(Map unsortMap) {
		List list = new LinkedList(unsortMap.entrySet());
		// Сортируем лист с помощью компаратора
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
                                       .compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		// Вставляем отсортированный лист в карту,пробегая по сортированому листу
		Map sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	public static void printMap(Map<String, Integer> treeMap){
		for (Map.Entry entry : treeMap.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}
}