package q02_advanced.question02;

public class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(Member[] members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(Member[] members, int targetId, String newPassword) {
		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				return;
			}
		}
		System.out.println("該当者はいませんでした。");
	}
}
