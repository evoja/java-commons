package net.evoja.checkerframework.units;

import net.evoja.checkerframework.units.annotation.ms;
import org.checkerframework.checker.units.qual.s;
import org.checkerframework.dataflow.qual.Pure;

@SuppressWarnings({"units", "checkstyle:constantname"})
public class Units {
	public static final @ms int ms = 1;
	public static final @ms int ms0 = 0;

	@Pure
	public static @s int fromMilliSecondToSecond(@ms int ms) {
		return ms / 1000;
	}

	@Pure
	public static @s long fromMilliSecondToSecond(@ms long ms) {
		return ms / 1000;
	}

	@Pure
	public static @ms int fromSecondToMilliSecond(@s int s) {
		return s * 1000;
	}

	@Pure
	public static @ms long fromSecondToMilliSecond(@s long s) {
		return s * 1000;
	}
}
