package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
	features= {"C:\\Users\\shiva\\Documents\\workspace-sts\\ProjectCucumber\\src\\test\\resources\\Form1\\Form1.feature"},
    glue = ("stepdefinition1")

)

public class Runnerclass {
	
	

}
