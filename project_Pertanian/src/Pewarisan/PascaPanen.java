/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class PascaPanen {
    private int id;
    private Date tanam;
    private Date panen;
    
    public PascaPanen(int id, Date tanam, Date panen) {
        this.id = id;
        this.tanam = tanam;
        this.panen = panen;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Date getTanam() {
        return tanam;
    }
    
    public void setTanam(Date tanam) {
        this.tanam = tanam;
    }
    
     public Date getPanen() {
        return panen;
    }
    
    public void setPanen(Date panen) {
        this.panen = panen;
    }
    
    @Override
    public String toString() {
        return "PascaPanen{" +
                "id=" + id +
                ", tanam=" + tanam +
                ", panen=" + panen +
                '}';
    }
}
