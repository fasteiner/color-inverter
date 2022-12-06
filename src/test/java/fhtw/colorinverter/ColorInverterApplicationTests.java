package fhtw.colorinverter;

import fhtw.colorinverter.service.ColorInverterService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ColorInverterApplicationTests {
	static ColorInverterService colorInverterService;
	@BeforeAll
	static void setup() {
		colorInverterService = new ColorInverterService();
	}
	@Test
	void invertColorTest() {
		assertEquals("green", this.colorInverterService.invertColor("red"));
		assertEquals("red", this.colorInverterService.invertColor("green"));
		assertEquals("orange", this.colorInverterService.invertColor("blue"));
		assertEquals("blue", this.colorInverterService.invertColor("orange"));
		assertEquals("purple", this.colorInverterService.invertColor("yellow"));
		assertEquals("yellow", this.colorInverterService.invertColor("purple"));
		assertEquals("unknown", this.colorInverterService.invertColor("unknown"));
	}

}
