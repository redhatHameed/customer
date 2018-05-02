package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Customer;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //GET_customer
    public Customer customerGet();
    
    //POST_customer
    public Customer customerPost(Customer body);
    
    //PUT_customer
    public Customer customerPut(Customer body);
    
}
