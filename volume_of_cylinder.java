import java.util.*;

public class volume_of_cylinder{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double	rad= adi.nextDouble();
		double	height= adi.nextDouble();
		
		double volume= 3.14*rad*rad*height;
		
		System.out.println(volume);
	}
}