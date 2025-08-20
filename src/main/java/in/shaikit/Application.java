package in.shaikit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.shaikit.Constants.AppConstants;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC , groupId = "group_ashokit_orders")
	public void consumeOrderMsg(String order) {
		System.out.println("-----Msg from kafka------");
		System.out.println(order);
	}

}
