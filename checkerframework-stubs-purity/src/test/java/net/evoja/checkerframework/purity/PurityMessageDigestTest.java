package net.evoja.checkerframework.purity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.MessageDigest;

public class PurityMessageDigestTest {

	@Test
	public void getInstance_notDeterministic() throws Exception {
		var a = MessageDigest.getInstance("SHA-256");
		var b = MessageDigest.getInstance("SHA-256");
		var c = MessageDigest.getInstance("SHA-1");
		var d = MessageDigest.getInstance("SHA-1");
		Assertions.assertNotSame(a, b);
		Assertions.assertNotSame(c, d);
		Assertions.assertNotSame(a, c);
	}

}
