import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static String getMiddle(String word) {
		int x = 0;
		String[] str = word.split("");
		String answer = "";

		if (str.length % 2 == 0) {
			x = str.length / 2 - 1;
			answer = str[x] + "" + str[x + 1];
		} else {
			x = str.length / 2;
			answer = str[x];
		}

		return answer;
	}

	public static void main(String[] args) {
//		Code_war code = new Code_war();
//		getMiddle("midle");
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Date date1 = sdf.parse("12:27:00");
			System.out.println(date1.getTime());
			
			Date nowDate = new Date();
			String date = nowDate.toString().substring(11, 19);
			System.out.println(date);
			long date2 = sdf.parse(date).getTime();
			System.out.println((date2 - date1.getTime()) / 1000);
			System.out.println((date2 - date1.getTime()) / (1000 * 60));
			System.out.println((date2 - date1.getTime()) / (1000 * 60 * 60));
/*
 * 초 : / 1000 
분 : / (1000 * 60)
시 : / (1000 * 60 * 60)*/			
			
			
//			Calendar cal = Calendar.getInstance();
//			cal.add(Calendar.MONTH, 1);
//			String nowYear = new SimpleDateFormat("HH").format(cal.getTime());
//			String nowMonth = new SimpleDateFormat("mm").format(cal.getTime());
//			System.out.println(nowYear);
//			System.out.println(nowMonth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
