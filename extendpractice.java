class Shape{
	double x,y;
	Shape(double x,double y){
		this.x=x;
		this.y=y;
	}
	String original() {
		return (x+","+y);
	}
}
class Circle extends Shape{
	double r;
	Circle(double x,double y,double r){
		super(x,y);
		this.r=r;
	}
	double areas() {
		return r*r*Math.PI;
	}
}
public class extendpractice {
	public static void main(String[] args) {
		Circle c=new Circle(4,5,6);
		System.out.println(c.areas());
		System.out.println(c.original());
	}

}
