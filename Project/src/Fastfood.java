/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stallion
 */
class Fastfood {
    private String name;
    private int price;
    private int items;

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void CalculateBill(int number){
       int ans=price*number;
       
    }
    
    
}
class pizza extends Fastfood{
    @Override
    public void CalculateBill(int number){
       int ans=this.getPrice()*number;
       
    }
}
class burger extends Fastfood{
    @Override
    public void CalculateBill(int number){
       int ans=this.getPrice()*number;
       
    }
}
class drinks extends Fastfood{
    
    @Override
    public void CalculateBill(int number){
        
       int ans=this.getPrice()*number;
       
    }
}