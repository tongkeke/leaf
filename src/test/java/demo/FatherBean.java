package demo;

import org.springframework.stereotype.Repository;
/*@Repository*/
public class FatherBean {
	private String money;

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
}
