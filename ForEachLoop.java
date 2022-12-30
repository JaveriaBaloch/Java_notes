public class ForEachLoop {
    public static void main(String[] args) {
        // int [] score = new int []{22,34,56,82,45,83,25,99};
        // for(int i: score){
        //     System.out.println(i);
        // }
        // multi Dimensional array
        int [][] list = {
            {33,55,22,45,344},
            {22,33,45,22,54}
        };
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;i++){
                System.out.println("array 2 = "+list[i][j]);
            }
        }
    }
}
