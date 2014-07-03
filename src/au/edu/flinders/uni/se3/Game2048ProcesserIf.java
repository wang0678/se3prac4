package au.edu.flinders.uni.se3;

public interface Game2048ProcesserIf {

	/**
	 * tilt the board left all numbers should moved to left with same numbers in
	 * adjacent cells merged and add a new number in empty cells randomly
	 * 
	 */
	public void tilt_board_left();

	/**
	 * To get the total score that played so far
	 */
	public int score();

}