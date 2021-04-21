class Land{
	double x;
	Land(double x){
		this.x=x;
	}
	double area() {
		return 0;
	}
}
class Circles extends Land{
	Circles(double x) {
		super(x);
	}
	double area() {
		return x*x*Math.PI;
	}
}
class Square extends Land{
	Square(double x){
		super(x);
	}
	double area() {
		return x*x;
	}
}
class Retangle extends Land{
	private double y;
	Retangle(double x,double y){
		super(x);
		this.y=y;
	}
	double area() {
		return x*y;
	}
}
class Triangle extends Land{
	private double y;
	Triangle(double x,double y){
		super(x);
		this.y=y;
	}
	double area() {
		return x*y/2;
	}
}
class calculator{
	double price;
	calculator(double price){
		this.price=price;
	}
	double calculatePrice(Land l) {
		return calculatePrice(price,l);
	}
	double calculatePrice(double price,Land l) {
		return l.area()*price;
	}
	double calculateAllPrice(Land...Lands) {
		return calculateAllPrice(price,Lands);
	}
	double calculateAllPrice(double price, Land...Lands) {
		double total=0;
		for(Land l:Lands) {
			total+=calculatePrice(price,l);
		}
		return total;
	}
}
class Utility {
	double max(Land...Lands) {
		double maxarea = 0;
		for(Land l:Lands) {
			if(l.area()>maxarea) {
				maxarea=l.area();
			}
		}
		return maxarea;
	}
}
public class varargs {

	public static void main(String[] args) {
		Circles c=new Circles(5);
		Square s=new Square(5);
		Retangle r=new Retangle(2,3);
		calculator ca=new calculator(1000);
		Utility u=new Utility();
		System.out.println("max:"+u.max(c,s,r));
		System.out.println(ca.calculatePrice(c));
		System.out.println(ca.calculatePrice(s));
		System.out.println(ca.calculatePrice(r));		
		System.out.println(ca.calculateAllPrice(c,s,r));
    }

}
