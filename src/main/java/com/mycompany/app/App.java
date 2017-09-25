package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static boolean contains(ArrayList<String> list, String st1, String st2) {
    	
		boolean temp1 = false;
		boolean temp2 = false;
		
		if(st1 ==null || st2 == null || list == null){
			return false;
		}

		if (st1.equals(st2)){
			return false;
		}

		for (String s:list){
			if(s.equals(st1)){
				temp1=true;
			}

			else if(s.equals(st2)){
				temp2=true;
			}
		}
		return (temp1 && temp2);
    }
}
