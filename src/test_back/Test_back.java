
package test_back;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Test_back {
    public static void main(String[] args) throws SQLException {
      InsertionBD insert = new InsertionBD();
      Customer customer = new Customer();
	
      //Caixa de dialogo para o usuario digitar os valores. Esses valores irão popular a tabela
      //Valores são armazenados na classe Customer
      int choice = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para inserir ou 2 para calcular media"));
      
      if(choice == 1){
        int intaux = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ID"));
          customer.setId_customer(intaux);

         String aux = JOptionPane.showInputDialog("Digite seu CPF ou CNPJ");
         customer.setCpf_cnpj(aux);

         aux = JOptionPane.showInputDialog("Digite seu nome");
         customer.setNm_customer(aux);

         customer.setIs_active(true);

         intaux = Integer.parseInt(JOptionPane.showInputDialog("Digite seu valor total"));
         customer.setVl_total(intaux);

       //executa a inserção no BD atraves da classe InsertionBD
      insert.insertion(customer);
      }else if(choice == 2){
          CalculateAverage average = new CalculateAverage();
          average.average();
      }
    }
    
}
