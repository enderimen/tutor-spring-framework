/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 14.12.2018
 * Time: 11:49
 * Project Name: spring-framework-1
 */
public class Customer {

    private int id;
    private String name;
    private String surname;
    private Adress adress;

    public Customer() {
    }

    public Customer( int id, String name, String surname, Adress adress ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress( String adress ) {
        this.adress = adress;
    }
}
