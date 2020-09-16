package org.myproject.appleservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "execution")
public class Execution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "TYPE_REPAIR")
	private String typeRepair;

	@Column(name = "REPAIR_COST")
	private String repaiCost;

	@Column(name = "COMPONENTS_COST")
	private String componentsCost;

	@Column(name = "DISCOUNT")
	private String discount;

	@Column(name = "TOTAL_COST")
	private String totalCost;

	@Column(name = "DATE_EXECUTION")
	private Date dateExecution;

	@Column(name = "REAL_DATA_EXECUTION")
	private Date realDataExecution;

	@Column(name = "INFO")
	private String info;

	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ORDER_COMPONENTS",
             joinColumns = { @JoinColumn(name = "CODE_EXECUTION") },
             inverseJoinColumns = { @JoinColumn(name = "CODE_PRODUCT") })
	private Set<StorageComponents> storageComponents = new HashSet<StorageComponents>();


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTypeRepair() {
		return typeRepair;
	}


	public void setTypeRepair(String typeRepair) {
		this.typeRepair = typeRepair;
	}


	public String getRepaiCost() {
		return repaiCost;
	}


	public void setRepaiCost(String repaiCost) {
		this.repaiCost = repaiCost;
	}


	public String getComponentsCost() {
		return componentsCost;
	}


	public void setComponentsCost(String componentsCost) {
		this.componentsCost = componentsCost;
	}


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
	}


	public String getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}


	public Date getDateExecution() {
		return dateExecution;
	}


	public void setDateExecution(Date dateExecution) {
		this.dateExecution = dateExecution;
	}


	public Date getRealDataExecution() {
		return realDataExecution;
	}


	public void setRealDataExecution(Date realDataExecution) {
		this.realDataExecution = realDataExecution;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public Set<StorageComponents> getStorageComponents() {
		return storageComponents;
	}

	public void setStorageComponents(Set<StorageComponents> storageComponents) {
		this.storageComponents = storageComponents;
	}

	@Override
	public String toString() {
		return "Execution{" +
				"id=" + id +
				", typeRepair='" + typeRepair + '\'' +
				", repaiCost='" + repaiCost + '\'' +
				", componentsCost='" + componentsCost + '\'' +
				", discount='" + discount + '\'' +
				", totalCost='" + totalCost + '\'' +
				", dateExecution=" + dateExecution +
				", realDataExecution=" + realDataExecution +
				", info='" + info + '\'' +
				", storageComponents=" + storageComponents +
				'}';
	}
}