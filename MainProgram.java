import basic.Point;
import basic.CartesianPlane;

public class MainProgram{
	static CartesianPlane cp;
	static Point a;

	public static void main(String[] args){
		System.out.println("In main!");	

		a = new Point();
		cp = new CartesianPlane();

		System.out.println(a.getX());
		System.out.println(a.getY());
	}
}
