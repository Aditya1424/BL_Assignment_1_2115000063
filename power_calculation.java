import java.util.*;

public class power_calculation{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		int	base= adi.nextInt();
		int	exp= adi.nextInt();
		
		int power=(int)Math.pow(base,exp);
		
		System.out.println(power);
	}
}
