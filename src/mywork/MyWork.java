/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mywork;

/**
 *
 * @author Veyso
 */
public class MyWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numbers2D[][] = new int [3][4];//two dimensional array
            for (int i = 0; i<3; i++){
              for (int j=0; j<4; j++){
                  numbers2D[i][j] = i+j*2; //each i and j numbers were summed then multiplied by two and two-dimensional lined up
            
              }
            }
            for (int i = 0; i<3; i++){
              for (int j=0; j<4; j++){
                  System.out.print( numbers2D[i][j] + " ");//matrix written
    }
                System.out.println();//go to bottom line if loop ends 
}
    }
}
