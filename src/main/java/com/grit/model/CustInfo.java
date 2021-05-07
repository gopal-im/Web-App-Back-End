package com.grit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "custinfo")
public class CustInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "custid")
	private Integer custid;
	
	@Column(name = "enquiryid")
	private String enquiryid;
	
	@Column(name = "customername")
	private String customername;
	
	@Column(name = "jobtype")
	private String jobtype;
	
	@Column(name = "loanamount")
	private Integer loanamount;
	
	@Column(name = "interestrate")
	private Integer interestrate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "createdby")
	private String createdby;
	
	@Column(name = "createdon")
	private Date createdon;
	
	@Column(name = "approvedby")
	private String approvedby;
	
	@Column(name = "recomendedby")
	private String recomendedby;
	

	public Integer getCustid() {
		return custid;
	}

	public void setCustid(Integer custid) {
		this.custid = custid;
	}

	public String getEnquiryid() {
		return enquiryid;
	}

	public void setEnquiryid(String enquiryid) {
		this.enquiryid = enquiryid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public Integer getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(Integer loanamount) {
		this.loanamount = loanamount;
	}

	public Integer getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(Integer interestrate) {
		this.interestrate = interestrate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public String getApprovedby() {
		return approvedby;
	}

	public void setApprovedby(String approvedby) {
		this.approvedby = approvedby;
	}

	public String getRecomendedby() {
		return recomendedby;
	}

	public void setRecomendedby(String recomendedby) {
		this.recomendedby = recomendedby;
	}
	
	
	
}
