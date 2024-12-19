package com.gavaskar.emoApp.entity;

import java.time.LocalDate;
import com.gavaskar.emoApp.Constraint.Age;
import com.gavaskar.emoApp.Constraint.Pan;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="employee")
public class Employee {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long empId;
	
	@NotBlank
	@Column
	private String Name;
	
	@Column
	@Email
	private String email;
	
	//@Pattern(regexp ="[A-Z]{5}[0-9]{4}[A-Z]{1}")
	@Pan
	@Column
	private String pan;
	
	@Column
	@NotEmpty
	private String mobileNumbe;
	
	@Column
	private Integer pincode;
	
	@Column
	@ Age
	private LocalDate DateOfBirth;
	
	@Column
	@Min(18)
	private int age;


	public Employee(long empId, @NotBlank String name, @Email String email, String pan, @NotEmpty String mobileNumbe,
			Integer pincode, LocalDate dateOfBirth, @Min(18) int age) {
		super();
		this.empId = empId;
		Name = name;
		this.email = email;
		this.pan = pan;
		this.mobileNumbe = mobileNumbe;
		this.pincode = pincode;
		DateOfBirth = dateOfBirth;
		this.age = age;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumbe() {
		return mobileNumbe;
	}

	public void setMobileNumbe(String mobileNumbe) {
		this.mobileNumbe = mobileNumbe;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee() {
	}
	
}