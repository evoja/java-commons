package net.evoja.checkerframework.purity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Base64;

public class PurityBase64Test {
	@Test
	public void getDecoder_pure() {
		var a = Base64.getDecoder();
		var b = Base64.getDecoder();
		Assertions.assertSame(a, b);
	}

	@Test
	public void getUrlDecoder_pure() {
		var a = Base64.getUrlDecoder();
		var b = Base64.getUrlDecoder();
		Assertions.assertSame(a, b);
	}

	@Test
	public void getEncoder_pure() {
		var a = Base64.getEncoder();
		var b = Base64.getEncoder();
		Assertions.assertSame(a, b);
	}

	@Test
	public void getUrlEncoder_pure() {
		var a = Base64.getUrlEncoder();
		var b = Base64.getUrlEncoder();
		Assertions.assertSame(a, b);
	}
}
