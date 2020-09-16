package org.myproject.appleservice.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCR")
	private String descr;

	public Roles() {
		// TODO Auto-generated constructor stub
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descr == null) ? 0 : descr.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roleId;
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
		Roles other = (Roles) obj;
		if (descr == null) {
			if (other.descr != null)
				return false;
		} else if (!descr.equals(other.descr))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roleId != other.roleId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", name=" + name + ", descr=" + descr + "]";
	}

}
