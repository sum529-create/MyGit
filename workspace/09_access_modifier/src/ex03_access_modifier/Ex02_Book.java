package ex03_access_modifier;

class Book{
	private String sub;
	private String author;
	private int price;
	private int count;
	private boolean best;
	
	
	// setter
	public void setSub(String sub) {
		this.sub = sub;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
		setBest(count >= 1000);		// setAmount 호출하면 setBestSeller 함께 호출된다.
	}
	// Book 클래스 내부에서만 호출 할 수 있도록 private 처리했다.
	// 메인에서 잘못 사용방지 ex) ~setBestSellet(false);
	private void setBest(boolean best) {
		this.best = best;
	}
	
	public String getSub() {
		return sub;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public boolean getBest() {
		return best;
	}
}

public class Ex02_Book {

	public static void main(String[] args) {
		Book bestSell = new Book();
		bestSell.setSub("어린왕자");
		bestSell.setAuthor("생떽쥐베리");
		bestSell.setPrice(10000);
		bestSell.setCount(1000);
		
		System.out.println(bestSell.getSub());
		System.out.println(bestSell.getAuthor());
		System.out.println(bestSell.getPrice());
		System.out.println(bestSell.getCount());
		System.out.println(bestSell.getBest() ? "베스트 셀러" : "일반서적");
		
	}

}
