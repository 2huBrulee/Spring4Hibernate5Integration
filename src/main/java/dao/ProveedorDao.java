package dao;

import Entity.Proveedor;

import java.util.List;

/**
 * Created by Alejandro on 24/06/2017.
 */
public interface ProveedorDao {
    void agregar(Proveedor proveedor);
    List<Proveedor> listarProveedores();
}
