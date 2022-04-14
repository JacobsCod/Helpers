import java.util.ArrayList;

import org.testng.annotations.Test;

public class StreamCls {
	
	
	
	@Test
	public void StreamFilter() {
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("pedro");
		name.add("Alejandro");
		name.add("Miguel");
		name.add("Joselo");
		name.add("Antonio");
		
		long c = name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
	}
	

}
