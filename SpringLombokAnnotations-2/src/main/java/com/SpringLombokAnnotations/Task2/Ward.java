package com.SpringLombokAnnotations.Task2;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Ward {
	private String wardName;
	
	private int capacity;
	
	private String incharge;
	

}
