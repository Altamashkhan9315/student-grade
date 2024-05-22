package Student grade Calculator;
import java.util.*;
public class studentgrade {
	
	public static double percentage(int marks[]) {
		int totalmarks=0;
		for(int i=0;i<marks.length;i++) {
			totalmarks=totalmarks+marks[i];
		}
		int maxmarks=marks.length*100;
		double percentage=(totalmarks*100)/maxmarks;
		return percentage;
	}
    public static void Grade(int marks[]) {
    	double percentage=percentage(marks);
    	if(percentage>=80) {
			System.out.print("Your Grade is A");
		}
		else if(percentage>=60 && percentage<=80) {
			System.out.print("Your Grade is B");
		}
		else if(percentage>=50 && percentage<=60) {
			System.out.print("Your Grade is C");
		}
		else if(percentage>=40 && percentage<=50) {
			System.out.print("Your Grade is D");
		}
		else  {
			System.out.print("Your Grade is F");
		}

    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the subject number : ");
		int subjects=sc.nextInt();
		if (subjects<=0) {
			System.out.print("Enter the valid subject number : ");
			subjects=sc.nextInt();
					
		}
		int marks[]=new int [subjects];
		for(int i=0;i<marks.length;i++) {
			System.out.print("Enter the marks : ");
			marks[i]=sc.nextInt();
		}
		double percentage=percentage(marks);
		System.out.println(percentage);
		
		Grade(marks);
	}

}
