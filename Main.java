import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = scan.nextInt();
        
        int a[][] = new int[num][num];
        
        int c=0;
        
        int r=0;
        
        int row = num;
        
        int col=num;
        
        int count=num;
        
        while(true){
        for(int i=c;i<col;i++){
                a[r][i]=count;
        }
        r++;
        for(int i=r;i<row;i++){
                a[i][c]=count;
        }
        c++;
        count--;
        if(count==-1){break;}
        }
        
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
            
        }
	}
}