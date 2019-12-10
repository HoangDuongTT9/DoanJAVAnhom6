/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyxe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class ListXeHoi {
    
    ArrayList<XeHoi> listXH = new ArrayList<>();
    
    public void add(XeHoi xh){
        listXH.add(xh);
    }
    
//    public void delete(XeHoi xh){
//        for (XeHoi XH : listXH) {
//            if (XH.getMaxe().equals(xh.getMaxe())) {
//                listXH.remove(XH);
//            }
//        }
//    }
    
    public void delete1(int index){ 
                listXH.remove(index );

    }
    
    public void update(XeHoi xh){
        for (XeHoi XH : listXH) {
            if (XH.getMaxe().equals(xh.getMaxe())) {
                XH.setTenXe(xh.getTenXe());
                XH.setLoaiXe(xh.getLoaiXe());
                XH.setMau(xh.getMau());
                XH.setGia(xh.getGia());
                XH.setNSX(xh.getNSX());
                XH.setHSX(xh.getHSX());              
            }
        }
    }
    
    public ArrayList<XeHoi> select(){
        return listXH;
    }
    
    public void sortByName()
    {
        
        Collections.sort(listXH, new Comparator<XeHoi> () {

            @Override
            public int compare(XeHoi xh1, XeHoi xh2) {
                return xh1.getTenXe().compareTo(xh2.getTenXe());       
            }
        } );
    }
    
    public void sortByPrice()
    {
        Collections.sort(listXH, new Comparator<XeHoi>() {

            @Override
            public int compare(XeHoi xh1, XeHoi xh2) {
                double gia1 = xh1.getGia();
                double gia2 = xh2.getGia();
                if (gia1 == gia2) return 0;
                else if (gia1 > gia2) return 1;
                else return -1;
            }
        } );
    }
    
    public int TimKiem(String ma){
        int viTri = -1;
        for(int i = 0; i < listXH.size(); i++){
            if(ma.equals(listXH.get(i).getMaxe())){
                viTri = i;
            }
        }
        return viTri;
    }
    public void docFileXE(){
        try {
            // tao doi tung luong va lien ket nguoi du lieu
            File f = new File("D:/Xe.txt");
            FileReader fr = new FileReader(f);

            // doc du lieu
            BufferedReader br = new BufferedReader(fr);
            String line;
            listXH.clear();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                XeHoi xh = new XeHoi();
                xh.setMaxe(str[0]); 
                xh.setTenXe(str[1]); 
                xh.setLoaiXe(str[2]);
                xh.setNSX(str[3]); 
                xh.setMau(str[4]);
                xh.setHSX(str[5]); 
                xh.setGia(Double.parseDouble(str[6]));

                listXH.add(xh);
            }
            // dong luong
            fr.close();
            br.close();
        } catch (IOException ex) {
           JOptionPane(ex);
        }
    }
    
    // ham ghi file lam viec
    public void ghiFileXE(){
        try{
            // tao doi tung luong va lien ket nguoi du lieu
            File f = new File("D:/Xe.txt");
            FileWriter fw =  new FileWriter(f);
            
            // ghi du lieu
            for(XeHoi xh : listXH){
                fw.write(xh.toString());
            }
            
            // dong luong
            fw.close();
        }
        catch(IOException ex){
            JOptionPane(ex);
        }
    }
    public XeHoi find(String key){
        for(XeHoi xh :listXH){
            if(xh.getMaxe().equals(key)
                    || xh.getTenXe().equals(key))
            {
                return xh;
            }
        }
       return null;
    }

    
    private void JOptionPane(IOException ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
