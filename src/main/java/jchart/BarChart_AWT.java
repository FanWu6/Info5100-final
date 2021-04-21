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
      
      int price1 = 0;
      int n1 = 0;
      for(House house:houses){
          if(house.getRegion()==0){
              price1 = price1 + Integer.parseInt(house.getPrice());
              n1=n1+1;    
          }
      }
      int priceR1 = price1/n1;
      
      int price2 = 0;
      int n2 = 0;
      for(House house:houses){
          if(house.getRegion()==1){
              price2 = price2 + Integer.parseInt(house.getPrice());
              n2=n2+1;    
          }
      }
      int priceR2 = price2/n2;
      
      int price3 = 0;
      int n3 = 0;
      for(House house:houses){
          if(house.getRegion()==2){
              price3 = price3 + Integer.parseInt(house.getPrice());
              n3=n3+1;    
          }
      }
      int priceR3 = price1/n3;
      
      int price4 = 0;
      int n4 = 0;
      for(House house:houses){
          if(house.getRegion()==3){
              price4 = price4 + Integer.parseInt(house.getPrice());
              n4=n4+1;    
          }
      }
      int priceR4 = price4/n4;
      
      dataset.addValue(priceR1,"price", Region1);
      dataset.addValue(priceR2,"price", Region2);
      dataset.addValue(priceR3,"price", Region3);
      dataset.addValue(priceR4,"price", Region4);

     // dataset.addValue( 1.0 , fiat , speed );        
     // dataset.addValue( 3.0 , fiat , userrating );        
     // dataset.addValue( 5.0 , fiat , millage ); 
     // dataset.addValue( 5.0 , fiat , safety );           

    // dataset.addValue( 5.0 , audi , speed );        
     // dataset.addValue( 6.0 , audi , userrating );       
     // dataset.addValue( 10.0 , audi , millage );        
    //  dataset.addValue( 4.0 , audi , safety );

    //  dataset.addValue( 4.0 , ford , speed );        
    //  dataset.addValue( 2.0 , ford , userrating );        
    //  dataset.addValue( 3.0 , ford , millage );        
     // dataset.addValue( 6.0 , ford , safety );               

      return dataset; 
   }
  


}
