
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		
//		Shape shape0 = shapeFactory.getShape(null);
//		shape0.draw();
		
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw(); 
		
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		
		Shape shape3 = shapeFactory1.getShape("ROUNDEDRECTANGLE");
		shape3.draw();
		
		Shape shape4 = shapeFactory1.getShape("ROUNDEDSQUARE");
		shape4.draw();
	}
}
