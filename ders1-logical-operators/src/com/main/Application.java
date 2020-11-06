package com.main;

public class Application {

	public static void main(String[] args) {
		
		int a = 90;
		int b = 70;
		int c = 90;
		
		boolean equality = ( a == b );
		
		System.out.println(equality);
		System.out.println();
		
		
		equality = ( a == c );
		System.out.println(equality);
		
		
		System.out.println("----------------");
		
		boolean notEqual = ( a != b );
		System.out.println(notEqual);
		
		
		notEqual = ( a != c );
		System.out.println(notEqual);
		
		
		System.out.println("----------------");
		
		
		boolean andClause = ( a != b ) && ( a == c ) && ( a > 100 ) && ( b > 10 ) && ( c > 10 );
		System.out.println(andClause);
		
		
		boolean orClause = ( ( a != b ) && ( a == c ) ) || ( a > 100 ) || ( b > 100 ) || ( c > 100 );
		System.out.println(orClause);
		
		
		System.out.println("----------------");
		
		boolean greaterThanOrEqual = ( a >= b );
		System.out.println(greaterThanOrEqual);
		
		greaterThanOrEqual = ( c >= a );
		System.out.println(greaterThanOrEqual);
		
		
		System.out.println("----------------");
		
		boolean lowerThanOrEqual = ( a <= b );
		System.out.println(lowerThanOrEqual);
		
		lowerThanOrEqual = ( c <= a );
		System.out.println(lowerThanOrEqual);
		
		
		System.out.println("----------------");
		
		notEqual = false;
		a = 100;
		System.out.println(!notEqual);
		
		
		System.out.println("----------------");
		
		orClause = !( ( ( a != b ) && ( a == c ) ) || ( a > 100 ) );
		System.out.println(!orClause);
	}

}
