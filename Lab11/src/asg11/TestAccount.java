/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author GRU-PC
 */
public class TestAccount {
    
    TRansactionRecord tr = new TRansactionRecord();
    public static void main(String[] args) throws IOException{
        AccountRecord ac = new AccountRecord(100, "Alane", "Jone", 347.8);
        AccountRecord ac1 = new AccountRecord(300, "Marry", "Smith", 27.19);
       try {
           String content = "AcNumber"+"\t"+"Name"+"\t"+"balane";
           
           
			
 
			File file = new File("D:\\oldmast.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(content);
                        bw.newLine();
			bw.write(ac.toString());
                        bw.newLine();
                        bw.write(ac1.toString());
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
         
       try {
           String content = "TransNumber"+"\t"+"Trans";
           String content1 = ac.getAccount()+"\t\t"+"15";
           String content2 = ac1.getAccount()+"\t\t"+"10";
           
			
 
			File file = new File("D:\\TRans.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(content);
                        bw.newLine();
			bw.write(content1);
                        bw.newLine();
                        bw.write(content2);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
    
    
    
