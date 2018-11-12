/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elisson
 */
public class CategoriaDAO extends ExecuteSQL{
     public CategoriaDAO(Connection con) {
        super(con);
    }
     
     
     public String Inserir_Categoria(Categoria a){
     String sql = "insert into cliente values (0,?,?,?,?,?,?,?,?,?,?)";
            try{
                PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setInt(1,a.getidcategoria());
                ps.setString(2,a.getNome());
                
                
                    if(ps.executeUpdate () > 0){
                        return "Inserifo com sucesso.";

                    }else{
                        return "Erro ao inserir";

                    }
                   
            }catch (SQLException e){
            return e.getMessage();
            }
    }
//   listar cliente 
   public List<Categoria> ListarCategoria(){
   String sql = "select * from cliente";
   List<Categoria> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {
              Categoria a = new Categoria();
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
              a.setNascimento(rs.getString(3));
              a.setRG(rs.getString(3));
              a.setCPF(rs.getString(4));
              a.setEmail(rs.getString(5));
              a.setTelefone(rs.getString(6));
              a.setBairro(rs.getString(8));
              a.setRua(rs.getString(9));
              a.setNumero(rs.getInt(10));
              a.setCEP(rs.getString(11));
             
              lista.add(a);
           }
           return lista;
       }else{
        return null;
       }
   }catch (SQLException e){
   return null;
   }
   
   
   
   }
   
  public List<Categoria> Pesquisar_Nome_Categoria(String nome){  
  String sql = "select * from cliente where nome LIKE '%"+ nome +"%'";
   List<Categoria> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {
              Categoria a = new Categoria();
              
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
              a.setRG(rs.getString(3));
              a.setCPF(rs.getString(4));
              a.setTelefone(rs.getString(5));
              a.setEmail(rs.getString(6));
              
             
              lista.add(a);
           }
           return lista;
       }else{
        return null;
       }
   }catch (SQLException e){
   return null;
   }
  
  }
  
   public List<Categoria> Pesquisar_Cod_Categoria(int cod){
     String sql = "select idcliente, nome,rg,cpf,telefone,email from cliente where idcliente = '"+cod+"'";
   List<Categoria> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {
              Categoria a = new Categoria();
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
              a.setRG(rs.getString(3));
              a.setCPF(rs.getString(4));
              a.setTelefone(rs.getString(5));
              a.setEmail(rs.getString(6));
             
              lista.add(a);
           }
           return lista;
       }else{
        return null;
       }
   }catch (SQLException e){
   return null;
   }
  
  
  
  }
  
   public boolean Testar_Categoria(int cod){
   boolean Resultado = false;
            try{
                String sql = "select * from cliente where idcliente = "+cod+"";
                PreparedStatement ps = getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if(rs != null){
                   while (rs.next()){
                   Resultado = true;
                   }
                }
            }catch (SQLException ex){
            ex.getMessage();
            
            }
   return Resultado;
   
   }
   
   public List<Categoria> CapturarCategoria(int cod){
       String sql = "select * from cliente where idcliente ="+cod+"";
       List<Categoria> lista = new ArrayList<>();
       try{
           PreparedStatement ps = getCon().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           if (rs != null) {
               while (rs.next()) {
                  Categoria a = new Categoria();
                  a.setCodigo(rs.getInt(1));
                  a.setNome(rs.getString(2));
                  a.setNascimento(rs.getString(3));
                  a.setRG(rs.getString(4));
                  a.setCPF(rs.getString(5));
                  a.setEmail(rs.getString(6));
                  a.setTelefone(rs.getString(7));
                  a.setBairro(rs.getString(8));
                  a.setRua(rs.getString(9));
                  a.setNumero(rs.getInt(10));
                  a.setCEP(rs.getString(11));
                  lista.add(a);
                  
               }
               return lista;
           }else{
            return null;
           }
       
       }catch (SQLException e){
           return null;
       }
   }
   
   public String Alterar_Categoria (Categoria a){
    String sql = "update cliente set nome = ? ,data_nasc = ? ,rg = ? " 
            +",cpf = ? ,email = ? ,telefone = ? ,bairro = ? ,rua = ?" 
            +",numero = ? ,cep = ? where idcliente = ?";
    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setString(1,a.getNome());
                ps.setString(2,a.getNascimento());
                ps.setString(3,a.getRG());
                ps.setString(4,a.getCPF());
                ps.setString(5,a.getEmail());
                ps.setString(6,a.getTelefone());
                ps.setString(7,a.getBairro());
                ps.setString(8,a.getRua());
                ps.setInt(9,a.getNumero());
                ps.setString(10,a.getCEP());
                ps.setInt(11, a.getCodigo());
            if (ps.executeUpdate () > 0) {
                return "Atualizado com sucesso.";      
        }else{
            return "Erro ao Atualizar";
            }
    
    
    }catch (SQLException e){
      return e.getMessage();
    }
   }
   
   public List<Categoria> ListarComboCategoria(){
     String sql = "select nome from cliente order by nome ";
     List<Categoria> lista = new ArrayList<>();
     try{
     PreparedStatement ps = getCon().prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
         if (rs != null) {
             while (rs.next()) {
                 Categoria a = new Categoria();
                 a.setNome(rs.getString(1));
                 lista.add(a);    
             }
           return lista;  
         }else{
          return null;
         }
     }catch (Exception e){
          return null;
     }
   }
 public List<Categoria> ConsultaCodigoCategoria(String nome){
     String sql = "select idcliente from cliente where nome = '"+nome+"'";
     List<Categoria> lista = new ArrayList<>();
     try{
     PreparedStatement ps = getCon().prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
         if (rs != null) {
             while (rs.next()) {
                 Categoria a = new Categoria();
                 a.setCodigo(rs.getInt(1));
                 lista.add(a);    
             }
           return lista;  
         }else{
          return null;
         }
     }catch (Exception e){
          return null;
     }
   }
   
 public String Excluir_Categoria(Categoria a){
   String sql = "delete from cliente where idcliente = ? and nome = ? ";
   try{
     PreparedStatement ps = getCon().prepareStatement(sql);
     ps.setInt(1, a.getCodigo());
     ps.setString(2, a.getNome());
     
       if (ps.executeUpdate() > 0) {
           return "Excluido com sucesso";   
       }else{
       return "Erro ao excluir";
       }
   }catch (SQLException e){
          return e.getMessage();
     }
}

}
    