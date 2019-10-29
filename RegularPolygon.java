
public class RegularPolygon {
	//�������α�����Ĭ��ֵΪ3
	private int n=3;
	
	//����ߵĳ��ȣ�Ĭ��ֵΪ1
	private double side=1;
	
	//���������е�x�����꣬Ĭ��ֵΪ0
	private double x=0;
	
	//���������е�y�����꣬Ĭ��ֵΪ0
	private double y=0;
	
	//����Ĭ��ֵ��������ε��޲ι��췽��
	public RegularPolygon(){
		
	}
	
	//��ָ�������ͱ߳��ȡ������ڣ�0,0����������εĹ��췽��
	public RegularPolygon(int n,double side){
		this.n=n;
		this.side=side;
	}
	
	//��ָ�������ͱ߳��ȡ������ڣ�x��y����������εĹ��췽��
	public RegularPolygon(int n,double side,double x,double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	
	public int getN(){
		return n;
	}
	
	public double getSide(){
		return side;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	double getPerimeter(){
		return n*side;
	}
	
	double getArea(){
		return n*side*side/4/Math.tan(Math.PI/n);
	}

}
