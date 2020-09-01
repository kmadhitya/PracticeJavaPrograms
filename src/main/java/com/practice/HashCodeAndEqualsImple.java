package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashCodeAndEqualsImple {
	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		Map<Employee,String> m = new HashMap<Employee,String>();
		m.put(e1, "Adhitya");
		m.put(e2, "Adhi");
		System.out.println(m.size());
		Set<Entry<Employee, String>> s = m.entrySet();
		Iterator<Entry<Employee, String>> itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Employee, String> m1 = (Map.Entry<Employee, String>)itr.next();
			System.out.println(m1.getKey()+"---"+m1.getValue());
		}
	}
}
	class Employee
	{
		int x;
		public Employee(int x)
		{
			this.x = x;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (x != other.x)
				return false;
			return true;
		}
		
	}


