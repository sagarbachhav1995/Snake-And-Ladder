package com.blz.sanake.ladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = 0;
		Random ran = new Random();

		int dice = ran.nextInt(6) + 1;
		System.out.println("Dice Outcome : " + dice);
	}

}
