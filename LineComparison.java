import java.util.Scanner;
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> UC2-Line-Equality
=======
>>>>>>> UC3-Compare-Two-Lines
public class LineComparison
{
	public static void main(String[] args)
	{
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println("Welcome to Line Comparison Problem Program");
		//constants
		int x1,y1,x2,y2;
		double distance;
=======.        int p1,q1,p2,q2;
		
>>>>>>> UC2-Line-Equality
=======
		
		
>>>>>>> UC3-Compare-Two-Lines
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of x1");
		x1=s1.nextInt();
		System.out.println("Enter value of y1");
		y1=s1.nextInt();
		System.out.println("Enter value of x2");
		x2=s1.nextInt();
		System.out.println("Enter value of y2");
		y2=s1.nextInt();
<<<<<<< HEAD
<<<<<<< HEAD
		//computation
		distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The distance between 2 points is "+distance);
	
=======
=======
>>>>>>> UC3-Compare-Two-Lines
		
		System.out.println("Enter value of p1");
		p1=s1.nextInt();
		System.out.println("Enter value of q1");
		q1=s1.nextInt();
		System.out.println("Enter value of p2");
		p2=s1.nextInt();
		System.out.println("Enter value of q2");
		q2=s1.nextInt();
		//computation
		Double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		Double distance2=Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
		System.out.println("The distance between 2 points of Line1 is "+distance);
		System.out.println("The distance between 2 points of Line2 is "+distance2);
		
<<<<<<< HEAD
		//comparison using equals()
		
		if(distance.equals(distance2))
		{
			System.out.println("Lines are equal");
		}
		else
			System.out.println("Lines are not equal");
			
		
>>>>>>> UC2-Line-Equality
=======
		//using compareTo method
		
		int res=distance.compareTo(distance2);
		if(res>0)
			System.out.println("Line1 is greater than Line2");
		else if(res<0)
			System.out.println("Line1 is smaller than Line2");
		else
			System.out.println("Both lines are equal1");
			
>>>>>>> UC3-Compare-Two-Lines
	}
}
