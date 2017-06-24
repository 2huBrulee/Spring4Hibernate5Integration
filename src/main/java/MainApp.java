import Entity.Proveedor;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import servicio.ProveedorServicio;

import java.util.List;

/**
 * Created by Alejandro on 24/06/2017.
 */
public class MainApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProveedorServicio proveedorServicio = context.getBean(ProveedorServicio.class);

        proveedorServicio.add(new Proveedor("nueve"));

        List<Proveedor> proveedores = proveedorServicio.listarProveedores();
        System.out.println(proveedores.size());
        for (Proveedor proveedor : proveedores){
            System.out.println("ID= "+proveedor.getId());
            System.out.println("Nombre= "+proveedor.getNombre());
            System.out.println();
        }

        context.close();
    }

}
