import java.util.*;


public class BlackJack {
	
	public static void theGame(){
		//die config
				Random dice = new Random();
				
				//global ints to track score
				int dealerScore = 0;
				int computerScore = 0;
				String totalScore = "Dealer: " + dealerScore + " | Computer: " + computerScore;
			
				
				System.out.println("Welcome Player! You are the Dealer in this modified game on BlackJack. You play against the computer.");
				System.out.println("As the Dealer, you may roll the dice first. The computer goes right after.");
				dealerScore += dice.nextInt(11) + 1;
				System.out.println("Your first number is " + dealerScore);
				computerScore += dice.nextInt(11) + 1;
				System.out.println("Computer's number is " + computerScore);
				
				
				
				
				String stayroll = "SR";
				
				
				while(dealerScore <= 21 && computerScore <= 21){
					
					Scanner response = new Scanner(System.in);
					System.out.println("Stay or Roll?(S/R)");
					String choice = response.nextLine();
					response.close();
					char choice_letter = choice.charAt(0);
					
					
					
					int answer = 0;
					//converts the input of choice to a binary by adding 0 or 1 to answer. 
					//stay would be converted to 0, roll would be 1
					int i = 0;
					while (i < stayroll.length() - 1){
				        if (choice_letter == stayroll.charAt(0)){
				        	answer = 0;
				        }else{
				        	answer = 1;	
				        }
				        i++;
					}
					//convert over
					
					if(answer == 0){
						dealerScore += dice.nextInt(11) + 1;
						
					}
					

					
					//randomizes the computer's choice
					int x = 0;
					int computersTurn = 0;
					
					System.out.print("The computer picks... ");
					while(x < 1){
						computersTurn = dice.nextInt(1) + 1;
						if(computersTurn == 0){
							System.out.println("Stay");
							
						}else{
							System.out.println("Roll");
							computerScore = dice.nextInt(11) + 1;
							
						}
					x++;
					}
					//End of computer's choice
					
					
					

					
					//Announces current score and clears int answer
					System.out.println(totalScore);
					System.out.println("------------------------------------------------------");
					System.out.println("");
				}
				
				
				
				//Winner Decider
				if(dealerScore == 21 || computerScore > 21){
					System.out.println("You won the game!");
					
				}else if(computerScore == 21 || dealerScore > 21){
					System.out.println("You lost to the computer.");
					
					
				}
				
				
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		theGame();		
	}

}
