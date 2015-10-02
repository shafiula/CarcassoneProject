package code;

import java.util.ArrayList;
import java.util.HashMap;

public class Tile {
	private int tileNorth;
	private int tileEast;
	private int tileSouth;
	private int tileWest;
	public Tile(int north, int east, int south, int west){ // 0 = FIELD; 1 = ROAD; 2 = CITY
		tileNorth = north;
		tileEast = east;
		tileSouth = south;
		tileWest = west;
	}
	private int infoNorth(){
		return tileNorth;
	}
	private int infoEast(){
		return tileEast;
	}
	private int infoSouth(){
		return tileSouth;
	}
	private int infoWest(){
		return tileWest;
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
	private boolean validPlacement(Tile northSide, Tile eastSide, Tile southSide, Tile westSide, Tile placing){
		//if south tile has road: tile.infoSouth==1;
		//if west tile has city: tile.infoWest==2;
		// etc. etc.
		boolean canPlace = false;
		if (northSide.infoSouth()==placing.infoNorth() && 
				eastSide.infoWest()==placing.infoEast() &&
				southSide.infoNorth()==placing.infoSouth() &&
				westSide.infoEast()==placing.infoWest()){
			canPlace = true;
		}
		return canPlace;
	}
}
