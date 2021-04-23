/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jchart;

/**
 *
 * @author Tengfei
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
//每个地区租户人口
public class BarChart_Tenantpopulation_AWT extends ApplicationFrame
{
   List<House> houses;
   public BarChart_Tenantpopulation_AWT( String applicationTitle , String chartTitle )
   {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Region",            
         "Population",            
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
      

      int n1 = 0;
      for(House house:houses){
          if(house.getRegion()==0&&house.getTenantId()!=null){
              n1=n1+1;    
          }
      }

      int n2 = 0;
      for(House house:houses){
          if(house.getRegion()==1&&house.getTenantId()!=null){
              n2=n2+1;    
          }
      }
      
      int n3 = 0;
      for(House house:houses){
          if(house.getRegion()==2&&house.getTenantId()!=null){
              n3=n3+1;    
          }
      }
      
      int n4 = 0;
      for(House house:houses){
          if(house.getRegion()==3&&house.getTenantId()!=null){
              n4=n4+1;    
          }
      }
      
      dataset.addValue(n1,"Tenant number", Region1);
      dataset.addValue(n2,"Tenant number", Region2);
      dataset.addValue(n3,"Tenant number", Region3);
      dataset.addValue(n4,"Tenant number", Region4);
      return dataset; 
   }
  


}
