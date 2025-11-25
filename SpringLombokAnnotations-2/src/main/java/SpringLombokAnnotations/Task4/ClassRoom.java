package SpringLombokAnnotations.Task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ClassRoom {
	
	private int roomNo;
	
	private String classTeacher;
	
	private int studentCount;
	
	

}
