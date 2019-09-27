package com.stbo.myprojects.snake;

public class Field {

	// Purpose: Create a field with borders for the sanke

	private Character[][] arr;

	public void generateField(int row, int col) {

		arr = new Character[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j > 0 && i == 0 && j < arr[i].length - 1) {
					arr[i][j] = '#';
				} else if (j > 0 && i == arr.length - 1 && j < arr[i].length - 1) {
					arr[i][j] = '#';
				} else if (j == arr[i].length - 1) {
					arr[i][j] = '#';
				} else if (j == 0) {
					arr[i][j] = '#';
				} else {
					arr[i][j] = ' ';
				}
			}
		}
	}

	public void printField() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public Character[][] getArr() {
		return arr;
	}

	public void setArr(Character[][] arr) {
		this.arr = arr;
	}

}
