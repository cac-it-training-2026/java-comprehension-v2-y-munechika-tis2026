package q03_extra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MemberIdReader implements IConsoleReader {
	public String setErrorMsg() {
		return "1-9の整数を入力してください。";
	}

	public boolean isValid(String inputString) {
		Pattern p = Pattern.compile("^[0-9]$");
		Matcher m = p.matcher(inputString);
		return m.find();
	}

	public boolean isParseInt() {
		return true;
	}
}
