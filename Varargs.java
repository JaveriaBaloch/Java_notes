class Varargs {
    public static void main(String[] args) {
        int [] numbers = new int [] {90,23,11,26,89,34,89};
        System.out.println(sum(numbers));
    }
    public static int sum(int ...nums) {
        int result = 0;
        for(int numbers:nums){
            result += numbers;
        }
        return result;
    }

}