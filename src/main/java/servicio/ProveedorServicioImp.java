package servicio;

import Entity.Proveedor;
import dao.ProveedorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alejandro on 24/06/2017.
 */
@Service
public class ProveedorServicioImp implements ProveedorServicio{

    @Autowired
    private ProveedorDao proveedorDao;

    @Transactional
    @Override
    public void add(Proveedor proveedor) {
        proveedorDao.agregar(proveedor);

    }

    @Transactional(readOnly = true)
    @Override
    public List<Proveedor> listarProveedores() {
        return  proveedorDao.listarProveedores();
    }
}
