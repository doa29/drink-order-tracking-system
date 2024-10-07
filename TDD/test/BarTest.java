import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BarTest {

	Bar bar;

	@BeforeEach
	public void setUp() {
		bar = new Bar();
	}

	@Test
	public void bar_tab_starts_empty() {
		int actual = bar.getTab();
		assertEquals(0, actual);
	}

	@Test
	public void add_iced_tea_to_tab() {
		bar.addBeverage(new IcedTea());
		int actual = bar.getTab();

		assertEquals(IcedTea.ICED_TEA_COST, actual);
	}

	@Test
	public void add_coffee_to_tab() {
		bar.addBeverage(new Coffee());
		int actual = bar.getTab();

		assertEquals(Coffee.COFFEECOST, actual);
	}

	@Test
	public void add_coffee_and_iced_tea_to_tab() {
		bar.addBeverage(new Coffee());
		bar.addBeverage(new IcedTea());
		int actual = bar.getTab();

		assertEquals(Coffee.COFFEECOST + IcedTea.ICED_TEA_COST, actual);
	}

}
