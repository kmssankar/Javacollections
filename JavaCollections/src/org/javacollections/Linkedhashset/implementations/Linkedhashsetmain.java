package org.javacollections.Linkedhashset.implementations;

import java.util.LinkedHashSet;

public class Linkedhashsetmain {

	public static void main(String[] args) {
		LinkedHashSet<Movie> LSHMovie = new LinkedHashSet<Movie>();
		Linkedhashsetfunctions LSHF = new Linkedhashsetfunctions();
		//Adding to the List
		LSHF.addtolinkedHashset(LSHMovie, new Movie("Cassablanka",1978,"Drama"));
		LSHF.addtolinkedHashset(LSHMovie, new Movie("Once upon a time in West",1956,"Drama"));
		LSHF.addtolinkedHashset(LSHMovie, new Movie("Once upon a time in Americs",1982,"Drama"));	
		Movie M1000BC = new Movie("1000BC",2006," Historic Drama");
		LSHF.addtolinkedHashset(LSHMovie,M1000BC);
		//Display the LinkedHashSet
		LSHF.displaylinkedHashset(LSHMovie);
		System.out.println("LinkedHashSet Contains :"+LSHMovie.contains(M1000BC));
		System.out.println("LinkedHashSet Size :"+LSHMovie.size());
		//
		Object[] MovArr = (Object[])(LSHMovie.toArray());
		for(Object EachMovie:MovArr)
			{
				System.out.print((Movie)EachMovie);
			}
 	}
}

/*OUTPUT:
	[Movie [title=Cassablanka, year=1978, genere=Drama]
			, Movie [title=Once upon a time in West, year=1956, genere=Drama]
			, Movie [title=Once upon a time in Americs, year=1982, genere=Drama]
			, Movie [title=1000BC, year=2006, genere= Historic Drama]
			]
			LinkedHashSet Contains :true
			LinkedHashSet Size :4
			Movie [title=Cassablanka, year=1978, genere=Drama]
			Movie [title=Once upon a time in West, year=1956, genere=Drama]
			Movie [title=Once upon a time in Americs, year=1982, genere=Drama]
			Movie [title=1000BC, year=2006, genere= Historic Drama]
*/