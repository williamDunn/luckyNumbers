package testpercentage;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
        long l = 0;
        long h = 100;
        String num;
        int x = 0;
        
        String lVal = String.valueOf(l);
        String hVal = String.valueOf(h);
        
        

        if(l == h){
            System.out.println(0);
        }
        else if(l > h){
            System.err.println("Invalid Range");
        }
        else{
        	
        	do {
        		
        		num = Long.toString(l);
        		l++;
        		if(num.contains("6") && num.contains("8")) {
        			continue;
        		}
        		else if(num.contains("6") || num.contains("8")) {
        			x++;
        		}
        		else {
        			continue;
        		}
        	}
        	while(l < h);
        	System.out.println(x);
        	
        }

	}

}
