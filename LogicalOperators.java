import java.util.*;

public class LogicalOperators 
{

	public void Operators()
	{
		byte x;
		byte y;
		System.out.println("Enter the numbers");
		Scanner digi= new Scanner(System.in);
		x=digi.nextByte();
		y=digi.nextByte();
		byte result=(byte)(x&y);
		System.out.println("result of x&y="+ "  "+result);
	}
	
	public static void main(String[] args) 
	{
		LogicalOperators obj=new LogicalOperators();
		obj.Operators();

	}

}
