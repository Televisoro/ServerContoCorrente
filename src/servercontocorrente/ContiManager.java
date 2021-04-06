package servercontocorrente;
import java.net.Socket;
import java.util.HashMap;

/**
 *
 * @author Paolo
 */
public class ContiManager {
    private HashMap<String, ContoCorrente> lista;

    public ContiManager() {
        lista = new HashMap();
        genera();
    }
    
    private void genera(){
       for(int i = 0; i < 10; i++){
            lista.put(""+i, new ContoCorrente(""+i));
        }
    }
    
    public String getListaConti(){
        String l="";
        for(String s : lista.keySet()){
            l = l +"::"+s;
        }
        return l;
    }
    
    public boolean addClient(Socket s, String nconto){
        lista.get(nconto).addClient(s);
        return true;
    }
    
}
