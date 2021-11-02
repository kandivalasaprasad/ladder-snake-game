package snake_ladder;

import java.util.Random;

public class snake_ladder_uc2 {

	public static void main(String[] args) {
		int position = 0;
		
		int dies = (int) ((Math.random()*10) % 6) + 1;
		position = position + dies;
		System.out.println("position is:" + dies);

	}

}
