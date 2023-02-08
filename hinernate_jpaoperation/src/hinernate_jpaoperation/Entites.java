package hinernate_jpaoperation;

public class Entites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@Entity
		@Table(name="students")
		public class Student implements Serializable {
		private static final long serialVersionUID = 1L;
		@Id
		private int studentId;
		private String name;
		public int getStudentId() {
		return studentId;
		}
		public void setStudentId(int studentId) {
		this.studentId = studentId;
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}

}
