/**

        * File: Lesson 4.1 - whileLoops

        * Author: Alexander

        * Date Created: Apr 8, 2026

        * Date Last Modified: Apr 23, 2026

        */
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

	public static String seriesInclusive(int num){
		int counter =0;
		String nums = "";
		while (counter < num){
			nums = nums + (counter + 1 + " ");
			counter++;
		}
		return nums.trim();
	}

	public static String seriesExclusive(int num){
		int counter = (-1);
		String nums = "";
		while (counter < num - 1){
			nums = nums + (counter + 1 + " ");
			counter++;
		}
		return nums.trim();
	}
}
