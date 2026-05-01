package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//TODO ここから実装する
		System.out.println("===会員情報を表示します===");
		ConsoleReader cr = new ConsoleReader();

		List<Member> members = new ArrayList<Member>();

		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int targetId;
		String newPassword;

		try {
			System.out.print("input target id>>");
			targetId = cr.inputNumber();
			System.out.print("input new password>>");
			newPassword = cr.inputString();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, targetId, newPassword);

		MemberManager.showAllMembers(members);
	}

}
