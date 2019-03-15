package javaspringexamples.spring.exceptionhandling.exception;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class CountryNotFoundException extends Exception {

	public CountryNotFoundException(String name) {
		super("Country not found with name: " + name);
	}
}