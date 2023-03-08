public class demo1 {
    public static void main(String[] args) {
        /*for(int i = 0; i < 10; i++) {
            System.out.println("Number : " + i);
        }*/

        //while is used for more than one condition
        /*int i = 0;
        int j = 1;
        while ( i < 10 && j < 5){
            System.out.println("Number of i : " + i);
            System.out.println("Number of j : " + j);
            i++;
            j++;*/
    //do-while is used for menu based program
        int i = 0;
        int j = 1;
        do{
            System.out.println("Number of i : " + i);
            System.out.println("Number of j : " + j);
            i++;
        }while(i<0);
    }
}
