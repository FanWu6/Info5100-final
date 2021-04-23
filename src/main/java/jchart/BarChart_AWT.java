/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jchart;

/**
 *
 * @author Dengbowen
 */
import Util.SysData;
import com.neu.infofinal.bean.House;
import java.util.List;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class BarChart_AWT extends ApplicationFrame
{
   List<House> houses;
   List<List<Integer>> regionPriceAndTenantNumber=new ArrayList<>();
//   List<Integer> tenantNumber=new ArrayList<>();
    public List<List<Integer>> getRegionPriceAndTenantNumber() {
        return regionPriceAndTenantNumber;
    }
   
   public BarChart_AWT( String applicationTitle , String chartTitle )
   {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Region",            
         "Price $/month",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
   private CategoryDataset createDataset( )
   {
      final String Region1 = "Region1";        
      final String Region2 = "Region2";        
      final String Region3 = "Region3";
      final String Region4 = "Region4";
         
               
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      houses =SysData.getAllHouses();
      
      List<Integer> curP$N=new ArrayList<>();      
      int price1 = 0;
      int n1 = 0;
      int c1=0;
      for(House house:houses){
          if(house.getRegion()==0){
              price1 = price1 + Integer.parseInt(house.getPrice());
              n1=n1+1;
            if(house.getTenantId()!=null){
              c1++;
          }
          }

      }
      int priceR1 = price1/n1;
      curP$N.add(priceR1);
      curP$N.add(c1);

      regionPriceAndTenantNumber.add(new ArrayList<>(curP$N));
      
      curP$N=new ArrayList<>();
      int price2 = 0;
      int n2 = 0;
      c1=0;
      for(House house:houses){
          if(house.getRegion()==1){
              price2 = price2 + Integer.parseInt(house.getPrice());
              n2=n2+1;
                          if(house.getTenantId()!=null){
              c1++;
          }
          }
      }
      int priceR2 = price2/n2;
        curP$N.add(priceR2);
              curP$N.add(c1);
      regionPriceAndTenantNumber.add(new ArrayList<>(curP$N));
      
    curP$N=new ArrayList<>();
      int price3 = 0;
      int n3 = 0;
      c1=0;
      for(House house:houses){
          if(house.getRegion()==2){
              price3 = price3 + Integer.parseInt(house.getPrice());
              n3=n3+1;    
            if(house.getTenantId()!=null){
              c1++;
          }
          }
      }
    int priceR3 = price1/n3;
    curP$N.add(priceR3);
    curP$N.add(c1);
      regionPriceAndTenantNumber.add(new ArrayList<>(curP$N));
      
          curP$N=new ArrayList<>();
      int price4 = 0;
      int n4 = 0;
      for(House house:houses){
          if(house.getRegion()==3){
              price4 = price4 + Integer.parseInt(house.getPrice());
              n4=n4+1;  
            if(house.getTenantId()!=null){
              c1++;
          }
          }
      }
      int priceR4 = price4/n4;
        curP$N.add(priceR4);
        curP$N.add(c1);
      regionPriceAndTenantNumber.add(new ArrayList<>(curP$N));
      
      dataset.addValue(priceR1,"price", Region1);
      dataset.addValue(priceR2,"price", Region2);
      dataset.addValue(priceR3,"price", Region3);
      dataset.addValue(priceR4,"price", Region4);

      return dataset; 
   }
  


}
