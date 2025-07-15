package statement.control;

public class Main {
    public static void main(String []args){
        int a=3;
        int b=3;
        int c=4;

        /*switch(a){
            case 2:
                System.out.println("your input is 2");
                break;
            case 3:
                System.out.println("your input is 3");
                break;
            default:
                System.out.println("your input is not 2");
                break;
        } */

        if (a >= b){
            System.out.println("a is greater than b");
            if (b > c){
                System.out.println("b is greater than c");
            }
            else if (c > b) {
                System.out.println("c is greater than b");
                if (c > a){
                    System.out.println("c is also greater than a");
                }
            }
        else {
                System.out.println("a is smaller than b");
            }

        }
    }

}
