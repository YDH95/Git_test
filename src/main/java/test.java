import java.util.Arrays;

public class test {

	public static String accum(String s) {
		String[] arr = s.split("");
		String str = "";

		for (int i = 0; i < arr.length; i++) {
			str += arr[i].toUpperCase();
			for (int j = 0; j < i; j++) {
				str += arr[i].toLowerCase();
			}
			str += "-";
		}
		str = str.substring(0, str.length() - 1);
		return str;
	}

	public static void main(String[] args) {
//		Code_war code = new Code_war();
		accum("ZpglnRxqenU");
	}
	/*
	 * testing(Accumul.accum("ZpglnRxqenU"),
	 * "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu"
	 * ); testing(Accumul.accum("NyffsGeyylB"),
	 * "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb"
	 * ); testing(Accumul.accum("MjtkuBovqrU"),
	 * "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu"
	 * ); testing(Accumul.accum("EvidjUnokmM"),
	 * "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm"
	 * ); testing(Accumul.accum("HbideVbxncC"),
	 * "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc"
	 * );
	 */

}
