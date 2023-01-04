package Hyunsoohello_NoDependencies.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//회원서비스 : MemberServiceImpl

//클래스다이어그램: 서버를 구성하지않고 클래스만 구현해서 보는것.
//클래스 다이어그램만으로 판단하기 어려움



@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}
