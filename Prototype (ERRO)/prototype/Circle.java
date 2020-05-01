package prototype;

public class Circle extends Shape{
	
	protected Circle(Shape id, Shape type) {
		this.id = id.getId();
		this.type = type.getType();
	}
	
	protected Circle() {
	}
	
	public Shape Clonar() {
		return new Circle(this, this);
	}
	
	public String Show() {
		return ("Cirdulo(Id: " + getId() + "Type: " + getType()+")");
		
	}
	
}
