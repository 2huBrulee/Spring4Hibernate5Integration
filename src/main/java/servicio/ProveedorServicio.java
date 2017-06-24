package servicio;

import Entity.Proveedor;

import java.util.List;

/**
 * Created by Alejandro on 24/06/2017.
 */
public interface ProveedorServicio {
    void add(Proveedor proveedor);
    List<Proveedor> listarProveedores();
}
