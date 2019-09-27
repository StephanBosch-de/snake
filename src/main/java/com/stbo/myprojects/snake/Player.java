package com.stbo.myprojects.snake;

import java.util.Scanner;

public class Player {

	private char[] snake;
	private int currRow;
	private int currCol;
	private int counter;
	private Scanner sc = new Scanner(System.in);

	Player(Field field) {

		snake = new char[4];
		snake[0] = '^';
		snake[1] = '>';
		snake[2] = 'v';
		snake[3] = '<';
		currRow = 3;
		currCol = 3;
		counter = 0;
		field.getArr()[currRow][currCol] = snake[counter];

	}

	/*
	 * Pseudo-Code - Eingabe abfragen - In welche Richtung soll Snake sich drehen -
	 * If-Konstrukt: Wenn "d" gedrückt wird -> Drehe nach rechts Wenn "a" gedrückt
	 * wird -> Drehe nach links Wenn "w" gedrückt wird -> Rücke vor
	 * 
	 * 
	 */
	public void twistPlayer(Field field) {
		System.out.println("In welche Richtung soll sich die Schlange bewegen?");
		System.out.println("a = links; d = rechts");
		System.out.println("Für das Beenden bitte 'q' drücken");
		char command = sc.next().charAt(0);

		if (counter == 0 && command == 'a') {
			counter = 3;
		} else if (counter == 1 && command == 'a') {
			counter = 0;
		} else if (counter == 2 && command == 'a') {
			counter = 1;
		} else if (counter == 3 && command == 'a') {
			counter = 2;
		} else if (counter == 0 && command == 'd') {
			counter = 1;
		} else if (counter == 1 && command == 'd') {
			counter = 2;
		} else if (counter == 2 && command == 'd') {
			counter = 3;
		} else if (counter == 3 && command == 'd') {
			counter = 0;
		} else {
			System.out.println("Unknown command");
		}
		field.getArr()[currRow][currCol] = snake[counter];
		field.printField();

	}
}
