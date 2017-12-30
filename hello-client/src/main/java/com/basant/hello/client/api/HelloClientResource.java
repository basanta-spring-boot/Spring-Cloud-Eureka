package com.basant.hello.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class HelloClientResource {

	@Autowired
	private RestTemplate template;

	@GetMapping("/getMsg")
	public String getMessage() {
		/*
		 * Previously we used to call rest end point using exact url like host
		 * name and port like exact syntax as below
		 * =============================================
		 * http://localhost:9091/hello-server/getMessage
		 * ============================================= but if my server side
		 * application registered in Eureka server then i no need to pass exact
		 * syntax i can just call using endpoint URL with service name which
		 * registered in Eureak service registry i.e Hello-Server like below
		 * ======================================
		 * http://hello-server/server/getMessage
		 * ====================================== here hello-server is my
		 * Service name which i register in Eureak and /server/getMessage is my
		 * endpoint URL
		 */
		String url = "http://hello-server/server/getMessage";
		return template.getForObject(url, String.class);
	}

}
