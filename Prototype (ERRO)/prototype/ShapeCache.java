package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	
	private Map<String,String> map = new HashMap<>();
	
	public ShapeCache() {}
	
	public String getShape(String sh,String id) {
			Shape s = null;
			String result = "";
			for(String shape : map.keySet()) {
				if(shape.equals(sh) && sh.equals("R")) {
					Rectagle r = new Rectagle();
					s = r.Clonar();
					s.setId(id);
					s.setType("Retângulo");
					result = s.Show();
				}
				else if(shape.equals(sh) && sh.equals("C")) {
					Circle c = new Circle();
					s = c.Clonar();
					s.setId(id);
					s.setType("Circulo");
					result = s.Show();
				}
				else if(shape.equals(sh) && sh.equals("S")) {
					Square sq = new Square();
					s = sq.Clonar();
					s.setId(id);
					s.setType("Quadrado");
					result = s.Show();
				}
				else {
					System.out.println("Não Existe esse Shape!");
				}
			}
		return result;		
	}
	
	public void LoadCache(Shape i) {
		
		map.put("R", i.Show());
		map.put("S", i.Show());
		map.put("C", i.Show());
		
	}
}
