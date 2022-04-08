package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userinput = new Scanner(System.in);

        System.out.println("You are in a land full of Dragons in Front of you, ");
        System.out.println("You see two Caves, Inn one Cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and will eat you on sight.");
        System.out.println("Which cave are you willing to go into? Cave 1 or Cave 2?");
        System.out.println("Please pick either 1 or 2.");


        String Cave1 = " You approach the cave.. \n" + "It's dark and spooky... \n" + "A large dragon jumps out in front of you! \n" +
                "He opens his jaws and ... \n" + "Gobbles you down in one bite!";

        String Cave2 = " You approach the cave.. \n" + "It's dark and spooky... \n" + "A large dragon jumps out in front of you! \n" +
                "He opens his jaws and ... \n" + "Share's some of it's treasure with you. ";



        int answer = userinput.nextInt();

     if(answer == 1)
     {
         System.out.println(Cave1);
     }
     else if (answer == 2)
     {
         System.out.println(Cave2);
     }
     else {
         System.out.println("You picked the wrong input");
     }
try {
  if(System.out.println();)
}

    }
}
