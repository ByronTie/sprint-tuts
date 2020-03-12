package byrontie.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//smoke test
@SpringBootTest
class TestingwebApplicationTests {

	@Autowired
	private HomeController homeController;

	@Test
	void contextLoads() throws Exception {
		assertThat(homeController).isNotNull();
	}

}
