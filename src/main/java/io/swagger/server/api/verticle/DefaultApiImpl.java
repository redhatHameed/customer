package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Customer;

public class DefaultApiImpl implements DefaultApi {

	@Override
	public Customer customerGet() {
		// TODO Auto-generated method stub
		//we will only implement this method for the demo
		Customer mycust=new Customer();
		mycust.setCategory("Gold");
		mycust.setName("Abdul Hameed");
		mycust.setRegion("EMEA");
		mycust.setId(5);
		return mycust;
	}

	@Override
	public Customer customerPost(Customer body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer customerPut(Customer body) {
		// TODO Auto-generated method stub
		return null;
	}

}
