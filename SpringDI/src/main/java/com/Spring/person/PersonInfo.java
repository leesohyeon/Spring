package com.Spring.person;

public class PersonInfo {
	Person person;
	public PersonInfo() {}
		public PersonInfo(Person p) {
			person=p;
		}
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		public void printAll() {
			System.out.println("name:"+person.getName());
			System.out.println("age:"+person.getAge());
			System.out.println("gender:"+person.getGender());
			System.out.println("idno:"+person.getIdno());
		}
	}
