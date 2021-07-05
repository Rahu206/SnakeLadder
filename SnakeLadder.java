public class SnakeLadder{
public static void main(String args[]){
		System.out.println("Welcome to the player");
		int position = 0;
		int roll = 0;
		int score;
		//System.out.println(score);
		while(position<=100){
		int run =(int) Math.floor(Math.random()*10)%3;
		switch(run){
		case 1:
                	score = (int) Math.floor(Math.random()*10)%6;
			position += score;
			roll++;
			break;
		case 2:
                	score = (int) Math.floor(Math.random()*10)%6;
			if (position >= score){
			position -= score;
			}else {
			position = 0;
			}
			roll++;
			break;
		default:
			System.out.println("No chance to play");
			roll++;
		}}
		System.out.println(position);
                System.out.println(roll);
	}
}
