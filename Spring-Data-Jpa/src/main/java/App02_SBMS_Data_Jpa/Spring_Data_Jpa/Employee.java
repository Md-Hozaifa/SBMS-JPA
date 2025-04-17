package App02_SBMS_Data_Jpa.Spring_Data_Jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "emp")
public class Employee {
    @Id
     @Column(name="eno")
    Integer eno;
    @Column(name="ename")
    String ename;
    @Column(name="esal")
    String esal;

    @Column(name="eaddr")
    String eaddr;

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", esal='" + esal + '\'' +
                ", eaddr='" + eaddr + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(Integer eno, String ename, String esal, String eaddr) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsal() {
        return esal;
    }

    public void setEsal(String esal) {
        this.esal = esal;
    }

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }
}
