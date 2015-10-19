package code;

public class Player {
	private static String[] playerNames; 
	private int turnCounter = 0;
	private static int numberOfP = 0;
	private int playersSet = 0;
	public static void main(String[] args) {
		System.out.println("How many players?");
		numberOfP = Integer.parseInt(args[0]);
		for (int i=0; i < numberOfP+1; i++){
			System.out.println("What is the name of Player " + i + "?");
			playerNames[i] = args[i+1];
		}
		
	}
	public Player(int numberOfPlayers){
		String[] playerNames = new String[numberOfPlayers];
		numberOfP = numberOfPlayers;
	}
	public int whosTurn(){
		return turnCounter % numberOfP;
	}
	public String nameTurn(){
		return playerNames[whosTurn()];
	}
	public int currentTurn(){
		return turnCounter;
	}
	public int nextTurn(){
		turnCounter = turnCounter++;
		return turnCounter % numberOfP;
	}
	public boolean setNameOfPlayer(String name){
		if(playersSet<numberOfP){
			playerNames[playersSet] = name;
			playersSet++;
			return true;
		}
		else{
			return false;
		}
	}
}
