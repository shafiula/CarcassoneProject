package code;

import java.util.ArrayList;
import java.util.HashMap;

public class Tile {
	private HashMap<Integer, Integer> _side;
	public Tile(City c, Field f, Road r){
		_side = new HashMap<>();
		_side // (0,x) = north; (1,x) = east; (2,x) = west; (3,x) = south
		// (x, 0) = City; (x, 1) = Field, (x, 2) = Road
		if(hasCity = true){
			// which sides have city
		}
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
	private boolean validPlacement(Tile t){
		return true;
	}
}
