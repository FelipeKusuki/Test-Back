package test_back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalculateAverage {
    private int ncustomer;
    private int total;
    
    private Connection con;
    
    //Faz a conexao com o BD toda vez que o objeto da classe eh utilizado
    public CalculateAverage () throws SQLException{
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void average (){
        String sql = "SELECT* FROM tb_customer_account WHERE vl_total > 560 AND (id_customer BETWEEN 1500 AND 2700) ORDER BY vl_total DESC";
        
        try{
            List<Customer> customers = new ArrayList<>();
            PreparedStatement state = con.prepareStatement(sql);
            ResultSet resultQuery = state.executeQuery();
            
            while(resultQuery.next()){
                total += resultQuery.getInt("vl_total");
                ncustomer ++;
                System.out.println("Name Customer: " + resultQuery.getString("nm_customer"));
            }
            if(ncustomer == 0){ 
                System.out.println("There's nothing to calculate");
                return;
            }
            
            System.out.println("Average vl_total = " + (total/ncustomer));
            
        }catch(SQLException e){
            System.out.println("Average failed");
        }
    }
}
