package kodlamaio.northwind.Entities.Concrete;

import kodlamaio.northwind.Entities.Abstract.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")
public class Candidate extends User {

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="identity_number")
    private String identificationNumber;

    @Column(name="email")
    private String email;
    
    @Column(name="date_of_birth")
    private Date birthDate;
}