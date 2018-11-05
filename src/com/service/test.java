package com.service;

public class test {
    public static void main(String args[]) {
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}