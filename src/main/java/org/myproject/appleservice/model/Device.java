package org.myproject.appleservice.model;

import javax.persistence.*;

@Entity
@Table(name = "Device")
public class Device {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer codeDevice;
	
	@Column(name = "TYPE_DEVICE")
	private String typeDevice;
	
	@Column(name = "MODEL")
	private String model;
	
	public Device() {
		// TODO Auto-generated constructor stub
	}

	public int getCodeDevice() {
		return codeDevice;
	}

	public void setCodeDevice(int codeDevice) {
		this.codeDevice = codeDevice;
	}

	public String getTypeDevice() {
		return typeDevice;
	}

	public void setTypeDevice(String typeDevice) {
		this.typeDevice = typeDevice;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codeDevice;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((typeDevice == null) ? 0 : typeDevice.hashCode());
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
		Device other = (Device) obj;
		if (codeDevice != other.codeDevice)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (typeDevice == null) {
			if (other.typeDevice != null)
				return false;
		} else if (!typeDevice.equals(other.typeDevice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Device [codeDevice=" + codeDevice + ", typeDevice=" + typeDevice + ", model=" + model + "]";
	}
	
	
}
