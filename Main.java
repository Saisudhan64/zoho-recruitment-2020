/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		int num = scan.nextInt();
		
		int pspace = num-1;
		
		int count = num * num ;
		
		int pcount1 = 0;
		
		int pcount2 = 0;
		
		int rownum=0;
		
		while(rownum<num){
		    
		    for(int i =0; i<pspace;i++){
		        System.out.print(" ");
		    }
		    
		    pspace--;
		    
		    for(int j=0;j<num && rownum%2==0;j++){
		        
		        pcount1++;
		        
		        System.out.print(pcount1+" ");
		        
		        
		  
		    }
            
           System.out.println();
		    rownum++;    
		    
		    for(int i =0; i<pspace;i++){
		        System.out.print(" ");
		    }
		    
		    pspace--;
		    
		    
		    pcount2 = pcount1+num;
            for(int k=0;k<num && rownum%2!=0;k++){
                
                System.out.print(pcount2+" ");
                pcount2--;
            }    
		    
		   System.out.println();
		    rownum++; 
		    pcount1=pcount2+num;
		}
	}
}
