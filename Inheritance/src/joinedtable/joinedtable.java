package joinedtable;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

public class joinedtable {

	public static void main(String[] args) {
		@Entity
		@Table(name="emp_store")
		@Inheritance(strategy=InheritanceType.JOINED)

		public class Employee implements Serializable
		{
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(stratedy=GenerationType.AUTO)
		private int employeeId;
		private String name;
		private double salary;
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId=employeeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary=salary;
		}
		}
		// TODO Auto-generated method stub

	


