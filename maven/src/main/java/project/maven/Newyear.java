package project.maven;

import java.util.ArrayList;
import java.util.Collections;
	public class Newyear extends Sweet implements Chocolates {
		public int calculate_Chocolates_Weight(int count,int weight)
		{
			return(count*weight);
		}
		public static void main(String args[])
		{
			ArrayList<Integer> var=new ArrayList<Integer>();
			int chocolate_1,sweet_1,chocolate_2,chocolate_3,total_weight_1=0,chocolate_4,sweet_2,total2=0,sweet_3;
			Chocolates perk=new Newyear();
			chocolate_1=perk.calculate_Chocolates_Weight(5,10);
			Sweet gulab_jam=new Newyear();
			sweet_1=gulab_jam.calculate_Sweets_Weight(2,50);
			Chocolates munch=new Newyear();
			chocolate_2=munch.calculate_Chocolates_Weight(10, 10);
			total_weight_1=chocolate_1+chocolate_2+sweet_1;
			var.add(chocolate_1);
			var.add(chocolate_2);
			System.out.println("Total weight in newyear gift 1 is:"+total_weight_1);
			Chocolates milkybar=new Newyear();
			chocolate_4=milkybar.calculate_Chocolates_Weight(2, 20);
			var.add(chocolate_4);
			Sweet halwa=new Newyear();
			sweet_3=halwa.calculate_Sweets_Weight(50, 100);
			Chocolates dairymilk=new Newyear();
			chocolate_3=dairymilk.calculate_Chocolates_Weight(2, 70);
			var.add(sweet_3);
			total2=chocolate_3+chocolate_4+sweet_3;
			System.out.println("Total weight in newyear gift 2 is:"+total2);
			Collections.sort(var);
			System.out.println("Sorted order of chocolates is:"+var);
		}


}
