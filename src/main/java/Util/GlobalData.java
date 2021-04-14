/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.neu.infofinal.bean.House;
import com.neu.infofinal.bean.Order;
import com.neu.infofinal.bean.OrderHousework;
import com.neu.infofinal.bean.UserAccount;
import java.util.List;

/**
 *
 * @author wufan
 */
public class GlobalData {
    static List<UserAccount> userAccounts;
    static List<House> houses;
    static List<Order> orders;
    static List<OrderHousework> orderHouseworks;
    static {
        getUserAccounts();
        getAllHouse();
        getAllOrders();
    }

    public static List<UserAccount> getUserAccounts() {
        userAccounts = SysData.getAllUsers();
        return userAccounts;
    }
    
    public static List<House> getAllHouse() {
        houses = SysData.getAllHouses();
        return houses;
    }

    public static List<Order> getAllOrders() {
        orders = SysData.getAllOrders();
        return orders;
    }
    public static List<OrderHousework> getAllOrderHouseworks(){
        orderHouseworks = SysData.getAllOrderHouseworks();
        return orderHouseworks;
        
    }
    
    
    
}
