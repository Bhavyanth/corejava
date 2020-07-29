package hibernate.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Entity annotation marks this class as an entity.
 * 
 * @Table annotation specifies the table name where data of this entity is to be persisted. 
	If you don't use @Table annotation, hibernate will use the class name as the table name by default.
	
 * @Id annotation marks the identifier for this entity.
 * 
 * @Column annotation specifies the details of the column for this property or field. 
	If @Column annotation is not specified, property name will be used as the column name by default.
 * 
 */

@Entity
@Table(name = "Employee")
public class Employee {
	@Id @GeneratedValue
	@Column(name ="id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName; 
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "salary")
	private int salary;
	
	@Temporal(TemporalType.DATE) // for only data not timestamp
	private Date creationDate;
	
	
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date date) {
		this.creationDate = date;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
