/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryy;

import java.util.ArrayList;
public class Petugas implements User{
   //private =modifayer //string type data // h variabel //menyatakan objek baru 
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    //public,petugas=modifayer
    public Petugas(){//konstruktor
        this.namaPetugas.add("Admin 1");
        this.alamat.add("Sawojajar");
        this.telepon.add("089********");
        this.jabatan.add(1);
        // aray list
        
        this.namaPetugas.add("Admin 2");
        this.alamat.add("Belimbing");
        this.telepon.add("081*********");
        this.jabatan.add(2);
    }
//overide mengambil method dan data dari user dan di implementasikan dengan keyword this
    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }//Overriding dilakukan saat kita ingin membuat ulang sebuah method pada sub-class atau class ana

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public void tampilPetugas(){
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Jabatan = "+getJabatan(i));
        }
    }

    @Override
    public void setJabatan(Integer jabatan) {
        this.jabatan.add(jabatan);
    }

    @Override
    public Integer getJabatan(int id) {
        return this.jabatan.get(id);
    }
    }


