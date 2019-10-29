
public class RegularPolygonDemo {
	public static void main(String[] args){
		RegularPolygon object1=new RegularPolygon();
		RegularPolygon object2=new RegularPolygon(6,4);
		RegularPolygon object3=new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println(object1.getPerimeter());
		System.out.println(object1.getArea());
		System.out.println(object2.getPerimeter());
		System.out.println(object2.getArea());
		System.out.println(object3.getPerimeter());
		System.out.println(object3.getArea());
		
	}
	
}
