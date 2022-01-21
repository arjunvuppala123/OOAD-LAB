package learning;

public class sumoffivenums {
	public static void main(String[] args) {
		// TODO Auto-generated method stub    
        int n = 5;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int j = 1;
        int k = 0;
        for(int i=1;i<=n;++i) {
        	sum1 += i;
        }
        while (j<=n) {
        	sum2 += j;
        	j++;
        }
        do{
        	sum3 += k;
        	k++;
        }while(k<=n);
        System.out.println("Sum after using for loop = "+sum1);
        System.out.println("Sum after using while loop = "+sum2);
        System.out.println("Sum after using do while loop = "+sum3);      
	}
}
