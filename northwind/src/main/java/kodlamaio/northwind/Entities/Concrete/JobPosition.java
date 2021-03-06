package kodlamaio.northwind.Entities.Concrete;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.northwind.Entities.Abstract.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_positions")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class JobPosition extends User{
  
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  
  
  @Column(table="job_positions_id")
  private int id;
  
  @Column(name="job_position_name")
  private String jobPositionName;
  
  @Column(table="job_positions_title")
  private String title;
  
  
  @JsonIgnore
  @OneToMany(mappedBy = "JobPosition")
  private List<JobAdvertisement> JobAdvertisement;
  
  
}