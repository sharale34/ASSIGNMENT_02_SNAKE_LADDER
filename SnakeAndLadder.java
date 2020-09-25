package com.BridgeLabz.SnakeLadder;

public class SnakeAndLadder {
	
	//constants
    public static final int NO_PLAY=1;
    public static final int LADDER=2;
    public static final int SNAKE=3;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int position=0;

		//computation
		int roll=(int) (Math.floor(Math.random() * 6) + 1);
		System.out.println("number on dice: "+roll);
		
		int option = (int) (Math.floor(Math.random() * 3) + 1);
		System.out.println("option: "+option);
		if(option == NO_PLAY)
		{
			position=position;
			System.out.println("Position of Player: "+position);
		}
		else if(option == LADDER)
		{
			position+=roll;
			System.out.println("Position of Player: "+position);
		}
		else
		{
			position-=roll;
			if(position<0) 
			{
				position=0;
			}
			System.out.println("Position of Player: "+position);
		}
	}

}
