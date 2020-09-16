package org.myproject.appleservice.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "employees" )
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lstaName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "EMAIL")
	private String email;
	
	@ManyToOne
	@JoinColumn(name="ROLE_ID", insertable  = false, updatable = false)
	private Roles roles;
	
	@Column(name = "PASSPORT_SERIES")
	private String passportSeries;
	
	@Column(name = "PASSPORT_NUMBER")
	private Integer passportNumber;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "DATE_OF_EMPLOEMENT")
	private Date dateEmploement;
	
	@Column(name = "CURENT_DATE")
	private Date curentDate;
	
	@Column(name = "EXPERIENCE")
	private Date experiense;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLstaName() {
		return lstaName;
	}

	public void setLstaName(String lstaName) {
		this.lstaName = lstaName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getPassportSeries() {
		return passportSeries;
	}

	public void setPassportSeries(String passportSeries) {
		this.passportSeries = passportSeries;
	}

	public Integer getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(Integer passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateEmploement() {
		return dateEmploement;
	}

	public void setDateEmploement(Date dateEmploement) {
		this.dateEmploement = dateEmploement;
	}

	public Date getCurentDate() {
		return curentDate;
	}

	public void setCurentDate(Date curentDate) {
		this.curentDate = curentDate;
	}

	public Date getExperiense() {
		return experiense;
	}

	public void setExperiense(Date experiense) {
		this.experiense = experiense;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((curentDate == null) ? 0 : curentDate.hashCode());
		result = prime * result + ((dateEmploement == null) ? 0 : dateEmploement.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((experiense == null) ? 0 : experiense.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lstaName == null) ? 0 : lstaName.hashCode());
		result = prime * result + ((passportNumber == null) ? 0 : passportNumber.hashCode());
		result = prime * result + ((passportSeries == null) ? 0 : passportSeries.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (curentDate == null) {
			if (other.curentDate != null)
				return false;
		} else if (!curentDate.equals(other.curentDate))
			return false;
		if (dateEmploement == null) {
			if (other.dateEmploement != null)
				return false;
		} else if (!dateEmploement.equals(other.dateEmploement))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (experiense == null) {
			if (other.experiense != null)
				return false;
		} else if (!experiense.equals(other.experiense))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lstaName == null) {
			if (other.lstaName != null)
				return false;
		} else if (!lstaName.equals(other.lstaName))
			return false;
		if (passportNumber == null) {
			if (other.passportNumber != null)
				return false;
		} else if (!passportNumber.equals(other.passportNumber))
			return false;
		if (passportSeries == null) {
			if (other.passportSeries != null)
				return false;
		} else if (!passportSeries.equals(other.passportSeries))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lstaName=" + lstaName + ", password=" + password
				+ ", email=" + email + ", passportSeries=" + passportSeries + ", passportNumber="
				+ passportNumber + ", address=" + address + ", phone=" + phone + ", dateEmploement=" + dateEmploement
				+ ", curentDate=" + curentDate + ", experiense=" + experiense + ", roles=" + roles + "]";
	}


	
}
