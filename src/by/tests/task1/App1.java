package by.tests.task1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
 
public class App1
{
    static int n;
    static int myArray[];
    static int element = -1;
    static Map<Integer, Integer> resultSortMap = new LinkedHashMap<Integer, Integer>();
    
    public static void run(){
        try{
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        n = in.nextInt();
        in.close();
        myArray = new int [n];
        
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = (int)(Math.random() * 10);
            
        for (int i: myArray)
            System.out.print(i + " " );
        }
        catch (Exception e)
        {
            System.err.println("Error!");
        }
    }
    
    public static void list(){
        try {
            for (int i = 0; i < myArray.length; i++) {
                if (element != myArray[i] ) {
                	element = myArray[i];
        	        resultSortMap.put(element, count(element,myArray));
            	}
            }
        }
        catch (Exception e){
            System.err.println("Error!");
        }
    }
    
    public static int count(int num,int[] array) {
       int count = 0;
       for (int n:array)
          if (n == num) count++;
              return count;
    }
    
    public static void sortByValues(){
        List<Map.Entry<Integer,Integer>> entries = new LinkedList<Map.Entry<Integer,Integer>>(resultSortMap.entrySet());
      
        Collections.sort(entries, new Comparator<Map.Entry<Integer,Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<Integer,Integer> sortedMap = new LinkedHashMap<Integer,Integer>();
        
        for(Map.Entry<Integer,Integer> entry: entries){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println("\nСписок, отсортированный по количеству вхождений:");
        for (Map.Entry entry : sortedMap.entrySet()) {
            System.out.println("{" + entry.getKey() + "," + entry.getValue() + "}");
        }
    }
    
    public static void main(String[] args) {
        run();
        list();
        sortByValues();
    }
}