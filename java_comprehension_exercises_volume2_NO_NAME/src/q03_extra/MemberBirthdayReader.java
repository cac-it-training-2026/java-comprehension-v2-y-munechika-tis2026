package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class MemberBirthdayReader implements IConsoleReader {
	public String setErrorMsg() {
		return "正しい形式(yyyy/MM/dd)で入力してください";
	}

	public boolean isValid(String inputString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");

		sdf.setLenient(false);
		try {
			sdf.parse(inputString);
			return true;
		} catch (ParseException e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean isParseInt() {
		return false;
	}

}
