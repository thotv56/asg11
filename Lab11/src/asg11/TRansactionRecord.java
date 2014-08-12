/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author GRU-PC
 */
public class TRansactionRecord implements Serializable {
    private String tk = "1000000000000000"; 
    private String trans="10000000000";
    public TRansactionRecord(){};
    public TRansactionRecord(String tk, String trans){
        this.tk = tk;
        this.trans =trans;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        TRansactionRecord tr = new TRansactionRecord();

        //Ghi doi tuong xuong file taikhoan.dat
        try {
            FileOutputStream f = new FileOutputStream("D:\\taikhoan.dat");
            ObjectOutputStream oOT = new ObjectOutputStream(f); // Sử dụng để ghi file theo từng Object
            oOT.writeObject(tr); // Ghi  Object là đối tượng tr xuống file
            
            oOT.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra!");
        }
        
        //Tao doi tuong doc file
        TRansactionRecord tr1 = new TRansactionRecord();
        try{
            FileInputStream f = new FileInputStream("D:\\taikhoan.dat");
            ObjectInputStream oIT = new ObjectInputStream(f); // Sử dụng để đọc file theo từng Object
            tr1 = (TRansactionRecord) oIT.readObject(); //Đọc Object 
            oIT.close();
            f.close();
        }catch(IOException e){
            System.out.println("Co loi");
        }catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy class");
        }
        
        System.out.println("Thong tin tk, trans "+tr1.getTk()+"  "+tr1.getTrans());
    }
}
