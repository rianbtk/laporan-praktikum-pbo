package com.mycompany.sepeda;

/**
 *
 * @author RianBtk
 */
public class sepedaBalap extends sepeda {
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue)
    {
        tipeSuspensi = newValue;
    }
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Tipe suspensi:"+tipeSuspensi);
    }
    
}
