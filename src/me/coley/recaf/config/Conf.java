package me.coley.recaf.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for giving configuration data to a field.
 * 
 * @author Matt
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Conf {
	/**
	 * @return Translation key of the category.
	 */
	String category();

	/**
	 * @return Translation key base used for fetching name and descriptions.
	 */
	String key();
	
	/**
	 * @return Hide from UI.
	 */
	boolean hide() default false;
}