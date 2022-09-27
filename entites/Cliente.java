import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String name;
    private String email;
    private Date birthDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Cliente(){        
    }

    public Cliente(String name, String email, Date newBirthDate) throws ParseException{        
        this.setBirtDate(newBirthDate);
        this.setName(name);
        this.setEmail(email);
    }

    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirtDate() {
        return birthDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birthDate = birtDate;
    }
    @Override
    public String toString(){
        return "\nCliente: " + this.getName() + " (" + sdf.format(this.getBirtDate()) + ")" +
        " - " + this.getEmail();
    }

}
