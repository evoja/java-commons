package net.evoja.checkerframework.purity;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PurityObjectMapperTest {
	@Test
	public void writeValueAsString_nonDeterministic() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Person a = new Person("Petya", 10);
		Person b = new Person("Petya", 10);
		String x = mapper.writeValueAsString(a);
		String y = mapper.writeValueAsString(a);
		String z = mapper.writeValueAsString(b);
		Assertions.assertNotSame(x, y);
		Assertions.assertNotSame(x, z);
		Assertions.assertNotSame(y, z);
	}

}
