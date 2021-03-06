import java.util.*;

public class Tile {
	public int[] pairs;
	public int id;
	
	public Tile(int[] pairs, int id){
		this.pairs = pairs;
		this.id = id;
	}
	
	public String toString() {
		if(this.id==0) {
			return "Tile 0 is the Dragon Tile";
		}
		else {
			return "Tile " + id + "'s pairs are " + Arrays.toString(this.pairs);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Tile> deck = new ArrayList<Tile>();
		
		int[] tempPairs0 = {8,8,8,8,8,8,8,8}; // Dragon Tile, nonsense values
		deck.add(new Tile(tempPairs0,0)); // Dragon Tile is Tile 0
		int[] tempPairs1 = {2,5,0,7,6,1,4,3};
		deck.add(new Tile(tempPairs1,1));
		int[] tempPairs2 = {2,4,0,7,1,6,5,3};
		deck.add(new Tile(tempPairs2,2));
		int[] tempPairs3 = {2,5,0,7,6,1,4,3};
		deck.add(new Tile(tempPairs3,3));
		int[] tempPairs4 = {6,7,4,5,2,3,0,1};
		deck.add(new Tile(tempPairs4,4));
		int[] tempPairs5 = {1,0,5,6,7,2,3,4};
		deck.add(new Tile(tempPairs5,5));
		int[] tempPairs6 = {1,0,7,5,6,3,4,2};
		deck.add(new Tile(tempPairs6,6));
		int[] tempPairs7 = {4,5,6,7,0,1,2,3};
		deck.add(new Tile(tempPairs7,7));
		int[] tempPairs8 = {5,4,7,6,1,0,3,2};
		deck.add(new Tile(tempPairs8,8));
		int[] tempPairs9 = {4,6,7,5,0,3,1,2};
		deck.add(new Tile(tempPairs9,9));
		int[] tempPairs10 = {5,2,1,6,7,0,3,4};
		deck.add(new Tile(tempPairs10,10));
		int[] tempPairs11 = {5,4,3,2,1,0,7,6};
		deck.add(new Tile(tempPairs11,11));
		int[] tempPairs12 = {6,7,5,4,3,2,0,1};
		deck.add(new Tile(tempPairs12,12));
		int[] tempPairs13 = {7,6,5,4,3,2,1,0};
		deck.add(new Tile(tempPairs13,13));
		int[] tempPairs14 = {2,4,0,5,1,3,7,6};
		deck.add(new Tile(tempPairs14,14));
		int[] tempPairs15 = {7,2,1,4,3,6,5,0};
		deck.add(new Tile(tempPairs15,15));
		int[] tempPairs16 = {5,4,6,7,1,0,2,3};
		deck.add(new Tile(tempPairs16,16));
		int[] tempPairs17 = {2,3,0,1,5,4,7,6};
		deck.add(new Tile(tempPairs17,17));
		int[] tempPairs18 = {5,7,6,4,3,0,2,1};
		deck.add(new Tile(tempPairs18,18));
		int[] tempPairs19 = {3,6,5,0,7,2,1,4};
		deck.add(new Tile(tempPairs19,19));
		int[] tempPairs20 = {1,0,6,7,5,4,2,3};
		deck.add(new Tile(tempPairs20,20));
		int[] tempPairs21 = {7,3,4,1,2,6,5,0};
		deck.add(new Tile(tempPairs21,21));
		int[] tempPairs22 = {1,0,7,4,3,6,5,2};
		deck.add(new Tile(tempPairs22,22));
		int[] tempPairs23 = {6,3,5,1,7,2,0,4};
		deck.add(new Tile(tempPairs23,23));
		int[] tempPairs24 = {7,3,6,1,5,4,2,0};
		deck.add(new Tile(tempPairs24,24));
		int[] tempPairs25 = {3,5,6,0,7,1,2,4};
		deck.add(new Tile(tempPairs25,25));
		int[] tempPairs26 = {3,2,1,0,5,4,7,6};
		deck.add(new Tile(tempPairs26,26));
		int[] tempPairs27 = {4,7,6,5,0,3,2,1};
		deck.add(new Tile(tempPairs27,27));
		int[] tempPairs28 = {7,5,3,2,6,1,4,0};
		deck.add(new Tile(tempPairs28,28));
		int[] tempPairs29 = {2,4,0,6,1,7,3,5};
		deck.add(new Tile(tempPairs29,29));
		int[] tempPairs30 = {6,3,4,1,2,7,0,5};
		deck.add(new Tile(tempPairs30,30));
		int[] tempPairs31 = {3,7,4,0,2,6,5,1};
		deck.add(new Tile(tempPairs31,31));
		int[] tempPairs32 = {4,6,3,2,0,7,1,5};
		deck.add(new Tile(tempPairs32,32));
		int[] tempPairs33 = {7,5,6,4,3,1,2,0};
		deck.add(new Tile(tempPairs33,33));
		int[] tempPairs34 = {1,0,5,7,6,2,4,3};
		deck.add(new Tile(tempPairs34,34));
		int[] tempPairs35 = {1,0,3,2,5,4,7,6};
		deck.add(new Tile(tempPairs35,35));
		
		System.out.println(deck.get(0));
		System.out.println(deck.get(6));
		System.out.println(deck.get(15));
		System.out.println(deck.get(35));
	}
}
