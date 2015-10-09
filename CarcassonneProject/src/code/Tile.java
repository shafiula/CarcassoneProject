package code;


public class Tile {
	private int[] tileNorth = new int[3];
	private int[] tileEast = new int [3];
	private int[] tileSouth = new int [3];
	private int[] tileWest = new int [3];
	
	public Tile(int north[], int east[], int south[], int west[]){ // 0 = FIELD; 1 = ROAD; 2 = CITY
		tileNorth = north;
		tileEast =  east;
		tileSouth = south;
		tileWest =  west;
	}

	private int[] infoNorth(){
		return tileNorth;
	}

	private int[] infoEast(){
		return tileEast;
	}

	private int[] infoSouth(){
		return tileSouth;
	}

	private int[] infoWest(){
		return tileWest;
	}


	public static int[] setCity(){
		int[] temp = new int[3];
		temp[0] = 2;
		temp[1] = 2;
		temp[2] = 2;
		return temp;
	}

	public static int[] setRoad(){
		int[] temp = new int[3];
		temp[0] = 0;
		temp[1] = 1;
		temp[2] = 0;
		return temp;
	}

	public static int[] setField(){
		int[] temp = new int[3];
		temp[0] = 0;
		temp[1] = 0;
		temp[2] = 0;
		return temp;
	}

	public void placeTile (){

	}

	public void drawTile(){

	}

	public void removeTile(){

	}

	public void rotateTile(){

	}

	public void generateTiles(){
		
	}
	
	public boolean validPlacement(Tile side, int news, Tile placing){
		boolean canPlace = false;
		int[] temp = new int [3];
		if (news == 0){ //north (of placing)
			temp = placing.infoNorth();
			if(temp[0] == side.infoSouth()[0] &&
					temp[1] == side.infoSouth()[1] &&
					temp[2] == side.infoSouth()[2]){
				canPlace = true;
			}
		}
		if (news == 1){ //east
			temp = placing.infoEast();
			if(temp[0] == side.infoWest()[0] &&
					temp[1] == side.infoWest()[1] &&
					temp[2] == side.infoWest()[2]){
				canPlace = true;
			}
		}
		if (news == 2){ //south
			temp = placing.infoSouth();
			if(temp[0] == side.infoNorth()[0] &&
					temp[1] == side.infoNorth()[1] &&
					temp[2] == side.infoNorth()[2]){
				canPlace = true;
			}
		}
		if (news == 3){ //west
			temp = placing.infoWest();
			if(temp[0] == side.infoEast()[0] &&
					temp[1] == side.infoEast()[1] &&
					temp[2] == side.infoEast()[2]){
				canPlace = true;
			}
		}
		return canPlace;
	}
}		