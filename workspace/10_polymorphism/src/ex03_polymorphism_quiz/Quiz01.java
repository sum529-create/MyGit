package ex03_polymorphism_quiz;

class Elec{
	
	private String model;
	private int price;
	
	public Elec(String model, int price){
		super();
		this.model = model;
		this.price = price;
	}
	
	
	public Elec() {	}
	
	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

class TV extends Elec{
	
	public TV(String model, int price) {
		super(model, price);
	}
	
	
	
}

class Radio extends Elec{

	public Radio(String model, int price) {
		super(model, price);

	}
	
	
}

class Customer extends Elec{
	
	private int money;
	private double bonusPoint;	// 5%
	private Elec[] cart;
	private int idx;
	
	public Customer(int money){
		super();
		this.money = money;
		cart = new Elec[5];
		idx = 0;
	}

	public void buy(Elec product) {		// upcasting
		
		cart[idx++] = product;
		
		// product의 price : product.getPrice()
		
		if(money < product.getPrice()) {
			System.out.println("돈이 " + (product.getPrice() - money) + "만원 부족합니다.");
			return;		// buy 메소드의 종료
		}
		
		// 위에 금액을 어찌 불러올수 있을까..	=> product.getPrice()!!
		money -= product.getPrice();
		bonusPoint += product.getPrice() * 0.05;
	}

	public void buyList() {
		if(idx == 0) {
			System.out.println("구매한 제품이 없습니다.");
			return;
		}
		int total = 0;
		for(Elec product : cart) {
			if(product != null) {
				System.out.println(product.getModel() + "\t" + product.getPrice() + "만원");				
				total += product.getPrice();
			}
		}
		System.out.println("------------------------");
		System.out.println("총 구매금액\t" + total + "만원");
		System.out.println("보너스포인트\t" + bonusPoint + "만원");
		System.out.println("남은돈\t\t" + money + "만원");
	}

	
}

public class Quiz01 {

	public static void main(String[] args) {
		Customer customer = new Customer(1000);
		customer.buy(new TV("LGTV\t", 200));
		customer.buy(new Radio("삼성Radio", 10));
		customer.buyList();
		
	}
	
}
