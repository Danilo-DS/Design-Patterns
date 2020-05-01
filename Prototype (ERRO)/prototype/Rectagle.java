package prototype;

public class Rectagle extends Shape {
	
	protected Rectagle(Shape id, Shape type) {
		this.id = id.getId();
		this.type = type.getType();
	}
	
	protected Rectagle() {}
	
	public Shape Clonar() {
		return new Rectagle(this, this);
	}
	
	public String Show() {
		return ("Retângulo(Id: " + getId() + "Type: " + getType() +")");
	}
}
