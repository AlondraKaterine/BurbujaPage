/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Consola;

import Dao.ClienteDao;
import Dao.CompraDao;
import Dao.PersonaDao;
import Dao.ProductoDao;
import Dao.ProveedorDao;
import Dao.UsuarioDao;
import Dao.VentaDao;
import DaoImpl.ClienteDaoImpl;
import DaoImpl.CompraDaoImpl;
import DaoImpl.PersonaDaoImpl;
import DaoImpl.ProductoDaoImpl;
import DaoImpl.ProveedorDaoImpl;
import DaoImpl.UsuarioDaoImpl;
import DaoImpl.VentaDaoImpl;
import Entidad.Cliente;
import Entidad.Compra;
import Entidad.Persona;
import Entidad.Producto;
import Entidad.Proveedor;
import Entidad.Usuario;
import Entidad.Venta;

/**
 *
 * @author Parisan
 */
public class BurbujaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        BurbujaProject bp=new BurbujaProject();
        
//        ***********CLIENTE*********//
     bp.agregarCliente();
//     bp.listarCliente();
//     bp.eliminarCliente();
//     bp.actualizarCliente();
//        
//        ***********COMPRA*********//
//     bp.agregarCompra();
//     bp.listarCompra();
//     bp.eliminarCompra();
//     bp.actualizarCompra();
//        
//        
//        ***********PERSONA*********//
//     bp.agregarPersona();
//     bp.listarPersona();
//     bp.eliminarPersona();
//     bp.actualizarPersona();
//        
//        ***********PRODUCTO*********//
//     bp.agregarProducto();
//     bp.listarProducto();
//     bp.eliminarProducto();
//     bp.actualizarProducto();
//        
//        
//        ***********PROVEEDOR*********//
//     bp.agregarProveedor();
//     bp.listarProveedor();
//     bp.eliminarProveedor();
//     bp.actualizarProveedor();
//       
//        ***********USUARIO*************//
//     bp.agregarUsuario();
//     bp.listarUsuario();
//     bp.eliminarUsuario();
//     bp.actualizarUsuario();
//     
//         
//         ***********VENTA*************//
//     bp.agregarVenta();
//     bp.listarVenta();
//     bp.eliminarVenta();
//     bp.actualizarVenta();
//    
         
    }
    
    
      //***************CLIENTE*****************//  
    public void agregarCliente(){
        ClienteDao dao=new  ClienteDaoImpl();
        Cliente cliente=new Cliente();
        
            cliente.setId_persona(2);
            cliente.setEstado("1");
            
            if (dao.agregarCliente(cliente)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    /*public void listarCliente(){
         ClienteDao dao=new  ClienteDaoImpl();
        for (Cliente cl : dao.listarCliente()) {
        System.out.println("\n########################################");
        System.out.println("\nID:"+cl.getId_persona()+
                               "\nNOMBRES:"+cl.getNombre()+
                               "\nAPELLIDOS:"+cl.getApepat()+ p.getApemat()+
//                               "\nFECHA_NAC:"+per.getFecha_nac()+
                               "\nAPELLIDOS:"+cl.getSexo()+
                               "\nDNI:"+cl.getDni()+
                               "\nCELULAR:"+cl.getCelular()+
                               "\nTELEFONO:"+cl.getTelefono()+
                               "\nDIRECCION:"+cl.getDireccion());
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarCliente(){
        ClienteDao dao=new ClienteDaoImpl();
        if(dao.eliminarCliente(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarCliente(){
       ClienteDao dao=new ClienteDaoImpl();
        Cliente cliente=new Cliente();
        cliente.setId_persona(2);
        cliente.setNombre("Pancho");
        cliente.setApepat("Pizarro");
        cliente.setApemat("Perez");
        cliente.setFecha_nac("2015-12-05");
        cliente.setSexo("F");
        cliente.setDni(45678914);
        cliente.setCelular(94242114);
        cliente.setTelefono(445444465);
        cliente.setDireccion("aaagfafafaf");
        
        if (dao.actualizarCliente(cliente)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    
    //************COMPRA**************/
    
    /*public void agregarCompra(){
        CompraDao dao=new CompraDaoImpl();
        Compra compra=new Compra();
        
            compra.setNombre("josue ");
            compra.setApepat("Alcantara");
            compra.setApemat("Garcia");
            compra.setFecha_nac("1996-10-25");
            compra.setSexo("M");
            compra.setDni(71553114);
            compra.setCelular(949630192);
            compra.setTelefono(949630192);
            compra.setDireccion("Av Peru #468");
            
            if (dao.agregarCompra(compra)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarCompra(){
        CompraDao dao=new CompraDaoImpl();
        for (Compra co : dao.listarCompra()) {
        System.out.println("\n########################################");
        System.out.println("\nID:"+co.getId_persona()+
                               "\nNOMBRES:"+co.getNombre()+
                               "\nAPELLIDOS:"+co.getApepat()+ p.getApemat()+
//                               "\nFECHA_NAC:"+per.getFecha_nac()+
                               "\nAPELLIDOS:"+co.getSexo()+
                               "\nDNI:"+co.getDni()+
                               "\nCELULAR:"+co.getCelular()+
                               "\nTELEFONO:"+co.getTelefono()+
                               "\nDIRECCION:"+co.getDireccion());
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarCompra(){
        CompraDao dao=new CompraDaoImpl();
        if(dao.eliminarCompra(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarCompra(){
        CompraDao dao=new CompraDaoImpl();
        Compra compra=new Compra();
        compra.setId_persona(2);
        compra.setNombre("Pancho");
        compra.setApepat("Pizarro");
        compra.setApemat("Perez");
        compra.setFecha_nac("2015-12-05");
        compra.setSexo("F");
        compra.setDni(45678914);
        compra.setCelular(94242114);
        compra.setTelefono(445444465);
        compra.setDireccion("aaagfafafaf");
        
        if (dao.actualizarCompra(compra)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    
    
    
    
    
    //************PERSONA**************/
    public void agregarPersona(){
        PersonaDao dao=new PersonaDaoImpl();
        Persona persona=new Persona();
        
            persona.setNombre("jfjfg ");
            persona.setApell_pater("gffffgf");
            persona.setApell_mater("Gaa");
            persona.setDireccion("asdsahhsdh");
            persona.setCorreo("sdgshdjh");
            persona.setTelefono("996301");
            persona.setCelular("9496301");
            persona.setRuc("fdgfgfdfd");
            persona.setNro_documento(3);
            persona.setTipo_persona("mayorista");
            persona.setTipo_documento("dni");
            persona.setGenero("M");
            
            
            if (dao.agregarPersona(persona)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarPersona(){
        PersonaDao dao=new PersonaDaoImpl();
        for (Persona p : dao.listarPersona()) {
        System.out.println("\n########################################");
        System.out.println("ID:"+p.getId_persona()+
                               "NOMBRES:"+p.getNombre()+
                               "APELLIDOS:"+p.getApell_pater()+ p.getApell_mater()+
//                               "\nFECHA_NAC:"+per.getFecha_nac()+
                               "DIRECCION:"+p.getDireccion()+
                               "CORREO:"+p.getCorreo()+
                               "TELEFONO:"+p.getTelefono()+
                               "CELULAR:"+p.getCelular()+
                               "RUC:"+p.getRuc()+
                               "NRO DOCUMENTO:"+p.getNro_documento()+
                               "TIPO_PERSONA:"+p.getTipo_persona()+
                               "TIPO_DOCUMENTO:"+p.getTipo_documento()+
                               "GENERO:"+p.getGenero() );
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarPersona(){
        PersonaDao dao=new PersonaDaoImpl();
        if(dao.eliminarPersona(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
//    public void actualizarPersona(){
//        PersonaDao dao=new PersonaDaoImpl();
//        Persona persona=new Persona();
//        persona.setId_persona(2);
//        persona.setNombre("Pancho");
//        persona.setApepat("Pizarro");
//        persona.setApemat("Perez");
//        persona.setFecha_nac("2015-12-05");
//        persona.setSexo("F");
//        persona.setDni(45678914);
//        persona.setCelular(94242114);
//        persona.setTelefono(445444465);
//        persona.setDireccion("aaagfafafaf");
        
//        if (dao.actualizarPersona(persona)) {
//             System.out.println("Actualizó Correctamente.");
//        } else {
//            System.out.println("Error.");
//        }
//    }
    /*
    //************PRODUCTO**************/
   /* public void agregarProducto(){
        ProductoDao dao=new ProductoDaoImpl();
        Producto producto=new Producto();
        
            producto.setNombre("josue ");
            producto.setApepat("Alcantara");
            producto.setApemat("Garcia");
            producto.setFecha_nac("1996-10-25");
            producto.setSexo("M");
            producto.setDni(71553114);
            producto.setCelular(949630192);
            producto.setTelefono(949630192);
            producto.setDireccion("Av Peru #468");
            
            if (dao.agregarProducto(producto)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarProducto(){
        ProductoDao dao=new ProductoDaoImpl();
        for (Producto pro : dao.listarProducto()) {
        System.out.println("\n########################################");
        System.out.println("\nID:"+pro.getId_persona()+
                               "\nNOMBRES:"+pro.getNombre()+
                               "\nAPELLIDOS:"+pro.getApepat()+ p.getApemat()+
//                               "\nFECHA_NAC:"+per.getFecha_nac()+
                               "\nAPELLIDOS:"+pro.getSexo()+
                               "\nDNI:"+pro.getDni()+
                               "\nCELULAR:"+pro.getCelular()+
                               "\nTELEFONO:"+pro.getTelefono()+
                               "\nDIRECCION:"+pro.getDireccion());
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarProducto(){
        ProductoDao dao=new ProductoDaoImpl();
        if(dao.eliminarProducto(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarProducto(){
        ProductoDao dao=new ProductoDaoImpl();
        Producto producto=new Producto();
        producto.setId_persona(2);
        producto.setNombre("Pancho");
        producto.setApepat("Pizarro");
        producto.setApemat("Perez");
        producto.setFecha_nac("2015-12-05");
        producto.setSexo("F");
        producto.setDni(45678914);
        producto.setCelular(94242114);
        producto.setTelefono(445444465);
        producto.setDireccion("aaagfafafaf");
        
        if (dao.actualizarProducto(producto)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
     //***************PROVEEDOR*****************/
    /*public void agregarProveedor(){
        ProveedorDao dao=new ProveedorDaoImpl();
        Proveedor proveedor=new Proveedor();
        
            proveedor.setNombre("josue ");
            proveedor.setApepat("Alcantara");
            proveedor.setApemat("Garcia");
            proveedor.setFecha_nac("1996-10-25");
            proveedor.setSexo("M");
            proveedor.setDni(71553114);
            proveedor.setCelular(949630192);
            proveedor.setTelefono(949630192);
            proveedor.setDireccion("Av Peru #468");
            
            if (dao.agregarProveedor(proveedor)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarProveedor(){
        ProveedorDao dao=new ProveedorDaoImpl();
        for (Proveedor prove : dao.listarProveedor()) {
        System.out.println("\n########################################");
        System.out.println("\nID:"+prove.getId_persona()+
                               "\nNOMBRES:"+prove.getNombre()+
                               "\nAPELLIDOS:"+prove.getApepat()+ p.getApemat()+
//                               "\nFECHA_NAC:"+per.getFecha_nac()+
                               "\nAPELLIDOS:"+prove.getSexo()+
                               "\nDNI:"+prove.getDni()+
                               "\nCELULAR:"+prove.getCelular()+
                               "\nTELEFONO:"+prove.getTelefono()+
                               "\nDIRECCION:"+prove.getDireccion());
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarProveedor(){
        ProveedorDao dao=new ProveedorDaoImpl();
        if(dao.eliminarProveedor(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarProveedor(){
        ProveedorDao dao=new ProveedorDaoImpl();
        Proveedor proveedor=new Proveedor();
        proveedor.setId_persona(2);
        proveedor.setNombre("Pancho");
        proveedor.setApepat("Pizarro");
        proveedor.setApemat("Perez");
        proveedor.setFecha_nac("2015-12-05");
        proveedor.setSexo("F");
        proveedor.setDni(45678914);
        proveedor.setCelular(94242114);
        proveedor.setTelefono(445444465);
        proveedor.setDireccion("aaagfafafaf");
        
        if (dao.actualizarProveedor(proveedor)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    
    
    
    
    public void agregarUsuario(){
        UsuarioDao dao = new UsuarioDaoImpl();
        Usuario usuario =  new Usuario();
            
            usuario.setUsuario("bur");
            usuario.setPassword("123");
            usuario.setRol("administrador");
            usuario.setEstado("1");
            
            
            if (dao.agregarUsuario(usuario)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    
    public void listarUsuario(){
        UsuarioDao dao = new UsuarioDaoImpl();
        for (Usuario usu : dao.listarUsuario()) {
        System.out.println("\n------------------------");
        System.out.println("\n Id:"+usu.getId_usuario()+
                               "\n nombre:"+usu.getUsuario()+
                               "\n contraseña:"+usu.getContraseña()+
                               "\n rol:"+usu.getRol()+
                               "\n estado:"+usu.getEstado());
        System.out.println("------------------------");
            
        }
    }
    public void eliminarUsuario(){
         UsuarioDao dao = new UsuarioDaoImpl();
        if(dao.eliminarUsuario(2)){
            System.out.println("Eliminó Correctamente.");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarUsuario(){
        UsuarioDao dao = new UsuarioDaoImpl();
        Usuario usuario =  new Usuario();
        usuario.setId_usuario(2);
        usuario.setUsuario("alcantara");
        usuario.setContraseña("123");
        usuario.setRol("administrador");
        usuario.setEstado("1");
        
        if (dao.actualizarUsuario(usuario)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    

    public void agregarVenta(){
        VentaDao dao = new VentaDaoImpl();
        Venta venta=  new Venta();
            venta.setId_usuario(2);
//            venta.setUsuario("jos");
//            venta.setContraseña("123");
//            venta.setRol("administrador");
            venta.setEstado("1");
            
            
            if (dao.agregarVenta(venta)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    
    public void listarVenta(){
        VentaDao dao = new VentaDaoImpl();
        for (Venta ve : dao.listarVenta()) {
        System.out.println("\n------------------------");
        System.out.println("\n Id:"+ve.getId_usuario()+
//                               "\n nombre:"+ve.getUsuario()+
//                               "\n contraseña:"+ve.getContraseña()+
//                               "\n rol:"+ve.getRol()+
                               "\n estado:"+ve.getEstado());
        System.out.println("------------------------");
            
        }
    }
    public void eliminarVenta(){
         VentaDao dao = new VentaDaoImpl();
        if(dao.eliminarVenta(2)){
            System.out.println("Eliminó Correctamente.");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarVenta(){
        VentaDao dao = new VentaDaoImpl();
        Venta venta =  new Venta();
        venta.setId_usuario(2);
//        venta.setUsuario("alcantara");
//        venta.setContraseña("123");
//        venta.setRol("administrador");
        venta.setEstado("1");
        
        if (dao.actualizarVenta(venta)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
   */ 
}  
    
        

