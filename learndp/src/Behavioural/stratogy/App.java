package Behavioural.stratogy;

public class App {

	public static void main(String[] args) {
		
		//OperationManagerBAD manager = new OperationManagerBAD();
		//manager.execute(new Multiplication(), 10, 5);
		operationManager manager = new operationManager();
		manager.setStrategy(new Addition());
		manager.execute(2,3);
		manager.setStrategy(new Substraction());
		manager.execute(2,3);
		
	}
}
