package au.edu.flinders.uni.se3;

import java.util.ArrayList;

import au.edu.flinders.uni.se3.util.GameUtil;
import au.edu.flinders.uni.se3.Game2048ProcesserIf;

public class Game2048Core implements Game2048ProcesserIf {
	private static final int ROWS = GameUtil.ROWS;
	private static final int COLS = GameUtil.COLS;
	private int score = 0;
	
	/**
	 * Method to tilt line to left without same number merge.
	 */
	public int[] tilt_line_left(int[] oldLine) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < ROWS; i++) {
			if (oldLine[i] != 0) {
				list.add(new Integer(oldLine[i]));
			}
		}
		if (list.size() == 0) {
			return oldLine;
		} else {
			int[] after = new int[COLS];

			for (int i = 0; i < list.size(); i++) {
				after[i] = list.get(i).intValue();
			}
			return after;
		}
	}

	/**
	 * Method to merge same number in adjacent cells. The input line should
	 * comply with all numbers tilt left without merge (return value of
	 * tilt_line_left method).
	 */
	public int[] combine_tiles(int[] oldline) {
		int j = 0;
		int[] after = new int[COLS];
		for (int i = 0; i < COLS && oldline[i] > 0; i++) {
			int value = oldline[i];
			if (i < COLS - 1 && oldline[i] == oldline[i + 1]) {
				value *= 2;
				// Calculate score here.
				score += value;
				after[j] = value;
				i++;
			} else {
				after[j] = oldline[i];

			}
			j++;
		}

		return after;
			}

	/**
	 * Tilt line number to left with merge.
	 */
	public int[] tilt_line_left_combine(int[] oldline) {
		return combine_tiles(tilt_line_left(oldline));
		}

	/**
	 * To implement the method to tilt the board to left.
	 */
	public void tilt_board_left() {

}

	public int score() {
		return score;
	}


}
