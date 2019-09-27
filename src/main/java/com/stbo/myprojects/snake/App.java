package com.stbo.myprojects.snake;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Field field1 = new Field();
        
        field1.generateField(8,12);
        field1.printField();
        
        Player player1 = new Player(field1);

        player1.twistPlayer(field1);
        player1.twistPlayer(field1);
        player1.twistPlayer(field1);
        player1.twistPlayer(field1);
    }
}
