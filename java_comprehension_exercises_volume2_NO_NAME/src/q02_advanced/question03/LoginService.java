package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから処理を記述
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public Member doLogin(int id, String password) {
		try {
			for (Member member : memberStorage.getMembers()) {
				if (id == member.getId() && password.equals(member.getPassword())) {
					return member;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return null;
	}
}
