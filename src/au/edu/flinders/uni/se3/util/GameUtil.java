package au.edu.flinders.uni.se3.util;

public abstract class GameUtil {

	public static final String PASSED = " - PASSED!";

	public static final String FAILED = " - FAILED!";

	public static final String SEP = ",";

	public static final int ROWS = 4;

	public static final int COLS = 4;

	

	public static boolean compareExpectToActualLine(int[] expected, int[] actual) {
		if (expected == null || actual == null
				|| expected.length != actual.length) {
			return false;
		}
		for (int i = 0; i < expected.length; i++) {
			if (expected[i] != actual[i]) {
				return false;
			}
		}
		return true;
	}

	public static void printLine(int[] old, String message, int[] after,
			int[] expected, String status) {
		if (message == null || "".equalsIgnoreCase(message)) {
			message = " after tilt_line_left became ";
		}
		String expectedStr = " and the expected is ";
		System.out.println(convertLineToTxtWithSep(old) + message
				+ GameUtil.convertLineToTxtWithSep(after) + expectedStr
				+ GameUtil.convertLineToTxtWithSep(expected) + status);
	}

	public static String convertLineToTxtWithSep(int[] value) {
		if (value == null || value.length < 4) {
			return "";
		}

		String txt = "{" + value[0] + SEP + value[1] + SEP + value[2] + SEP
				+ value[3] + "}";
		return txt;
	}

	public static String convertLineToTxtWithSep(int i1, int i2, int i3, int i4) {
		String txt = "{" + i1 + SEP + i2 + SEP + i3 + SEP + i4 + "}";
		return txt;
	}
	
	
	

}
