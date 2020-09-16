package org.myproject.appleservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "request" )
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="CODE_DEVICE",nullable = false, insertable  = false, updatable = false)
	private Device device;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID",nullable = false, insertable  = false, updatable = false)
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="STATUS_CODE",nullable = false,insertable  = false, updatable = false)
	private OrderStatus orderStatus;
	
	@ManyToOne
	@JoinColumn(name="CODE_EXECUTION",nullable = false,insertable  = false, updatable = false)
	private Execution execution;
	
	@Column(name = "SERIAL_NUMBER")
	private Integer serialNumber;
	
	@Column(name = "PROBLEMS")
	private String problems;
	
	@Column(name = "CUSTOM_PROBLEMS")
	private String customProblems;
	
	@Column(name = "START_TS")
	private Date start;

	@Column(name = "UPDATE_TS")
	private Date update;

	@Column(name = "INFO")
	private String info;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CUSTOMER_ID_REQUEST_ID",
             joinColumns = { @JoinColumn(name = "REQUEST_ID") },
             inverseJoinColumns = { @JoinColumn(name = "CUSTOMER_ID") })
	private Set<Customer> customer = new HashSet<Customer>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Execution getExecution() {
		return execution;
	}

	public void setExecution(Execution execution) {
		this.execution = execution;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getProblems() {
		return problems;
	}

	public void setProblems(String problems) {
		this.problems = problems;
	}

	public String getCustomProblems() {
		return customProblems;
	}

	public void setCustomProblems(String customProblems) {
		this.customProblems = customProblems;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customProblems == null) ? 0 : customProblems.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((device == null) ? 0 : device.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((execution == null) ? 0 : execution.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((problems == null) ? 0 : problems.hashCode());
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((update == null) ? 0 : update.hashCode());
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
		Request other = (Request) obj;
		if (customProblems == null) {
			if (other.customProblems != null)
				return false;
		} else if (!customProblems.equals(other.customProblems))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (device == null) {
			if (other.device != null)
				return false;
		} else if (!device.equals(other.device))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (execution == null) {
			if (other.execution != null)
				return false;
		} else if (!execution.equals(other.execution))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (problems == null) {
			if (other.problems != null)
				return false;
		} else if (!problems.equals(other.problems))
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (update == null) {
			if (other.update != null)
				return false;
		} else if (!update.equals(other.update))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", device=" + device + ", employee=" + employee + ", orderStatus=" + orderStatus
				+ ", execution=" + execution + ", serialNumber=" + serialNumber + ", problems=" + problems
				+ ", customProblems=" + customProblems + ", start=" + start + ", update=" + update + ", info=" + info
				+ ", customer=" + customer + "]";
	}

}