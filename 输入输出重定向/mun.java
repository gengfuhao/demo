import java.util.Scanner;

public class mun{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入一些值");
		int data=input.nextInt();
		int sum=0;
		
		while(data!=0) {
			sum=sum+data;
			System.out.println("输入的值为"+data);
			data=input.nextInt();
		}
		System.out.println("总和为"+sum);
		
		}

}
