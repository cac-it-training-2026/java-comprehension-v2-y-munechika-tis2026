package q03_extra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MemberPasswordReader implements IConsoleReader {
	public String setErrorMsg() {
		return "8 文字以上 16 文字以内の半角英数字で入力してください";
	}

	public boolean isValid(String inputString) {
		Pattern p = Pattern.compile("^[a-zA-Z1-9]{8,16}$");
		Matcher m = p.matcher(inputString);
		return m.find();
	}

	public boolean isParseInt() {
		return false;
	}
}
