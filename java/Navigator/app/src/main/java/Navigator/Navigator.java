package Navigator;

import java.util.ArrayList;



//    back method takes no arguments and returns the previous location or NULL if there is none.
//    forward method takes no arguments and returns the next location or NULL if there is none.
//    go method should take a string argument representing the desired location.

public class Navigator {
    public   int CurrentPosion=-1;
    ArrayList<String> locations=new ArrayList<>();
    public Navigator() {
    }
    public void go(String go){
        locations.add(go);
        CurrentPosion++;

        }

    public String back(){
        if(CurrentPosion<=0){
            return null;
        }

        return locations.get( --CurrentPosion);
    }

    public String forward(){
        if(CurrentPosion==-1||CurrentPosion+1>locations.size()){
            return null;
        }

        return locations.get( ++CurrentPosion);
    }
}
