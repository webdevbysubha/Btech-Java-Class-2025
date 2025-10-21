public class CommandLine {
    public static void main(String args[]) {

        // System.out.println("First Argument : "+args[0]);
        // System.out.println("Second Argument : "+args[1]);
      
        for(int i=0; i<args.length; i++)
        {
            System.out.println((i+1)+" Argument "+args[i]);
        }

    }
}
