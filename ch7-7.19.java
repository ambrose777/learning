import java.util.Scanner;

public class ch75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int size= input.nextInt();
		System.out.print("Enter the contents of the list: ");
		int[] list = new int[size];
		for(int i=0; i<size; i++){
			list[i] = input.nextInt();
		}
		System.out.print("The list has " + size + " integers ");
		for(int i=0; i<size ;i++){
			System.out.print(list[i] + " ");
			if(i==size-1)
				System.out.println();
		}
		if(isSorted(list))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}
	
	public static boolean isSorted(int[] list){
		int temp = 0;
		for(int i=1; i<list.length; i++){
			for(int j=0; j<i; j++){
				if(list[j]>list[i])
					temp = 1;			
			}
		}
		if(temp==0)
			return true;
		else
			return false;
	}
}
