package q03_extra;

import java.util.List;

public class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				return;
			}
		}
		System.out.println("該当者はいませんでした。");
	}

	public static void ShowCreateUser(MemberStorage members, int id) {
		for (Member member : members.getMembers()) {
			if (id == member.getId()) {
				System.out.println(member);
			}
		}
	}
}
