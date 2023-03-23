public class Methods {

    public void methodA(String input) {
        System.out.print("J");
        if (!input.equals("java")) {
            System.out.print("a");
            System.out.print("v");
            methodB("java");
        } else {
            System.out.println("d");
            System.out.println(methodC(input));
        }

    }
    public void methodB(String is) {
        System.out.println("a");

        }
    public int methodC(String input) {
        System.out.print("i");
        methodD(input.length());
        return input.length() * 3;
    }
    public void methodD(int number) {
        System.out.println("s");
        if (number > 5) {
            System.out.print("b");
        }
        System.out.print("o");
    }
    public void methodE(String bestPizza) {
        System.out.print("r");
        if(bestPizza.equals("peperoni")){
            System.out.print("i");
        }
    }
    public void methodF(String bestGame){
        System.out.print("n");
        if(!bestGame.equals("Elden Ring")){
            System.out.print("g");
        }
    }

}