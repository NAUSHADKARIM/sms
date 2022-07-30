package com.sms.stud1;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class studententity {
	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String name;
		private String city;
		private String profile;
		public studententity( String name, String city, String profile) {
			super();
			this.name = name;
			this.city = city;
			this.profile = profile;
		}
		public studententity() {
			super();
			// TODO Auto-generated constructor stub
		}
		
				
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getProfile() {
			return profile;
		}
		public void setProfile(String profile) {
			this.profile = profile;
		}
		@Override
		public String toString() {
			return "studententity [id=" + id + ", name=" + name + ", city=" + city + ", profile=" + profile + "]";
		
		}	
	}



