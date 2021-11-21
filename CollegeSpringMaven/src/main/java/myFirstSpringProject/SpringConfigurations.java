package myFirstSpringProject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("myFirstSpringProject") //my default package name
public class SpringConfigurations {
	//No need to write anything here, this is only a configuration class for loading all objects  
}
