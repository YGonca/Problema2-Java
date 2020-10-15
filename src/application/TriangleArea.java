package application;

import java.util.Scanner;
import entities.Triangle;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle triangle1,triangle2;
		triangle1 = new Triangle();
		triangle2 = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		triangle1.sideA = sc.nextDouble();
		triangle1.sideB = sc.nextDouble();
		triangle1.sideC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		triangle2.sideA = sc.nextDouble();
		triangle2.sideB = sc.nextDouble();
		triangle2.sideC = sc.nextDouble();
		
		double areaTri1 = triangle1.area();
		double areaTri2 = triangle2.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaTri1);
		System.out.printf("Triangle Y area: %.4f%n", areaTri2);
		if (areaTri1 > areaTri2) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}