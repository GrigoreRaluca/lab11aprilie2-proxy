package ro.ase.cts.lab11apr_proxy;

public class Main {
    public static void main(String[] args) {
      Internet conexiune=new InternetProxy();
        ((InternetProxy)conexiune).addInBlacklist("abc.com");
       conexiune.connectTo("abc.com");
       conexiune.connectTo("lala.com");

       testareConexiune(conexiune,"abc.com");

    }

    public static void testareConexiune(Internet c, String url){
        c.connectTo(url);
    }
}
