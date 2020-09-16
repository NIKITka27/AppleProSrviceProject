package org.myproject.appleservice.model;

import javax.persistence.*;

@Entity
@Table(name = "order_status")
public class OrderStatus {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer statusId;
	
	@Column(name = "NAME")
	private String name;

	public OrderStatus() {
		// TODO Auto-generated constructor stub
	}
	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + statusId;
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
		OrderStatus other = (OrderStatus) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (statusId != other.statusId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderStatus [statusId=" + statusId + ", name=" + name + "]";
	}

	
}
