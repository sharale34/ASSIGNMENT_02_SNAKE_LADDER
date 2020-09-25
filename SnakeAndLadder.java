package com.BridgeLabz.SnakeLadder;

public class SnakeAndLadder {
	
	//constants
    public static final int NO_PLAY=1;
    public static final int LADDER=2;
    public static final int SNAKE=3;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int position1=0;
		int position2=0;
	    int current=0;
	    
		//Computation
        while(position1!=100 && position2!=100)
        {
        if(current%2==0)
        {
        current=position1;
		int roll=(int) (Math.floor(Math.random() * 6) + 1);
		System.out.println("number on dice :"+roll);
		
		int option = (int) (Math.floor(Math.random() * 3) + 1);
		System.out.println("option :"+option);
		if(option == NO_PLAY)
		{
			position1=position1;
			System.out.println("Position :"+position1);
		}
		else if(option == LADDER)
		{
			position1+=roll;
			while(option != LADDER)
			{
			roll=(int)(Math.floor(Math.random() * 6) + 1);
			position1+=roll;
			}
			System.out.println("Position :"+position1);
		}
		else
		{
			position1-=roll;
			if(position1<0) 
			{
				position1=0;
			}
			System.out.println("Position :"+position1);
		}
        }
        else
        {
        	current=position2;
        	int roll=(int) (Math.floor(Math.random() * 6) + 1);
    		System.out.println("number on dice :"+roll);
    		
    		int option = (int) (Math.floor(Math.random() * 3) + 1);
    		System.out.println("option :"+option);
    		if(option == NO_PLAY)
    		{
    			position2=position2;
    			System.out.println("Position :"+position2);
    		}
    		else if(option == LADDER)
    		{
    			position2+=roll;
    			while(option != LADDER)
    			{
    			roll=(int)(Math.floor(Math.random() * 6) + 1);
    			position2+=roll;
    			}
    			System.out.println("Position :"+position2);
    		}
    		else
    		{
    			position2-=roll;
    			if(position2<0) 
    			{
    				position2=0;
    			}
    			System.out.println("Position :"+position2);
    		}
        	
        }
        current++;
        }
        if(position1>position2)
        {
        	System.out.println("Player1 has Won the Game");
        }
        else if(position1<position2)
        {
        	System.out.println("Player2 has Won the Game");
        }
        else
        {
        	System.out.println("Player1 and Player2 are Winner");
        }
		
	}

}
