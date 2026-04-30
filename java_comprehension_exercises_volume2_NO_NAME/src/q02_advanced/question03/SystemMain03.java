package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();

		LoginService loginService = new LoginService(new MemberStorage());

		Member user = null;

		while (!(isLogin)) {
			int inputId = 0;
			String inputPassword = "";

			try {
				System.out.print("input id>>");
				inputId = cr.inputNumber();

				System.out.print("input password>>");
				inputPassword = cr.inputString();
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("不正な入力です。再度入力してください。");
				continue;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.exit(0);
			}

			user = loginService.doLogin(inputId, inputPassword);

			if (user == null) {
				System.out.println("IDまたはパスワードが違っています。再度入力してください。");
				continue;
			} else {
				System.out.println("ログインに成功しました。");
				isLogin = true;
			}
		}

		System.out.println(user);

	}

}
