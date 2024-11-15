package com.mmst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="Contact")
@Data

public class Contact {
	
	@Id
    private int id;
	@Column
	private String name;
	@Column
    private String email;
	@Column
    private String subject;
	@Column
    private String message;
	@Column
    private String createDtm;
	

}
