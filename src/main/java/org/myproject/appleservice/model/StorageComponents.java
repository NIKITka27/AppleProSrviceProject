package org.myproject.appleservice.model;

import javax.persistence.*;

@Entity
@Table(name = "storage_components")
public class StorageComponents {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer codeProduct;
	
	@Column(name = "NAME_PRODUCT")
	private String nameProduct;
	
	@Column(name = "UNIT_PRICE")
	private String unitPrice;
	
	@Column(name = "NUM_STORAGE")
	private int numStorage;
	
	@Column(name = "COST_ALL_COMPONENTS")
	private String costAll;

	public StorageComponents() {
		// TODO Auto-generated constructor stub
	}

	public int getCodeProduct() {
		return codeProduct;
	}

	public void setCodeProduct(int codeProduct) {
		this.codeProduct = codeProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getNumStorage() {
		return numStorage;
	}

	public void setNumStorage(int numStorage) {
		this.numStorage = numStorage;
	}

	public String getCostAll() {
		return costAll;
	}

	public void setCostAll(String costAll) {
		this.costAll = costAll;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codeProduct;
		result = prime * result + ((costAll == null) ? 0 : costAll.hashCode());
		result = prime * result + ((nameProduct == null) ? 0 : nameProduct.hashCode());
		result = prime * result + numStorage;
		result = prime * result + ((unitPrice == null) ? 0 : unitPrice.hashCode());
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
		StorageComponents other = (StorageComponents) obj;
		if (codeProduct != other.codeProduct)
			return false;
		if (costAll == null) {
			if (other.costAll != null)
				return false;
		} else if (!costAll.equals(other.costAll))
			return false;
		if (nameProduct == null) {
			if (other.nameProduct != null)
				return false;
		} else if (!nameProduct.equals(other.nameProduct))
			return false;
		if (numStorage != other.numStorage)
			return false;
		if (unitPrice == null) {
			if (other.unitPrice != null)
				return false;
		} else if (!unitPrice.equals(other.unitPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StorageComponents [codeProduct=" + codeProduct + ", nameProduct=" + nameProduct + ", unitPrice="
				+ unitPrice + ", numStorage=" + numStorage + ", costAll=" + costAll + "]";
	}
	
}
