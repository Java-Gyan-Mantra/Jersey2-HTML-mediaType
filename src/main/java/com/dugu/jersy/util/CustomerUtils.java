package com.dugu.jersy.util;

import java.util.HashMap;
import java.util.Map;

import com.dugu.jersy.pojo.Customer;

public class CustomerUtils {
	public Customer getCustomer(String customerNo) {
		return getCustomers().get(Integer.valueOf(customerNo));
	}

	private Map<Integer, Customer> getCustomers() {
		Map<Integer, Customer> map = new HashMap<>();
		Customer customer1 = new Customer();
		customer1.setCustomerName("Basant");
		customer1.setEmail("basant@gmail.com");
		customer1.setId("6075");
		customer1.setPhone("0162995136");
		customer1.setSalary(12345);
		Customer customer2 = new Customer();
		customer2.setCustomerName("Santosh");
		customer2.setEmail("santosh@gmail.com");
		customer2.setId("4572");
		customer2.setPhone("012234656");
		customer2.setSalary(54321);
		map.put(1, customer1);
		map.put(2, customer2);
		return map;
	}
}
