/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryy;

import java.util.ArrayList;

public class Transaksi{        //variabel //new=membuat obejek  //integer=type data
    //deklarasi variabel arraylist
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
   //membuat 
    public JenisLaundry laundry = new JenisLaundry();
    
    //*method-mendeklarasikan nilai-return this=mengembalikan nilai variabel
    //deklarasi array list/index
    public int size(){//size digunakan sbg alat menghitung array list
        return this.idClient.size();
    }//public int = method
    //modifayer//nama method//konstruktor
    public Transaksi(){
        this.idClient.add(12345);//araylist/untuk melihat id client dalam bentuk arraylist
        this.idClient.add(54321);
        for(int i=0;i<laundry.size();i++){
            this.idJenisLaundry.add(i);
    }
    }
    //set=mutator/menambah nilai variabel
    public void setIDClient(int id){ //string,int=type data
        this.idClient.add(id);//public,private modifayer
    }
    //public void method
    public void setIDJenisLaundry(int id){//di dalam kurung parameter
        this.idJenisLaundry.add(id);
    }//this inheritance
    
    public void setBanyak(int banyak){
        this.banyak.add(banyak);
    }
    //*get=asesor/mengambil nilai variabel
    public int getClient(int id){
        return this.idClient.indexOf(id);
    }
    
    public int getIDClient(int id){
        return this.idClient.get(id);
    }
    
    public int getIDJenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    }
    
    public int getBanyak(int id){
        return this.banyak.get(id);
    }
    
    public int getIDBanyak(int banyak){
        return this.banyak.indexOf(banyak);
    }
    
}

