import java.util.*;
import java.io.*;
public class payment {
    public static void main(String[] args)
    	throws IOException{
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("�u��:");
    	String str=br.readLine();
    	int workhour=Integer.parseInt(str);
    	System.out.println("�T�w���~:");
    	str=br.readLine();
    	int salary=Integer.parseInt(str);
    	if(workhour<=60)
    		System.out.println("�u��:"+salary*workhour);
    	else if(workhour>60&&workhour<=120) {
    		int addhour=workhour-60;
    		System.out.println("�u��:"+(salary*60+salary*addhour*1.33));
    	}
    	else {
    		int adddhour=workhour-120;
    		System.out.println("�u��:"+(salary*60+salary*60*1.33+salary*adddhour*1.66));
    	}
    }
}