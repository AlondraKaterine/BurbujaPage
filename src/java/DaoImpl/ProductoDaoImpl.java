/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DaoImpl;

import Dao.ProductoDao;
import Entidad.Persona;
import Entidad.Producto;
import coneccion_mysql.Coneccion_mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parisan
 */
public class ProductoDaoImpl implements ProductoDao{
    public void guardar(){
       try {
           Coneccion_mysql.conexion().commit();
       } catch (Exception e) {
       }
}
     
        public void cerrar(){
       try {
           Coneccion_mysql.conexion().close();
       } catch (Exception e) {
       }
   
}
        
   public void  restaurar(){
       try {
           Coneccion_mysql.conexion().rollback();
       } catch (Exception e) {
       }
}
   public Connection conexion (){
   Connection cn=Coneccion_mysql.conexion();
    return cn;
   }

    @Override
    public boolean agregarProducto(Producto producto) {
       boolean flat=false;
        Statement st=null;
        String query="INSERT INTO producto VALUES (0,'"+producto.getCodigo()+"',"
                + "'"+producto.getNombre()+"',"
                + "'"+producto.getId_categoria()+"',"
                + "'"+producto.getPresentacion()+"',"
                + "'"+producto.getMarca()+"',"
                + "'"+producto.getModelo()+"',"
                + "'"+producto.getId_unidad_medida()+"',"
                + "'"+producto.getPrecio_compra()+"',"
                + "'"+producto.getEstado()+"')";
        try {
            st=conexion().createStatement();
            st.executeUpdate(query);
            
            conexion().getAutoCommit();
            conexion().close();
            flat=true;
            } catch (Exception e) {
                 System.out.println("ERROR:"+e.getMessage());
                 try {
                     conexion().rollback();
                     conexion().close();
            } catch (Exception ex) {
            }
       }finally{
            if (conexion() !=null) 
                try {
                    conexion().rollback();
                    conexion().close();
                } catch (Exception e) {
                }
{
                
            }
                } return flat;
    
    }

    @Override
    public List<Producto> listarProducto() {
        List<Producto> lista=null;
        Statement st=null;
        ResultSet rs=null;
        Producto pro=null;
        String query="select * from producto";
        try {
            lista = new ArrayList<>();
            st= conexion().createStatement();
            rs=st.executeQuery(query);
            while (rs.next()) {
                
                pro =new Producto();
                pro.setId_producto(rs.getInt("id_producto"));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setId_categoria(rs.getInt("id_categoria"));
//              per.setFecha_nac(rs.getNString("yyyy-mm-dd"));
                pro.setPresentacion(rs.getNString("presentacion"));
                pro.setMarca(rs.getString("marca"));
                pro.setModelo(rs.getString("modelo"));
                pro.setId_unidad_medida(rs.getInt("id_unidad_medida"));
                pro.setPrecio_compra(rs.getInt("precio_compra"));
                pro.setEstado(rs.getString("estado"));
                lista.add(pro);
            }
            cerrar();
        } catch (Exception e) {
            System.out.println("ERROR:"+e.getMessage());
            e.printStackTrace();
           cerrar();
        }
        return lista;
    
    
    }

    @Override
    public boolean eliminarProducto(int id_producto) {
        boolean flat=false;
       String query="DELETE FROM producto WHERE id_producto="+id_producto+"";
       Statement st=null;
        try {
            st=conexion().createStatement();
            st.executeUpdate(query);
            guardar();
            cerrar();
            flat=true;
        } catch (Exception e) {
            restaurar();
            cerrar();
            System.out.println("ERROR"+e.getMessage());
        }finally{
            if (conexion()!=null) {
                
             
            cerrar();
                
            }
        }
       
    return  flat;
    
    }

    @Override
    public boolean actualizarProducto(Producto producto) {
       boolean flat=false;
          String query="UPDATE persona SET nombre='"+producto.getNombre()+"',"
                  + "apepat='"+persona.getApepat()+"',"
                  + "apemat='"+persona.getApemat()+"',"
                  + "fecha_nac='"+persona.getFecha_nac()+"',"
                  + "sexo='"+persona.getSexo()+"',"
                  + "dni="+persona.getDni()+","
                  + "celular='"+persona.getCelular()+"',"
                  + "telefono='"+persona.getTelefono()+"',"
                  + "direccion ='"+persona.getDireccion()+"' WHERE id_persona ="+persona.getId_persona()+"";
          Statement st=null;
        try {
            st=conexion().createStatement();
            st.executeUpdate(query);
            guardar();
            cerrar();
            flat=true;
        } catch (Exception e) {
            restaurar();
            cerrar();
            System.out.println("ERROR"+e.getMessage());
        }finally{
            if (conexion()!=null) {
                cerrar();
            }
        }
        
         return flat;
    }
    }
  
    
