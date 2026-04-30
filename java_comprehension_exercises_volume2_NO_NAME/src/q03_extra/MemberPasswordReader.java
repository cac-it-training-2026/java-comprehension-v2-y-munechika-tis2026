package q03_extra;

import java.util.regex.Pattern;

class MemberPasswordReader {
	class MemberNameReader implements IConsoleReader {
		public String setErrorMsg() {
			System.out.println("「8 文字以上 16 文字以内の半角英数字で入力してください");
		}

		public boolean isValid(String inpuString) {
			Pattern p = Pattern.compile("^$");
		}

		public boolean isParseInt() {

		}
}
