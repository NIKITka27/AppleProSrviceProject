package org.myproject.appleservice.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table( name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id ;
	
	@Column(name = "FIRST_NAME" )
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "NUM_CONTRACT")
	private int numContract;
	
	@Column(name = "is_Active")
	private boolean isActive;

	@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
	@CollectionTable(name = "CUSTOMER_ROLE", joinColumns = @JoinColumn(name = "Customer_id"))
	@Enumerated(EnumType.STRING)
	private Set<Role> roles;

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Customer() {
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNumContract() {
		return numContract;
	}

	public void setNumContract(int numContract) {
		this.numContract = numContract;
	}

	public boolean isActive(boolean b) {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return numContract == customer.numContract &&
				isActive == customer.isActive &&
				Objects.equals(id, customer.id) &&
				Objects.equals(firstName, customer.firstName) &&
				Objects.equals(lastName, customer.lastName) &&
				Objects.equals(email, customer.email) &&
				Objects.equals(phone, customer.phone) &&
				Objects.equals(address, customer.address) &&
				Objects.equals(password, customer.password) &&
				Objects.equals(roles, customer.roles);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, email, phone, address, password, numContract, isActive, roles);
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", password='" + password + '\'' +
				", numContract=" + numContract +
				", isActive=" + isActive +
				", roles=" + roles +
				'}';
	}
}
