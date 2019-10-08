import java.util.Scanner;

public class ch7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int[] numbers= new int[100];   //储存读入的数据
		int total=0;                 //总共读入了total个数
		int count;                   // 用来储存每个数出现的次数
		System.out.print("Enter the integers between 1 and 100: ");
		for(int i=0;i<100;i++){           //读入数据
			numbers[i]= input.nextInt();
			if(numbers[i]==0)
				break;
			total+=1;
		}

		for(int j=1;j<100;j++){
			count=0;            //count归零
			for(int k=0;k<=total;k++){
				if(numbers[k]==j)
					count+=1;
			}
			if(count==1)      // 区别复数
				System.out.println(j + " occurs " + count + " " + "time");
			else if(count>1)
				System.out.println(j + " occurs " + count + " " + "times");
		}
	}
}
