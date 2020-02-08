package project.maven;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Newyear extends Sweet{
	public void year()
	{
		Scanner sc=new Scanner(System.in);
		int number_of_sweets,chocolate_weight,sweet_weight,sweets_number,sum,sum1;
		int chocolates_count,sweets_count,number_of_gifts,gift1=0,total_weight=0;
		String chocolate_name,sweet_name;
		ArrayList<Integer> range = new ArrayList<Integer>();
		//Sweet obj[]=new Sweet[sweets_number];
		System.out.println("Enter number of gifts");
		number_of_gifts=sc.nextInt();
		for(int i=1;i<=number_of_gifts;i++)
		{
			ArrayList<Integer> var = new ArrayList<Integer>();
			System.out.println("In gift"+i);
			System.out.println("Enter how many types of chocolates");
			int type_count=sc.nextInt();
			int gitf1,min_cost,max_cost,candy;
			sum=0;
			for(int j=1;j<=type_count;j++)
			{
				System.out.println("In gift"+i);
				System.out.println("Enter weight of chocolte"+j);
				chocolate_weight=sc.nextInt();
				System.out.println("Enter count of chocolates"+j);
				chocolates_count=sc.nextInt();
				gift1=calculate_Chocolates_Weight(chocolates_count,chocolate_weight);
				var.add(gift1);
			}
			for(int k=0;k<var.size();k++)
			{
				
				sum=sum+var.get(k);
			}
			System.out.println("Enter number of sweets");
			sweets_count=sc.nextInt();
			System.out.println("Enter cost of sweet");
			sweet_weight=sc.nextInt();
			int sweet1=calculate_Sweets_Weight(sweets_count, sweet_weight);
			System.out.println("Enter minimum cost of candy");
			min_cost=sc.nextInt();
			System.out.println("Enter maximum cost");
			max_cost=sc.nextInt();
			candy=calculate_Candies_Weight(min_cost,max_cost);
			total_weight=sum+sweet1+candy;
			System.out.println("Total weight in gift"+i+"is "+total_weight);
			Collections.sort(var);
			System.out.println("Sorted order of chocolates in gifts are"+var);
		}
	}
	public static void main(String args[])
	{
		Newyear o=new Newyear();
		o.year();
	}

}
