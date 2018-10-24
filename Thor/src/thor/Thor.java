/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thor;

/**
 *
 * @author Baiba
 */
import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        //lai vieglāk - īsāki mainīgo nosaukumi
        int x = lightX;
        int y = lightY;
        int tx = initialTX;
        int ty = initialTY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String a = "";
            String b = "";

            if (ty < y) {
                ty = ty + 1;
                a = "S";
            }
            if (ty > y) {
                ty = ty - 1;
                a = "N";
            }
            if (tx < x) {
                tx = tx + 1;
                b = "E";
            }
            if (tx > x) {
                tx = tx - 1;
                b = "W";
            }

            System.out.println(a + b);

        }

    }
}
