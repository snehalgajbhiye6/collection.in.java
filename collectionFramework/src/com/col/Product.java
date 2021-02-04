package com.col;

import java.util.List;

public class Product 
{
    private int pid;
    private String pname;
    private List color;
    
    public int getPid()
    {
    	return pid;
    }
    public void setPid(int pid)
    {
    	this.pid=pid;
    }

	
    
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

	
	
	public List getColor() {
		return color;
	}
	public void setColor(List color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", color=" + color + "]";
	}
	
	
    
}
