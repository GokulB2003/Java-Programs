/*
8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.


CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.


Explanation:
 Tests inheritance with customized formula calculations.

*/
import java.util.*;
class Loan
{
	int amount;
	int year;
	Loan(int a,int y)
	{
		this.amount=a;
		this.year=y;
	}
	
	
}
class HomeLoan extends Loan
{	
	//super(int a,int y);
	HomeLoan(int a,int y)
	{
		super(a,y);
	}
	public double homeLoan()
	{
	int month=year*12;
	double rate=7.0/(12.0*100);
	double Emi=(amount*rate*Math.pow(1+rate,month))/(Math.pow(1+rate,month)-1);
	return Emi;
	}
}
class CarLoan extends Loan
{
	
	CarLoan(int a,int y)
	{
		super(a,y);
	}
	public double homeLoan()
	{
		int month=year*12;
		double rate=9.0/(12.0*100);
		
		double emi=(amount*rate*Math.pow(1+rate,month))/(Math.pow(1+rate,month)-1);
		return emi;
	}
}
public class EMICalculation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		CarLoan c=new CarLoan(600000,3);
		double emiCar=c.homeLoan();
		System.out.println("EMi of car Loan"+emiCar);
		HomeLoan h=new HomeLoan(500000,4);
		double emi=h.homeLoan();
		System.out.println("Emi of Home Loan After:"+emi);
	
	}
}