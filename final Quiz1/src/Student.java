
import java.io.Serializable;
public class Student implements Serializable{
private static final long serialVersionUID = 1L;
private int id;
private String name;
private double Cgpa;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getCgpa() {
	return Cgpa;
}
public void setCgpa(double d) {
	Cgpa = d;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Cgpa=" + Cgpa + "]";
}

}
