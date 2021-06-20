
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stallion
 */
public class Resti {

    private static Resti instance;

    public static Resti getinstance() {
        if (instance == null) {
            return new Resti();
        } else {
            return instance;
        }
    }

    private Resti() {
    }

    private ArrayList<Bill> bills = new ArrayList<>();

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }
    
    

}
