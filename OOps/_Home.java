package OOps;

import Interfaces.Interface1;

public class _Home extends Home implements Interface1{
    public _Home(String [] args, int rooms,String color, int stories,String design){
        peoplesLiving(args);
        rooms(rooms);
        houseColor(color);
        numberOfFloors(stories);
        houseDesign(design);
    }
    public int prize( ){
        return 20000;
    }
  
}
