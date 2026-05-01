package q03_extra;

import java.text.ParseException;

/**
 * MemberStorageにアクセスし、ユーザ登録処理を行う
 */
class CreateUserService {
	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから実装する
	public CreateUserService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public boolean execute(int id, String password, String name, String birthday)
			throws IllegalInputException, ParseException {
		for (Member member : memberStorage.getMembers()) {
			if (id == member.getId()) {
				throw new IllegalInputException("IDが重複しています。再度入力してください。");
			}

			Member newMember = Member.getInstance(id, password, name, birthday);
			memberStorage.getMembers().add(newMember);
			return true;
		}
		return false;
	}
}
