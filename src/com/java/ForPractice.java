package com.java;

public class ForPractice
{
	public static void main( String[] args )
	{

		int[] numbers = {11, 22, 33, 44, 55};
		String[] countries = new String[ 5 ];

		countries[ 0 ] = "India";
		countries[ 1 ] = "Canada";
		countries[ 2 ] = "USA";
		countries[ 3 ] = "UK";
		countries[ 4 ] = "Cuba";

		for ( int i = 0; i < 5; i++ )
		{
			System.out.println( numbers[ i ] + 5 );
		}
		
		for ( int i = 0; i < 5; i++ )
		{
			System.out.println( i + 1 + ": " + countries[ i ] );
		}
	}

}
