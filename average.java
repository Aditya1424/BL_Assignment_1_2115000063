import java.util.*;

public class average{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double	a= adi.nextDouble();
		double	b= adi.nextDouble();
		double	c= adi.nextDouble();
		
		double average= (a+b+c)/3;
		
		System.out.println(average);
	}
}