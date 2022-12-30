import Interfaces.Interface1;
import OOps.*;;

public class OOP_intro {
    public static void main(String[] args) {
        String [] p1 = {"Imdad","Alex","John","Yusuf","Jacob"};
        _Home H1 = new _Home(p1,3,"yellow",5,"Italic");
        if(H1 instanceof Interface1){
            System.out.println("check interface 1");
        }
    }
}
