package SpringLombokAnnotations.Task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SchoolRunner implements CommandLineRunner {
	
	@Autowired
	private School school;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("School details loading");
		System.out.println(school);
		
		School s1 = school;
		School s2 = school;
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
