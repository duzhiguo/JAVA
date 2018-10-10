package list;

import java.util.ArrayList;
import java.util.List;

public class listFeng {
    List fen = new ArrayList();
    public Object get(String name){
        for (int i = 0; i < fen.size(); i++) {
            if(name.equals(fen.get(i).toString())){
                return fen.get(i);
            }
        }
        return null;
    }

}
