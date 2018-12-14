/**
 * Created by IntelliJ IDEA.
 * User: enderimen
 * Date: 14.12.2018
 * Time: 11:55
 * Project Name: spring-framework-1
 */
public class DependencyInjectionMain {

    public static void main( String[] args ) {

        Customer customer = new Customer( 1, "Ender", "IMEN", new Adress( "Çamlık" ) );
    }
}
