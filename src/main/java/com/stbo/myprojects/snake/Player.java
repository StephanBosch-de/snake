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
		currRow = 2;
		currCol = 2;
		counter = 0;
		field.getArr()[currRow][currCol] = snake[counter];
		field.printField();

	}

	public void twistPlayer(Field field) {
		int temp = 0;
		char command;

		while (temp == 0) {
			System.out.println("In welche Richtung soll sich die Schlange bewegen?");
			System.out.println("a = Drehung links; d = Drehung rechts; w = Vorrücken");
			System.out.println("Für das Beenden bitte 'q' drücken");
			command = sc.next().charAt(0);

			switch (command) {
			case 'a':
				if (counter == 0) {
					counter = 3;
				} else if (counter == 1) {
					counter = 0;
				} else if (counter == 2) {
					counter = 1;
				} else if (counter == 3) {
					counter = 2;
				}
				break;
			case 'd':
				if (counter == 0) {
					counter = 1;
				} else if (counter == 1) {
					counter = 2;
				} else if (counter == 2) {
					counter = 3;
				} else if (counter == 3) {
					counter = 0;
				}
				break;
			case 'w':
				field.getArr()[currRow][currCol] = ' ';
				if (counter == 0 && field.getArr()[currRow - 1][currCol] != '*') {
					currRow -= 1;
				} else if (counter == 1 && field.getArr()[currRow][currCol + 1] != '*') {
					currCol += 1;
				} else if (counter == 2 && field.getArr()[currRow + 1][currCol] != '*') {
					currRow += 1;
				} else if (counter == 3 && field.getArr()[currRow][currCol - 1] != '*') {
					currCol -= 1;
				} else {
					System.out.println("Spielfeld kann nicht verlassen werden");
				}
				break;
			case 'q':
				temp = 1;
				break;
			default:
				System.out.println("Unknown command");
			}
			field.getArr()[currRow][currCol] = snake[counter];
			field.printField();
		}
	}
}
