import java.util.Scanner;

public class ch75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		boolean[] number = new boolean[100];
		for(int i=0; i<100; i++)
			number[i]=false;              //falseΪ�ر�״̬
		for(int s=1;s<=100;s++){          //�ڼ���ѧ��
			for(int l=s;l<=100; l+=s){    //�ڼ�������
				number[l-1]=!number[l-1];
			}	
		}
		for(int i=0; i<100; i++){
			if(number[i])
				System.out.print("L" + (i+1) +" ");
		}
	}
}
