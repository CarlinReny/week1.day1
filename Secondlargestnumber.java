package week1.day1;

import java.util.Arrays;

public class Secondlargestnumber {



	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};	//input data

		Arrays.sort(data);       //sorting array

		for (int i = 0; i < data.length; i++) {//loop

			System.out.println("Sorted Array is:" + data[i]);//printing sorted array	

		}

		System.out.println("Second Largest Number is:" +data[(data.length)-2]);//printing second largest number

	}
}


