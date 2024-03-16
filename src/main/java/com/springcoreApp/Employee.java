package com.springcoreApp;

public class Employee {

		private int id;
		private String Name;
		private int Marks;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getMarks() {
			return Marks;
		}

		public void setMarks(int marks) {
			Marks = marks;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", Name=" + Name + ", Marks=" + Marks + "]";
		}

		
}
