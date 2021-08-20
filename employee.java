package com.raghu;

import java.lang.constant.Constable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] name = new String[3];
        int[] yearofjoining=new int[3];
        String[] address=new String[3];
        Scanner input=new Scanner(System.in);

        System.out.println("enter the names");
        for(int i=0;i<=2;i++) {
            name[i] = input.next();
        }

            System.out.println("enter the salary");
            for (int j = 0; j <= 2; j++) {
                yearofjoining[j] = input.nextInt();
            }
            System.out.println("enter the address");
            for (int k = 0; k <= 2; k++) {
                address[k] = input.next();
            }
            System.out.println("names  yearofjoining  address");
            for (int m = 0; m <= 2; m++) {
                System.out.print(name[m] + "\t" + yearofjoining[m] + "\t" + address[m]+"\n");
            }


    }
}
