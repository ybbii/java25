package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕");
		return g;
	}
	
	@Bean
	public Greeter greeter2() {
		Greeter g2 = new Greeter();
		g2.setFormat("%s, 안녕");
		return g2;
	}
}
