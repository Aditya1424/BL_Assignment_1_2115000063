import java.util.*;

public class perimeter_of_rectangle{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double	len= adi.nextDouble();
		double	bre= adi.nextDouble();
		
		double perimeter= 2*(len+bre);
		
		System.out.println(perimeter);
	}
}