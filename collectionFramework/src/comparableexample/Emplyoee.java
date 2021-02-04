package comparableexample;

public class Emplyoee implements Comparable
{ 
    private int id;
    private int age;
    private String name;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Object obj) {

		Emplyoee emp=(Emplyoee)obj;
		/*if(emp.getId()==this.id)
		return 0;
		else if(emp.getId()<this.id)
			return 1;
		else
			return -1;*/
		
		
	/*	if(emp.getAge()==this.age)
		return 0;
		else if(emp.getAge()<this.age)
			return 1;
		else
			return -1;*/
		
	return emp.getName().compareTo(this.name);
		
	}
	
	@Override
	public String toString() {
		return "Emplyoee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	
}
