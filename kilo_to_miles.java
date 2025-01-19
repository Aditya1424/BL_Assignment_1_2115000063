import java.util.*;
public class kilo_to_miles{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double km= adi.nextDouble();
		
		double miles = km*0.621371;
		
		System.out.println(miles);
	}
}