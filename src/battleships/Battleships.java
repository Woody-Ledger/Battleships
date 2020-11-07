
package battleships;

import java.util.Scanner;

public class Battleships {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] shipx = new int [10];
        int[] shipy = new int [10];
        int x = 0;
        int y = 0;
        int w = 0;
        int v = 0;
        
        System.out.println("Player one, please place your battleship (x then y, number form)");
        for(int i = 0; i < 1 ; i--){
            x = input.nextInt();
            y = input.nextInt();
            shipx[1] = x;
            shipy[1] = y;
            for(int s = 0; s < 20 ; s++){
                System.out.println("Proccessing...");
            }
            if((x > 10) || (x < 1)){
                System.out.println("Incorrect position, try again");
                
            } else {
                if((y > 10) || (y < 1)){
                    System.out.println("Incorrect position, try again");
                } else {
                    i = 2;
                }
            }
        }
                System.out.println("Player two, please place your battleship (x then y, number form)");
        for(int i = 0; i < 1 ; i--){
            x = input.nextInt();
            y = input.nextInt();
            shipx[2] = x;
            shipy[2] = y;
            for(int s = 0; s < 20 ; s++){
                System.out.println("Proccessing...");
            }
            if((x > 10) || (x < 1)){
                System.out.println("Incorrect position, try again");
                
            } else {
                if((y > 10) || (y < 1)){
                    System.out.println("Incorrect position, try again");
                } else {
                    i = 2;
                }
            }
        }
        System.out.println();
        System.out.println("Ok...");
        for(w = 0; w > -1 ; w++){ 
            if(w %2 == 0){
        System.out.println("Player one, choose a position");
        x = input.nextInt();
        y = input.nextInt();
        if((x == shipx[2]) && (y == shipy[2])){
            System.out.println("Player one shot Player two's battleship");
            w = -4;
            v = 1;
        } else {
            System.out.println("Miss, Player Two's turn");
        }
    } else {
               System.out.println("Player two, choose a position");
               x = input.nextInt();
               y = input.nextInt();
               if((x == shipx[1]) && (y == shipy[1])){
                   System.out.println("Player two shot Player one's battleship");
                   w = -4;
                   v = 2;
               } else {
                   System.out.println("Miss, Player one's turn");
               }
            }
    
}
        if(v == 1){
            System.out.println("Player one wins");
        } else {
            System.out.println("Player two wins");
        }
}
}