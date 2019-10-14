package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.user.User;

@Configuration // @Configuration이 있어야 자동으로 Java Config Class를 Scan한다.
public class UserConfig02 {
	
	@Bean
	public User user() {
		return new User(3L, "또치");
	}
}
