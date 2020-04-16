package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i = 0;
		Room[] room = new Room[10];

		while (i <= 9) {
			room[i] = new Room(i, null, null);
			i++;
		}

		for (int x = 0; x < room.length; x++) {

			System.out.println("Room: " + room[x]);

		}

		System.out.println("Welcome to the Room Rental System");
		System.out.print("Please, How many rooms will be rented? ");
		int quantityRooms = sc.nextInt();
		
		

	}

}
