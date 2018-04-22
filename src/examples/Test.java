package examples;

public class Test {

	@org.junit.Test
	public void testGroovy() {
		ICNDBService icndbService=new ICNDBService();
		icndbService.getJokes();
	}
	
}
