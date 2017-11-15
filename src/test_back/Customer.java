
package test_back;

public class Customer {
    private int id_customer;
    private String cpf_cnpj;
    private String nm_customer;
    private boolean is_active;
    private int vl_total;
    
    //Set's e get's das variaveis
    
    public int getId_customer(){
        return this.id_customer;
    }
    
    public void setId_customer(int novo){
        this.id_customer = novo;
    }
    
    public String getCpf_cnpj(){
        return this.cpf_cnpj;
    }
    
    public void setCpf_cnpj(String novo){
        this.cpf_cnpj = novo;
    }
    
    public String getNm_cutomer(){
        return this.nm_customer;
    }
    
    public void setNm_customer(String novo){
        this.nm_customer = novo;
    }
    
    public boolean getIs_active(){
        return this.is_active;
    }
    
    public void setIs_active(boolean novo){
        this.is_active = novo;
    }
    
    public int getVl_total(){
        return this.vl_total;
    }
    
    public void setVl_total(int novo){
        this.vl_total = novo;
    }
    
}
