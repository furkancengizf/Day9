package kodlamaio.northwind.Entities.Concrete;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.northwind.Entities.Abstract.User;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employers")
public class Employer extends User {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
    @Column(name="company_name")
    private String companyName;

    @Column(name="web_address")
    private String webAddress;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="is_verified")
    private boolean isVerified;
}