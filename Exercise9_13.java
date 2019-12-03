import java.util.Scanner;
public class Exercise9_13 {
	public static void main(String[] args) {
		 System.out.println("Enter the number of rows and colums of the array :");
	        Scanner input = new Scanner(System.in);
	        int row = input.nextInt();
	        int column = input.nextInt();
	        System.out.println("Enter the array");
	        double[][] array = new double[row][column];
	        for(int i=0 ;i < array.length;i++){
	            for(int j=0 ;j <array[i].length ;j++ ){
	                array[i][j] = input.nextDouble();
	            }
	        }
	        Location  location1=locateLargest(array);
	        System.out.println("The location of the largets element is "+location1.maxValue+"at "+"("+location1.row+","+location1.column+")");
	}
	public static Location locateLargest(double[][] a) {
        Location location = new Location();
        int row = 0;
        int column = 0;
        double maxValue = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>maxValue){
                    maxValue=a[i][j];
                    row =i;
                    column=j;
                }
            }
        }
        location.row = row;
        location.column = column;
        location.maxValue = maxValue;
        return location;//ÊµÀý
	}
}
class Location{
	public int row=0;
	public int column=0;
	public double maxValue=0;
}


