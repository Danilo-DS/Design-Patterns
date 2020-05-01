package prototype;

public class Square extends Shape{
		
	protected Square(Shape id, Shape type) {
		this.id = id.getId();
		this.id = type.getType();
	}
	
	protected Square() {}
	
	public Shape Clonar() {
		return new Square(this, this);
	}
	
	public String Show(){
		return ("Quadrado(Id: " + getId() + "Type: " + getType() +")");
	}

	

	
}
