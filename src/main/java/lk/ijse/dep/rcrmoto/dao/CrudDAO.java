package lk.ijse.dep.rcrmoto.dao;

import lk.ijse.dep.rcrmoto.entity.SuperEntity;
import org.hibernate.Session;

import java.util.List;

public interface CrudDAO <T extends SuperEntity,ID> extends SuperDAO {

    public List<T> findAll() ;

    public T find(ID id) ;

    public void save(T entity) ;

    public void update(T entity) ;

    public void delete(ID id) ;
}
