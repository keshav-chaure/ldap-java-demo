package ldap_demo.org.kc.ldap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello LDAP World!" );
        SimpleLdapClient ldapClient=new SimpleLdapClient();
        ldapClient.callClient();
        
    }
}
