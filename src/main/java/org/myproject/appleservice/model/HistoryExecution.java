package org.myproject.appleservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "history_execution")
public class HistoryExecution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "TYPE_REPAIR")
	private String typeRepair;

	@Column(name = "REPAIR_COST")
	private String repaiCost;

	@Column(name = "COMPONENT_COST")
	private String componentsCost;

	@Column(name = "DISCOUNT")
	private String discount;

	@Column(name = "TOTAL_COST")
	private String totalCost;

	@Column(name = "DATA_EXECUTION")
	private Date dateExecution;

	@Column(name = "REAL_DATA_EXECUTION")
	private Date realDataExecution;

	@Column(name = "INFO")
	private String info;

	
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "ORDER_COMPONENTS", 
//             joinColumns = { @JoinColumn(name = "CODE_EXECUTION") }, 
//             inverseJoinColumns = { @JoinColumn(name = "CODE_PRODUCT") })
//	private Set<Execution> execution = new HashSet<Execution>();
//	
	
	public HistoryExecution() {
		// TODO Auto-generated constructor stub
	}


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


	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((componentsCost == null) ? 0 : componentsCost.hashCode());
		result = prime * result + ((dateExecution == null) ? 0 : dateExecution.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((realDataExecution == null) ? 0 : realDataExecution.hashCode());
		result = prime * result + ((repaiCost == null) ? 0 : repaiCost.hashCode());
		result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
		result = prime * result + ((typeRepair == null) ? 0 : typeRepair.hashCode());
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
		HistoryExecution other = (HistoryExecution) obj;
		if (componentsCost == null) {
			if (other.componentsCost != null)
				return false;
		} else if (!componentsCost.equals(other.componentsCost))
			return false;
		if (dateExecution == null) {
			if (other.dateExecution != null)
				return false;
		} else if (!dateExecution.equals(other.dateExecution))
			return false;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
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
		if (realDataExecution == null) {
			if (other.realDataExecution != null)
				return false;
		} else if (!realDataExecution.equals(other.realDataExecution))
			return false;
		if (repaiCost == null) {
			if (other.repaiCost != null)
				return false;
		} else if (!repaiCost.equals(other.repaiCost))
			return false;
		if (totalCost == null) {
			if (other.totalCost != null)
				return false;
		} else if (!totalCost.equals(other.totalCost))
			return false;
		if (typeRepair == null) {
			if (other.typeRepair != null)
				return false;
		} else if (!typeRepair.equals(other.typeRepair))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "HistoryExecution [id=" + id + ", typeRepair=" + typeRepair + ", repaiCost=" + repaiCost
				+ ", componentsCost=" + componentsCost + ", discount=" + discount + ", totalCost=" + totalCost
				+ ", dateExecution=" + dateExecution + ", realDataExecution=" + realDataExecution + ", info=" + info
				+ "]";
	}


	

}