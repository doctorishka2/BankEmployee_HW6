public class Employee6 {

    public Employee6 (String name, int id, String dateOfBirth, double salary, String address, String position) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
        this.position = position;

    }
    private String name;
    private int id;
    private String dateOfBirth;
    private double salary;
    private String address;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
