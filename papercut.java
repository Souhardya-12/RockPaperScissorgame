package com.company;
import java.util.Scanner;
import java.util.Random;
public class papercut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        System.out.println("You're about to play the rock paper scissor game");
        int i=5, x=0, y=0;
        while(i>0){
            int r = rc.nextInt(2);
            System.out.println("Enter your choice:");
            System.out.println("0:rock");
            System.out.println("1:paper");
            System.out.println("2:scissor");
            int u = sc.nextInt();
            if(r==u){
                continue;
            }
            else{
                if(r==0 && u==2){
                    x++;
                }
                if(r==2 && u==0){
                    y++;
                }
                if(r==1 && u==0){
                    x++;
                }
                if(r==0 && u==1){
                    y++;
                }
                if(r==2 && u==1){
                    x++;
                }
                if(r==1 && u==2){
                    y++;
                }
                i--;
            }
        }
        if(x>y){
            System.out.println("You Lose");
        }
        if(y>x){
            System.out.println("You Win");
        }
    }
}
