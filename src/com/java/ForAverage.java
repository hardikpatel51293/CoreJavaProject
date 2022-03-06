package com.java;

public class ForAverage
{
	public static void main( String[] args )
	{
		int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum = 0;
		for ( int i = 0; i < 9; i++ )
		{
			sum = sum + num[ i ];

		}

		System.out.println( "Average of Numbers=" + sum / 10 );

	}
}
