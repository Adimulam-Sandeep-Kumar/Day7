package ai.jobiak.enums;

public enum Mobile {

	Apple(3000),Google(4000),Blackberry(5000),Samsung(6000);

	int price;
	Mobile(int price) {
		this.price=price;
	}
	
	int showPrice() {
		return this.price;
	}
}
