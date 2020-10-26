package chap11.object.equals;

public class Book {
private int barCode;

public Book(int BarCode) {
	this.barCode = barCode;
}
@Override
	public int hashCode() {
		return barCode;
	}
@Override
public boolean equals(Object obj) {
	Book o = (Book) obj;
}
}
