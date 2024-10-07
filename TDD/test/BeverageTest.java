import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeverageTest {
	Beverage icedTea;

	@BeforeEach
	public void setUp() {
		icedTea = new IcedTea(10);
	}

	@Test
	public void iced_tea_can_be_created_with_a_specific_value() {
		double actual = icedTea.getSugar();
		assertEquals(10, actual);

	}

	@Test
	public void iced_tea_created_with_50mg_sugar_by_default() {
		icedTea = new IcedTea();
		double actual = icedTea.getSugar();
		assertEquals(50, actual);
	}

}
