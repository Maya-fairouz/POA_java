package h;

import java.util.Scanner;
import java.util.StringTokenizer;

public class h{
	public static void main(String[] args) {
		System.out.println("veuillez saisir une expression");
		Scanner sc= new Scanner(System.in);
		String expression= sc.next();
		StringTokenizer st= new StringTokenizer(expression, "+");
		int some= 0; int prod= 0;
		while (st.hasMoreTokens()) {
			StringTokenizer sr = new StringTokenizer(st.nextToken(), "*");
			while (sr.hasMoreTokens()) {
				prod*= Integer.parseInt(sr.nextToken());
				some= some+prod;
				prod=1;
				System.out.println(some);
				
			}
		
		}
	}
}
	