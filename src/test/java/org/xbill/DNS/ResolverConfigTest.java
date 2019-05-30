package org.xbill.DNS;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class ResolverConfigTest {

	@BeforeEach
	void setUp() {
	}

	@AfterEach
	void tearDown() {
	}

	@Test
	@EnabledOnOs({OS.WINDOWS})
	void findNT_Success() {
		assertTrue(ResolverConfig.getCurrentConfig().findNT());
	}

	@Test
	@DisabledOnOs({OS.WINDOWS})
	void findNT_Failure() {
		assertFalse(ResolverConfig.getCurrentConfig().findNT());
	}

	@Test
	void find95() {
		assertFalse(ResolverConfig.getCurrentConfig().find95());
	}
}
