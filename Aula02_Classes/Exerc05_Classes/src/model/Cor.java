package model;

public class Cor {
	// Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
 // Declaring the background color
    public static final String ANSI_RED_BACKGROUND  = "\u001B[41m";
  
    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[33m";
  
    // Main driver method
    public static void main(String[] args)
    {
        // Printing the text on console prior adding
        // the desired color
        System.out.println(ANSI_YELLOW
                           + "This text is yellow"
                           + ANSI_RESET);
        
        
     // Now add the particular background color
        System.out.println(ANSI_RED_BACKGROUND
                           + "The background color is red"
                           + ANSI_RESET);
        
        main2();
    }
    
    
    public static void main2() {
        String CSI = "\u001B[";
        System.out.print (CSI + "31" + "m");
        System.out.print ("Texto vermelho");
        System.out.println (CSI + "m");
        
        System.out.print (CSI + "32" + "m");
        System.out.print ("Texto verde");
        System.out.println (CSI + "m");
        
        System.out.print (CSI + "33" + "m");
        System.out.print ("Texto amarelo");
        System.out.println (CSI + "m");
        
        System.out.print (CSI + "39" + "m");
        System.out.print ("Texto normal");
        System.out.println (CSI + "m");
        
    }
    
}
