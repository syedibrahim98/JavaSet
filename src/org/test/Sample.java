package org.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Sample {
     public static void main(String[] args) {
		
    	 Set<Integer>s = new TreeSet<Integer>();
    	 
    	s.add(100);
    	s.add(45);
    	s.add(50);
    	s.add(20);
    	s.add(30);
    	s.add(60);
    	 
    	 
    	System.out.println(s);
    	 
    	 
    	 List li = new ArrayList();
    	 
    	 li.add(100);
    	 li.add(200);
    	 li.add(300);
    	 
    	 
    	 // 1.) converts set into list
    	 
    	 List mi = new LinkedList();
    	 
    	 mi.addAll(s);
    	 System.out.println(mi);
    	 
    	 
    	 // 2.) convert list into set
    	 
    	 List ni = new Vector();
    	 
    	 ni.addAll(li);
    	 System.out.println(ni);
    	 
    	 
    	 
    	 
	}
}
