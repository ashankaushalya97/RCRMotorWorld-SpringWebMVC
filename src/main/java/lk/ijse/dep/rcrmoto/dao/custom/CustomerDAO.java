package lk.ijse.dep.rcrmoto.dao.custom;

import lk.ijse.dep.rcrmoto.dao.CrudDAO;
import lk.ijse.dep.rcrmoto.entity.Customer;
import org.hibernate.Session;

import java.util.List;

public interface CustomerDAO extends CrudDAO<Customer,String> {

    String getLastCustomerId();

    List<Customer> searchCustomers(String text);

}
