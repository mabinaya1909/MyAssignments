package week3.Assignment;

public class ConcreteClassForInterface implements DatabaseConnection{
	

	public static void main(String[] args) {
		ConcreteClassForInterface concrete = new ConcreteClassForInterface();
		concrete.connect();
		concrete.disconnect();
		concrete.executeUpdate();

	}

	public void connect() {
		System.out.println("Connected successfully");
		
	}

	public void disconnect() {
		System.out.println("Disconnected successfully");
		
	}

	public void executeUpdate() {
		System.out.println("method executed updated successfully");
		
	}

}
