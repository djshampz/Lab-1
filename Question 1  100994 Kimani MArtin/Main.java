public class Main {
    public static void main(String[] args){
        //Creating Object A of class MultiplicationTable
        MultiplicationTable A = new MultiplicationTable(3, 17, 25);
        System.out.println(A.printTable());

        //Creating Object B of class MultiplicationTable
        MultiplicationTable B = new MultiplicationTable(17, 3, 49);
        System.out.println(B.printTable());

        //Creating Object C of class MultiplicationTable
        MultiplicationTable C = new MultiplicationTable(0, 1, 5);
        System.out.println(C.printTable());

    }
}