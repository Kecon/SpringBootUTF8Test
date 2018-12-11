package se.kecon.springbootutf8test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SpringUTF8Controller {

	@RequestMapping("/")
	public void mo(@RequestParam("message_id") String message_id,
			@RequestParam("inbound_address") String inbound_address,
			@RequestParam("device_address") String device_address, @RequestParam("message_orig") String message_orig,
			@RequestParam("carrier") String carrier) {

		System.out.println("message_id: " + message_id);
		System.out.println("inbound_address: " + inbound_address);
		System.out.println("device_address: " + device_address);
		System.out.println("message_orig: " + message_orig);
		System.out.println("carrier: " + carrier);
	}

}