package net.evoja.checkerframework.purity;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParserBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;

public class PurityJsonwebtokenTest {
	private static final String KEY = "0123456789abcdef0123456789abcdef";

	@Test
	public void jwt_getBody_pure() throws Exception {
		var claims = Map.of("name", "Petya", "age", 10);
		Key key = Keys.hmacShaKeyFor(KEY.getBytes(StandardCharsets.UTF_8));
		var token = Jwts.builder()
			.setClaims(claims)
			.signWith(key)
			.compact();

		Jws<Claims> x = Jwts.parserBuilder()
			.setSigningKey(KEY.getBytes(StandardCharsets.UTF_8))
			.build()
			.parseClaimsJws(token);

		var b1 = x.getBody();
		var b2 = x.getBody();

		Assertions.assertSame(b1, b2);
	}

	@Test
	public void jwtBuilder_compact_nonDeterministic() throws Exception {
		var claims = Map.of("name", "Petya", "age", 10);
		Key key = Keys.hmacShaKeyFor(KEY.getBytes(StandardCharsets.UTF_8));
		var token = Jwts.builder()
			.setClaims(claims)
			.signWith(key)
			.compact();
		Jws<Claims> x = Jwts.parserBuilder()
			.setSigningKey(KEY.getBytes(StandardCharsets.UTF_8))
			.build()
			.parseClaimsJws(token);
		var builder = Jwts.builder()
			.setClaims(x.getBody())
			.signWith(Keys.hmacShaKeyFor(KEY.getBytes(StandardCharsets.UTF_8)));

		var s1 = builder.compact();
		var s2 = builder.compact();

		Assertions.assertNotSame(s1, s2);
	}

	@Test
	public void jwtParserBuilder_build_nonDeterministic() throws Exception {
		JwtParserBuilder x = Jwts.parserBuilder()
			.setSigningKey(KEY.getBytes(StandardCharsets.UTF_8));

		var b1 = x.build();
		var b2 = x.build();

		Assertions.assertNotSame(b1, b2);
	}

	@Test
	public void jwtParserBuilder_parserBuilder_nonDeterministic() throws Exception {
		JwtParserBuilder b1 = Jwts.parserBuilder();
		JwtParserBuilder b2 = Jwts.parserBuilder();
		Assertions.assertNotSame(b1, b2);
	}

	@Test
	public void keys_hmacShaKeyFor_nonDeterministic() throws Exception {
		Key k1 = Keys.hmacShaKeyFor(KEY.getBytes(StandardCharsets.UTF_8));
		Key k2 = Keys.hmacShaKeyFor(KEY.getBytes(StandardCharsets.UTF_8));
		Assertions.assertNotSame(k1, k2);
	}

}
