import java.util.Scanner;

public class ch75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int[] numbers= new int[10];
		int[] number= new int[10];
		int total=1;       //不相同的数的个数
		System.out.print("Enter 10 numbers: ");
		numbers[0]=input.nextInt();
		for(int i=1,k=2; i<10; i++,k++){
			numbers[i]=input.nextInt();
			for(int j=0; j<i; j++){
				if(numbers[i]==numbers[j]){
					k-=1;
					break;
				}             //如果两数相同，就跳过
			}
			total=k;
		}

		
		System.out.println("The number of distinct numbers is " + total);
		System.out.print("The distinct numbers are: ");
		System.out.print(numbers[0]);
		for(int i=1; i<10 ;i++){
			for(int j=0; j<i ;j++){
				if(numbers[j]==numbers[i]){
					numbers[i]=-1;
					break;
				}
			}
			if(numbers[i]!=-1)
			System.out.print(" " + numbers[i]);
		}
	}
}
