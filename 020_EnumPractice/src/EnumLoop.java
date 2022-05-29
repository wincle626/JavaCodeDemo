enum Direction {
	NORTH,
	WEST,
	SOUTH,
	EAST
}

public class EnumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( Direction dir : Direction.values() ) {
			System.out.println(dir);
		}

	}

}
