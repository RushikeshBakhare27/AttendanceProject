package com.ka.infy;





import jakarta.persistence.Entity;
import jakarta.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class Certification {
	@Id
	int  cid;
	String certname;
	String cdate;
	String Cdescription;
		

	}
	
	


