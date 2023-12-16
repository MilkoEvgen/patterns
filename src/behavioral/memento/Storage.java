package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<Save> saves = new ArrayList<>();

    void save(Save save){
        saves.add(save);
    }
    Save getLastSave(){
        return saves.remove(saves.size() - 1);
    }
}
