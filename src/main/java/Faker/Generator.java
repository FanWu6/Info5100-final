/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faker;

/**
 *
 * @author Dengbowen
 */
public class Generator {
    
    public static void main(String[] args){
        String address = FakerUtl.buildingNumber();
        System.out.println(address);
        int price = FakerUtl.randomIntNum(1900, 2300);
        System.out.println(price);
    }
    
}
