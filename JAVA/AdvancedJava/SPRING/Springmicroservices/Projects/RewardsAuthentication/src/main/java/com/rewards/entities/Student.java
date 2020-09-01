package com.rewards.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity /*
		 * @Entity: Specifies that the class is an entity. This annotation is applied to
		 * the entity class.
		 */
	public class Student {
	@Id /* @Id: Specifies the primary key of an entity. */
	@GeneratedValue /*
					 * @GeneratedValue: Provides for the specification of generation strategies for
					 * the values of primary keys.
					 */
		private Long id;
		private String name;
		private String passportNumber;

		public Student() {
			super();
		}

		public Student(Long id, String name, String passportNumber) {
			super();
			this.id = id;
			this.name = name;
			this.passportNumber = passportNumber;
		}

		public Student(String name, String passportNumber) {
			super();
			this.name = name;
			this.passportNumber = passportNumber;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassportNumber() {
			return passportNumber;
		}

		public void setPassportNumber(String passportNumber) {
			this.passportNumber = passportNumber;
		}

		@Override
		public String toString() {
			return String.format("Student [id=%s, name=%s, passportNumber=%s]", id, name, passportNumber);
		}


}
