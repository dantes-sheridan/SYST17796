/* Andrew Dantes 03-17-2020
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;
/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        int players = 0;
        Scanner k = new Scanner(System.in);
        
        
        System.out.print("Enter the number of players: ");
        players = k.nextInt();
        do{
            System.out.print("Error: Players Must Be Between 2 - 4" + "\nEnter the number of players: ");
            players = k.nextInt();
        }while (players < 2 | players > 4);
        
        System.out.println("Done");
        
        
    
    }
}
