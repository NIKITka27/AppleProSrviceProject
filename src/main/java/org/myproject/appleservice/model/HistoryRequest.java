package org.myproject.appleservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "History_request")
public class HistoryRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer historyId;

    @Column(name = "REQUEST_ID")
    private Integer id;

    @Column(name = "CODE_DEVICE")
    private Integer codeDevice;

    @Column(name = "EMPLOYEE_ID")
    private Integer emploueeID;

    @Column(name = "STATUS_CODE")
    private Integer statusCode;

    @Column(name = "SERIAL_NUMBER")
    private Integer serialNumber;

    @Column(name = "PROBLEMS")
    private String problems;

    @Column(name = "START_TS")
    private Date start;

    @Column(name = "UPDATE_TS")
    private Date update;

    @Column(name = "INFO")
    private String info;

//	@ManyToOne
//	@JoinColumn(name="CODE_DEVICE",nullable = false)
//	private Device device;
//	
//	@ManyToOne
//	@JoinColumn(name="CODE_EXECUTION",nullable = false)
//	private Execution execution;
//	
//	@ManyToOne
//	@JoinColumn(name="STATUS_CODE",nullable = false)
//	private OrderStatus orderStatus;
//	
//	@ManyToOne
//	@JoinColumn(name="EMPLOYEE_ID",nullable = false)
//	private Employee employee;
//	
//	
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "CUSTOMER_ID_REQUEST_ID", 
//             joinColumns = { @JoinColumn(name = "REQUEST_ID") }, 
//             inverseJoinColumns = { @JoinColumn(name = "CUSTOMER_ID") })
//	private Set<Customer> customer = new HashSet<Customer>();

    public HistoryRequest() {
        // TODO Auto-generated constructor stub
    }

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodeDevice() {
        return codeDevice;
    }

    public void setCodeDevice(Integer codeDevice) {
        this.codeDevice = codeDevice;
    }

    public Integer getEmploueeID() {
        return emploueeID;
    }

    public void setEmploueeID(Integer emploueeID) {
        this.emploueeID = emploueeID;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeDevice == null) ? 0 : codeDevice.hashCode());
        result = prime * result + ((emploueeID == null) ? 0 : emploueeID.hashCode());
        result = prime * result + ((historyId == null) ? 0 : historyId.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((info == null) ? 0 : info.hashCode());
        result = prime * result + ((problems == null) ? 0 : problems.hashCode());
        result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
        result = prime * result + ((start == null) ? 0 : start.hashCode());
        result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
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
        HistoryRequest other = (HistoryRequest) obj;
        if (codeDevice == null) {
            if (other.codeDevice != null)
                return false;
        } else if (!codeDevice.equals(other.codeDevice))
            return false;
        if (emploueeID == null) {
            if (other.emploueeID != null)
                return false;
        } else if (!emploueeID.equals(other.emploueeID))
            return false;
        if (historyId == null) {
            if (other.historyId != null)
                return false;
        } else if (!historyId.equals(other.historyId))
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
        if (statusCode == null) {
            if (other.statusCode != null)
                return false;
        } else if (!statusCode.equals(other.statusCode))
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
        return "HistoryRequest [historyId=" + historyId + ", id=" + id + ", codeDevice=" + codeDevice + ", emploueeID="
                + emploueeID + ", statusCode=" + statusCode + ", serialNumber="
                + serialNumber + ", problems=" + problems + ", start=" + start
                + ", update=" + update + ", info=" + info + "]";
    }


}