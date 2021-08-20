import java.util.Scanner;

public class LineComparison
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Line Comparison Problem Program");
		//constants
		int x1,y1,x2,y2;
		double distance;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of x1");
		x1=s1.nextInt();
		System.out.println("Enter value of y1");
		y1=s1.nextInt();
		System.out.println("Enter value of x2");
		x2=s1.nextInt();
		System.out.println("Enter value of y2");
		y2=s1.nextInt();
		//computation
		distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The distance between 2 points is "+distance);
	
	}
}
