package org.example;
// Author: Rahul Gattu

import java.io.*;
import java.util.Scanner;

public class Urinals {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("For keyboard input enter 0 for File input enter 1");
        int opt=sc.nextInt();
        if(opt==0)
        {
            System.out.println(" enter the input");
            s = sc.next();
            //goodString("11000");
            int x = getUrinals(s);
            System.out.println(x);
        }
        else
        {
            BufferedReader br = null;
            try {
                FileReader file = new FileReader(new File("C:\\Users\\Rahul Gattu\\Desktop\\ICA-8-Testing-individual-\\ICA8\\src\\main\\java\\org\\example\\urinal.dat"));
                br = new BufferedReader(file);

                File fout = new File("rule.txt");
                if (!fout.exists()) {
                    fout.createNewFile();

                }

                FileWriter fw = new FileWriter(fout.getAbsolutePath());
                BufferedWriter bw = new BufferedWriter(fw);
                while (true) {
                    String temp = br.readLine();
                    if (temp == null) break;
                    //System.out.println(temp);
                    int val = getUrinals(temp);
                    //    System.out.println(val);
                    bw.write(Integer.toString(val));
                    bw.newLine();
                }
                br.close();
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
                // i=getUrinals(null);
            }
        }
    }

    public static boolean goodString( String str )
    {  // checks to see if valid string
        boolean gs=false;
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='0'||str.charAt(i)=='1')
           {
               gs=true;
           }
           else {
               gs=false;
           }
       }
        return gs;
    }
    public static int getUrinals(String s){
        int count =0,count1=0;
        int j=0;
        if(s.contains("11")){
            return -1;
        }
        for(int l=0;l<s.length();l++){
            if(s.charAt(l)=='1'){
                count++;
            }
        }
       // System.out.println(count);
        char[] c= new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            c[i]=s.charAt(i);
        }

        for(int i=0; i<c.length;i++)
        {
            //System.out.println(i);
            if(i==0)
            {
                //System.out.println(c[i]);
                if(c.length==1){
                    return 1 - c[0]+'0';
                }
                else if(c[i]=='0' && c[i+1]=='0'){
                    c[i]='1';
                }
            }
            else if(i==c.length-1){
                if(c[i]=='0' && c[i-1]=='0'){
                    c[i]='1';
                }


            }
            else{
                if(c[i]=='0' && c[i-1]=='0' && c[i+1]=='0'){
                    c[i]='1';

                }
                else if(c[i]=='1' && c[i+1]=='1'){
                    return -1;


                }
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]=='1'){
                count1++;

            }

        }
        for(int i=0;i<c.length;i++){


            //System.out.println(c[i]);

        }
        //System.out.println(count1);
        //System.out.println(count);
        return count1-count;
    }
}