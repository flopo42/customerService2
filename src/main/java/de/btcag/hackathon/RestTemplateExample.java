package de.btcag.hackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
class RestTemplateExample {

   @Autowired
   private RestTemplate restTemplate;

   @RequestMapping(value = "/test", method = RequestMethod.GET)
   @ResponseBody
   public String run() throws Exception {
      // use the "smart" Eureka-aware RestTemplate
      AddressDto exchange =
            this.restTemplate.getForObject(
                  "http://ADDRESSSERVICE2/addresses/1",
                  AddressDto.class);

      return exchange.toString();
   }
}