package kodlamaio.northwind.Entities.Abstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class User {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private int id;

	    @Column(name="first_name")
	    private String firstName;
	    
	    @Column(name="last_name")
	    private String lastName;
	    
	    @Column(name="email")
	    private String email;
	   
	    @Column(name="password")
	    private String password;
	    
}
