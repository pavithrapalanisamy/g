package Guvi;
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;
public class Isomorphic {
	public boolean isIsomorphic(String s, String t) {
	    if(s==null||t==null)
	        return false;
	 
	    if(s.length()!=t.length())
	        return false;
	 
	    HashMap<Character, Character> map = new HashMap<Character, Character>();
	 
	 
	    for(int i=0; i<s.length(); i++){
	        char c1 = s.charAt(i);
	        char c2 = t.charAt(i);
	 
	        if(map.containsKey(c1)){
	            if(map.get(c1)!=c2)
	                return false;
	        }else{
	            if(map.containsValue(c2)) 
	                return false;
	            map.put(c1, c2);
	        }
	    }
	 
	    return true;
	}

public static void main(String d[]){
	String s;
	String t;
	boolean k;
	Isomorphic sa=new Isomorphic();
	Scanner ss=new Scanner(System.in);
	s=ss.next();
	t=ss.next();
	k=sa.isIsomorphic(s, t) ;
	System.out.println(k);
}
	
}



