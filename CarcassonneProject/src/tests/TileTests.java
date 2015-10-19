package tests;

import org.junit.Test;

import code.Tile;

public class TileTests {
	
	private Tile a = new Tile(Tile.setCity(),Tile.setCity(),Tile.setField(),Tile.setRoad());
	@Test
	private void test01(){infoTests(a);}
	public void infoTests (Tile input){
		int[] temp = new int[3];
		temp[0] = a.infoNorth()[0];
		temp[1] = a.infoNorth()[1];
		temp[2] = a.infoNorth()[2];
		boolean ok = false;
		if (temp[0] == 2 &&
				temp[1] == 2 &&
				temp[2] == 2){
			ok = true;
		}
		assertTrue("setCity did not apply to North", ok);
	}
	
}