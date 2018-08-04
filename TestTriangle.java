
import java.util.*;

public class TriangleTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of triangles");		//Taking input for no of triangles
		int num = sc.nextInt();
		Triangle[] triangle = new Triangle[num];
		for(int i=0;i<num;i++) {
			triangle[i] = new Triangle();
			
			//Taking input for sides of triangle and storing it in array
			System.out.println("Enter length of Side 1");
			double side1 = sc.nextDouble();
			System.out.println("Enter length of Side 2");
			double side2 = sc.nextDouble();
			System.out.println("Enter length of Side 3");
			double side3 = sc.nextDouble();
			triangle[i].setSide1(side1);
			triangle[i].setSide2(side2);
			triangle[i].setSide3(side3);
		}
		int type[] = new int[num];
		type = triangle[0].checkType(triangle);
		for(int i=0;i<num;i++) {
			
		}
	}

}
