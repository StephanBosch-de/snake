package com.stbo.myprojects.snake;

public class App 
{
    public static void main( String[] args )
    {
    	// 
        Field field1 = new Field();
        field1.generateField(10,15);
        
        Player player1 = new Player(field1);
        player1.twistPlayer(field1);


    }
}
