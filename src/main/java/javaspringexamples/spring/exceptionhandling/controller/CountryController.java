package javaspringexamples.spring.exceptionhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javaspringexamples.spring.exceptionhandling.domain.Country;
import javaspringexamples.spring.exceptionhandling.exception.CountryNotFoundException;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Controller
public class CountryController {

	private Map<String, Country> countries = new HashMap<String, Country>();

	@PostConstruct
	public void setup() {
		countries.put("morocco", new Country("Morocco", "MA"));
		countries.put("france", new Country("France", "FR"));
		countries.put("united states of america", new Country("United states of America", "US"));
		countries.put("error", new Country("Error", "Err"));
	}

	@RequestMapping(value = "/form")
	public ModelAndView country() {
		return new ModelAndView("form", "country", new Country());
	}

	@RequestMapping(value = "/result")
	public ModelAndView process(String name) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if ("error".equalsIgnoreCase(name)) {
			throw new Exception();
		}

		Country country = countries.get(name.toLowerCase());
		if (country == null) {
			throw new CountryNotFoundException(name);
		}
		modelAndView.addObject("country", country);
		modelAndView.setViewName("result");
		return modelAndView;
	}

	@ExceptionHandler(CountryNotFoundException.class)
	public ModelAndView handleException(CountryNotFoundException e) {
		ModelAndView modelAndView = new ModelAndView("errorCountry");
		modelAndView.addObject("errorMessage", e.getMessage());
		return modelAndView;
	}
}