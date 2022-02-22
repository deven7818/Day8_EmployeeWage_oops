package com.empwageopps;

public class MonthlyWage extends SwitchCaseUc4 {
	
	public static final int isFullTime = 1, isPartTime = 2;
	
	public static void main(String[] args) {
		
		int TotalWage = 0;
		

		for (int Day = 1; Day <= 20; Day++) {

			int check = SwitchCase();

			switch (check) {

			case isFullTime: // full time wage
				TotalWage += wager(); // Daily wager
				break;

			case isPartTime: // part time wage
				TotalWage += partTimeWage();
				break;

			default: // Absent
				TotalWage = 0;
			}

		}
		/*
		 * Printing Total Monthly Wage
		 */
		System.out.println("Employee Monthly wage = " + TotalWage);

	}

}
