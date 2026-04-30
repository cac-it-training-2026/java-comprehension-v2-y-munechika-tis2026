package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {
	private int id;
	private String password;
	private String name;
	private Date birthday;
	private int rank;
	private List<Coupon> coupons;

	public Member() {
	}

	public Member(int id, String password, String name, Date birthday, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.rank = rank;
		this.coupons = new ArrayList<Coupon>();
	}

	public static Member getInstance(int id, String password, String name, String birthdayString)
			throws ParseException {
		Date birthday = new SimpleDateFormat("yyyy/MM/dd").parse(birthdayString);

		Member member = new Member(id, password, name, birthday, (int) (Math.random() * 10000 % 3 + 1));

		member.coupons.add(new Coupon(1, 0.5, "最初の特典"));
		member.coupons.add(new Coupon(2, 0.25, "今月の特典"));

		return member;

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday + ", rank="
				+ rank + ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

}
