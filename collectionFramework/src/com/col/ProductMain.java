package com.col;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductMain
{
	List color=null;
	List product=null;
	Scanner sc=new Scanner(System.in);
     public void addColors()
		{
			color=new ArrayList();
			
			
			System.out.println("How many colors do you want?");
			int num=sc.nextInt();
			for(int i=0;i<num;i++)
			{
				ProductColor c=new ProductColor();
				System.out.println("Enter color id");
				c.setCid(sc.nextInt());
				
				System.out.println("Enter color name");
				c.setCname(sc.next());
				color.add(c);
			}
		}
     public void displayColors()
     {
    	 if(!color.isEmpty())
    	 {
    	        System.out.println("===================================================");
                System.out.println("Color ID"+ " "+"Color Name");
    		 for (Object object : color) 
    		 {
				ProductColor cr=(ProductColor)object;
				System.out.println(cr.getCid() + "         " + cr.getCname());
			 }
    	        System.out.println("===================================================");

    	 }
     }
     
     
     public void addProduct()
     {
    	 product=new ArrayList();
    	 System.out.println("How many products do you want?");
    	 int num=sc.nextInt();
    	 for(int i=0;i<num;i++)
    	 {
    		 Product pr=new Product();
    		 System.out.println("Enter product id");
    		 pr.setPid(sc.nextInt());
    		 
    		 System.out.println("Enter product name");
    		 pr.setPname(sc.next());
    		 displayColors();
    		 
    		 List list=new ArrayList();
    		 
    		 System.out.println("How many colors do you want?");
    		 int h=sc.nextInt();
    		 for(int j=0;j<h;j++)
    		 {
    			 System.out.println("Enter color id for allocation");
    			 int f=sc.nextInt();
    			 for (Object object : color) 
    			 {
					ProductColor v=(ProductColor)object;
					
					if(v.getCid()==f)
					
						list.add(v);
    			 }
    			 pr.setColor(list);
        		 
    		 }
    		 product.add(pr);
    	 }
    
     }
     
    public void displayProduct()
     {
    	 if(!product.isEmpty())
    	 {
    	        System.out.println("===================================================");
                System.out.println("Productn Id"+" "+" "+"Product Name");
    		 for (Object object : product) 
    		 {
				Product p=(Product)object;
				System.out.println(p.getPid()+"        "+p.getPname());
				
				if(!p.getColor().isEmpty())
				{
					System.out.println("Color Id"+" "+" "+"Color Name");
					
					for (Object object2 : p.getColor()) 
					{
						ProductColor pc=(ProductColor)object2;
						System.out.println(pc.getCid()+"    "+pc.getCname());
					}
				}
				
			}
    	        System.out.println("===================================================");

    	 }
     }
	public static void main(String[] args) 
	{
		ProductMain pm=new ProductMain();
		pm.addColors();
		pm.displayColors();
		pm.addProduct();
		pm.displayProduct();
	}

}
