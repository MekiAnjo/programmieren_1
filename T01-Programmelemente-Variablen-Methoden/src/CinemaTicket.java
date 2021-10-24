package t1;

import java.time.LocalDate; //import class for date alternative

public class CinemaTicket {

	public static void main(String[] args) {

		String movieName = "Pulp Fiction";
		int cinemaAuditorium = 1;
		int seatNumber = 27;
		String visitorName = "Dagmar Mayer";
		String movieDate = "02.02.2022";

		/*
		 * date alternative - initialized with a factory method
		 */
		LocalDate alternativeMovieDate = LocalDate.of(2022, 02, 02);

		System.out.println("-------------------------------------");
		System.out.println("Kinoticket für: " + visitorName);
		System.out.println("Film: " + "\"" + movieName + "\""); // \" inside of a String prints quotation marks
		System.out.println("Saal " + cinemaAuditorium);
		System.out.println("Sitznummer: " + seatNumber);
		System.out.println("Datum der Vorstellung: " + movieDate);
		System.out.println("-------------------------------------");
	}
}
