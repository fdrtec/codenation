package challenge;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

	@Before
	public void setUp() {
	}

	@Test
	public void q1() throws Exception {
		assertNotEquals(0, new Main().q1());
		//nationalities = 164
	}

	@Test
	public void q2() throws Exception {
		assertNotEquals(0, new Main().q2());
		//clubs = 648
	}

	@Test
	public void q3() throws Exception {
		List<String> result = new Main().q3();

		assertNotNull(result);
		assertEquals(20, result.size());
	}

	@Test
	public void q4() throws Exception {
		List<String> result = new Main().q4();

		assertNotNull(result);
		assertEquals(10, result.size());
	}

	@Test
	public void q5() throws Exception {
		List<String> result = new Main().q5();

		assertNotNull(result);
		assertEquals(10, result.size());
	}

	@Test
	public void q6() throws Exception {
		Map<Integer, Integer> result = new Main().q6();

		assertNotNull(result);
		assertNotEquals(0, result.size());
	}

}
