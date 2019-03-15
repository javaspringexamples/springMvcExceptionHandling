package javaspringexamples.spring.exceptionhandling.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException() {
		return new ModelAndView("errorGlobal");
	}
}
