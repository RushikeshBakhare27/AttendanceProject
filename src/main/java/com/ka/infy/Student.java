package com.ka.infy;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;

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
public class Student {

	@Id
	int studentid;
	String name;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	
	@JoinColumn(name = "studentid")
	List<Course> cousre;
	
	@OneToMany(cascade = CascadeType.ALL)
	
	@JoinColumn(name =   "studentid")
	List<Certification>certifications;
	
	
	
	
	

	
	
}
