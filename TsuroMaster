import java.util.*;


public class TsuroMaster {
	public static ArrayList<ArrayList<Tile>> board;
	
	public static void createBoard() {
		board = new ArrayList<ArrayList<Tile>>();
		for (int i=0; i<6; i++) {
			ArrayList<Tile> tempArrayList = new ArrayList<Tile>();
			for (int j=0; j<6; j++) {
				int[] tempPairs = {-1,-1,-1,-1,-1,-1,-1,-1};
				Tile tempTile = new Tile(tempPairs,-1);
				tempArrayList.add(tempTile);
			}
			board.add(tempArrayList);
		}
	}
	
	public static void placeTile(int row, int col, Tile tile) {
		board.get(row).set(col, tile);
	}
	
	public static void main(String[] args) {
		createBoard();
		int[] tempPairs1 = {2,5,0,7,6,1,4,3};
		placeTile(1,1,new Tile(tempPairs1,1));
		System.out.println(board.get(1));
	}
}
