package SpringLombokAnnotations.Task4;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties(prefix = "school")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class School {
	
	private String schoolName;
	
	
	private String city;
	
	private Principal principal;
	
	private List<ClassRoom> classrooms;
	

}
