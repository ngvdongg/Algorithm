package impl;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class superclass implements Cloneable{
	
	protected void run(int a, double b) throws IOException {
		System.out.println("run superclass");
		throw new RuntimeException();
	}
	public void passReference(Person person) {
		person.setName("dong");
		person=new Person(); // can not reference 
		
	}
	public static void main(String[] args) {
		Person person=new Person(1, "hai");
		
		superclass sp= new superclass();
		sp.passReference(person);
		System.out.println(person);
		List<String> list= new LinkedList<String>() ;
		list.add("a");
		list.add("b");
		
		Enumeration<String> e= Collections.enumeration(list);
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		SortedMap<String, Integer> st=new TreeMap<>();
		HashMap<String,Integer> map=new HashMap<>();
		LinkedHashMap<String,Integer> li=new LinkedHashMap<>();
//		TreeMap<String,Integer>() tr=new TreeMap<>();
//		map=Collections.synchronizedMap(m)
	}
}
