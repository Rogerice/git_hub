package br.com.cvc.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.cvc.model.HotelModel;

@Component
public class HotelConfig {

	public void config() {

		try {
			RestTemplate restTemplate = new RestTemplate();
			String hotelUrl = "https://cvcbackendhotel.herokuapp.com/hotels/avail/{id}";
			ResponseEntity<HotelModel> response = restTemplate.getForEntity(hotelUrl, HotelModel.class);
			response.getStatusCode().equals(HttpStatus.OK);

			//System.out.println(response);
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

	}
}