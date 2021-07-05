import java.util.Scanner;
public class SnakeLadder{
	public static void main(String args[]){
		System.out.println("Welcome to the player");
		int position1 = 0;
		int position2 = 0;
		int roll1 = 0;
		int roll2 = 0;
		int score1;
		int score2;
		//System.out.println(score);
		for(int i=1;i<=2;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the player to play: ");
			int player = sc.nextInt();
			switch(player){
			case 1:
			while(position1<100){
				int run =(int) Math.floor(Math.random()*10)%3;
				score1 = (int) Math.floor(Math.random()*10)%6;
				switch(run){
					case 1:
						//score = (int) Math.floor(Math.random()*10)%6;
						position1 += score1;
						roll1++;
						if (position1>100)
							position1 -= score1;
						//System.out.println(position1);
						break;
					case 2:
						//score = (int) Math.floor(Math.random()*10)%6;
						if (position1 >= score1){
							position1 -= score1;
						}else {
							position1 = 0;
						}
					//System.out.println(position1);
					roll1++;
					break;
					default:
						//System.out.println("No chance to play");
						roll1++;
					}
				}
				System.out.println("Player1 is at "+position1+"th position");
				System.out.println("finished in "+roll1+" rolls");
				break;
			case 2:
			while(position2<100){
				int run =(int) Math.floor(Math.random()*10)%3;
				score2 = (int) Math.floor(Math.random()*10)%6;
				switch(run){
					case 1:
						//score = (int) Math.floor(Math.random()*10)%6;
						position2 += score2;
						roll2++;
						if (position2>100)
							position2 -= score2;
						//System.out.println(position2);
						break;
					case 2:
						//score = (int) Math.floor(Math.random()*10)%6;
						if (position2 >= score2){
							position2 -= score2;
						}else {
							position2 = 0;
						}
						//System.out.println(position2);
						roll2++;
						break;
					default:
						//System.out.println("No chance to play");
						roll2++;
				}
				}
				System.out.println("Player2 is at "+position2+"th position");
				System.out.println("finished in "+roll2+" rolls");
				break;
			}
		}
		if (position1>position2){
			System.out.println("Player1 is the winner");
		}else {
			System.out.println("Player2 is the winner");
			}
	}
}
