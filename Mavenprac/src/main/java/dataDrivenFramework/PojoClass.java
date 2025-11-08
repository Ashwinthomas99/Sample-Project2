package dataDrivenFramework;

public class PojoClass {

	 // 1️⃣ Private variables
    private String name;
    private int age;
    private String course;

    // 2️⃣ Default Constructor
    public PojoClass() {
    }

    // 3️⃣ Parameterized Constructor
    public PojoClass(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // 4️⃣ Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // 5️⃣ Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public static void main(String[] args) {
    	PojoClass ob=new PojoClass();
    	ob.setName("Alan");
    	ob.setAge(28);
    	ob.setCourse("Selenium");
    	System.out.println(ob.getName());
    	System.out.println(ob.getAge());
    	System.out.println(ob.getCourse());
	}
    
    
    
    
    
    
    
}


