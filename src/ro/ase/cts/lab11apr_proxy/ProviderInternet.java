package ro.ase.cts.lab11apr_proxy;

public class ProviderInternet implements Internet{
    @Override
    public void connectTo(String url) {
        System.out.println("conexiune OK");
    }

}
