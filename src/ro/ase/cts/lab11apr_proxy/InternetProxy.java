package ro.ase.cts.lab11apr_proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet{
    ProviderInternet p=new ProviderInternet();
    ArrayList <String> blackList=new ArrayList<>();
    public void addInBlacklist(String url)
    {

        blackList.add(url);
    }
    public void removeFromBlackList(String url)
    {
        if(!blackList.isEmpty()&&blackList.contains(url))
        blackList.remove(url);
    }
    @Override
    public void connectTo(String url) {
        if(blackList.contains(url))
        {
            System.out.println("conexiune blocata");
        }
        else
        {
            p.connectTo(url);
        }
    }
}
