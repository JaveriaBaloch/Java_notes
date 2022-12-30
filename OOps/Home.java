package OOps;

public class Home {
    public int persons = 0;
    public Home(){
        
    }
    protected static void peoplesLiving(String ...args) {
        System.out.println("following persons are living in this home:");
        if(args.length>0){
            int p=1;
            for(int i=0;i<args.length;i++){
                System.out.println(p+". "+args[i]);
                p++;
            }
        }
        else{
            System.out.println("Noone lives in this house");
        }
       
    }
    protected static void rooms(int room) {

        if(room>0){
                System.out.println("The house is containing "+room+" rooms");
        }
        else{
            System.out.println("There is no room in this house");
        }
    }
    protected static void houseColor(String colors){
        System.out.println("House is colored "+colors);
    }
    protected static void numberOfFloors(int stories){
        if(stories<2){
            System.out.println("House single story");
        }
        else{
            System.out.println("House is multistory and has "+stories--+" floors");
        }
    }
    protected static void houseDesign(String design){
        System.out.println("House is "+design+" designed!");
    }
    public static void FeedBack(String design){
        System.out.println(design);
    }

}
