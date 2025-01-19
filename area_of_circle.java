import java.util.*;

public class area_of_circle{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double	rad= adi.nextDouble();
		
		double area= 3.14*rad*rad;
		
		System.out.println(area);
	}
}