package test_back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertionBD {
    private Connection con;
    
    //Faz a conexao com o BD toda vez que o objeto da classe eh utilizado
    public InsertionBD () throws SQLException{
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Executa a insercao no BD
    public void insertion (Customer customer){
        String sql = "INSERT INTO tb_customer_account" + "(id_customer,cpf_cnpj,nm_customer,is_active,vl_total)" + "VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement state = con.prepareStatement(sql);
            
            state.setInt(1,customer.getId_customer());
            state.setString(2,customer.getCpf_cnpj());
            state.setString(3,customer.getNm_cutomer());
            state.setBoolean(4,customer.getIs_active());
            state.setInt(5,customer.getVl_total());
            
            try{
                state.execute(); 
            }finally{
                state.close();
            }
            
            
            
        }catch(SQLException e){
            System.out.println("Insertion failed");
        }
    }
}
