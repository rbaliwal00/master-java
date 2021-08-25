package others;

//Helper class
public class Employee{
    public String name;
    public int age;
    public int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Employee emp = (Employee) obj;

        return this.name == emp.name
                && this.age == emp.age
                && this.salary == emp.salary;
    }
}
