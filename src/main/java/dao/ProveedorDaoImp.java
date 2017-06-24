package dao;

import Entity.Proveedor;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Alejandro on 24/06/2017.
 */
@Repository
public class ProveedorDaoImp implements ProveedorDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void agregar(Proveedor proveedor) {
        sessionFactory.getCurrentSession().save(proveedor);
    }

    @Override
    public List<Proveedor> listarProveedores() {
        @SuppressWarnings("unchecked")
        TypedQuery<Proveedor> query=sessionFactory.getCurrentSession().createQuery("from Proveedor");
        return query.getResultList();
    }
}
