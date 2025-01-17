public class Main {
    // Method that takes a Function as an argument
    public static void main(String[] args) {
        byte res1 = Entry.readByte("Hey, give me a number between -128 and 127.");
        System.out.println("Good Job! You've entered " + res1);
        int res2 = Entry.readInt("Hey, give me an integer");
        System.out.println("Good Job! You've entered " + res2);
        float res3 = Entry.readFloat("Hey, give a real number, but not too big.");
        System.out.println("Good Job! You've entered " + res3);
        double res4 = Entry.readDouble("Hey, give me a real number.");
        System.out.println("Good Job! You've entered " + res4);
        char res5 = Entry.readChar("Hey, give me a single character.");
        System.out.println("Good Job! You've entered " + res5);
        String res6 = Entry.readString("Hey, write some text :)");
        System.out.println("Good Job! You've entered " + res6);
        boolean res7 = Entry.readYesNo("Choose Yes [y] or No [n].");
        System.out.println("And we are done! THis is all... " + res7);

    }
}