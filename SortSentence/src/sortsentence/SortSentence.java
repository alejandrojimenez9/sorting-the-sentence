/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortsentence;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class SortSentence {

  public static void main(String[] args) {

    String s = "is1 sentence4 This2 a3";
    String s1 = s.strip();
    String[] str = s1.split(" ");

    sort(str);
    System.out.println(Arrays.toString(str));
    System.out.println(str);
}
   static void sort(String[]str){
        int i = 0;
        char end = str[i].charAt(str[i].length() - 1);
        int p = end - '0';
        while (i < str.length) {
            int correcto = p - 1 ;
            if (correcto < str.length && str[i] != str[correcto]) {
                swap(str, i, correcto);
            } else {
                i++;
            }
        }
    }
static void swap(String[] str, int primero , int segundo){
    String temp = str[primero];
        str[primero] = str[segundo] ;
        str[segundo] = temp;
}
}

