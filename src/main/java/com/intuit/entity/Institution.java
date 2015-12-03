package com.intuit.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "INSTITUTION")
public class Institution {

	@JsonProperty
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@JsonProperty
	@Size(min=10, max=50)
	@Column(name = "institutionName", nullable = true)
	private String institutionName;
	
	@JsonProperty
	@Size(min=10, max=50)
	@Column(name = "homeUrl", nullable = true)
	private String homeUrl;
	
	@JsonProperty
	@Size(min=10, max=50)
	@Column(name = "phoneNumber", nullable = true)
	private String phoneNumber;
	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
