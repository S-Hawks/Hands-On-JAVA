package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "EMPLOYEE_DATA")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "employee_name", length = 100)
    private String name;

    private int age;

    private int getAge() {
        return age;
    }
    @Column(unique = true,length = 10,updatable = false, nullable = false)
    private int ssn;

    @Temporal(TemporalType.TIME)
    private Date dob;

    @Enumerated(EnumType.STRING)
    private EmployeeType type;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.REMOVE)
    private List<PayStub> payStubs = new ArrayList<>();    //Doing this for reverse cyclical relationship

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "EMAIL_GROUP_SUBSCRIPTIONS", //This will provide the table name EMAIL_GROUP_SUBSCRIPTIONS
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), //This will provide in that table 1st Column name EMPLOYEE_ID
    inverseJoinColumns = @JoinColumn(name ="SUBSCRIPTION_EMAIL_ID") //This will provide in that table 1st Column name SUBSCRIPTION_EMAIL_ID
    )
    private List<EmailGroup> emailGroups = new ArrayList<>();
    @Transient
    private String debugString;        //This can be use for purely jpa reason.
    //or private transient debugString ;+


    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public List<PayStub> getPayStubs() {
        return payStubs;
    }

    public void setPayStubs(List<PayStub> payStubs) {
        this.payStubs = payStubs;
    }

    public List<EmailGroup> getEmailGroups() {
        return emailGroups;
    }

    public void setEmailGroups(List<EmailGroup> emailGroups) {
        this.emailGroups = emailGroups;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                ", dob=" + dob +
                ", type=" + type +
                ", payStubs=" + payStubs +
                '}';
    }

    // Method is being added for reverse cyclical Relationship or we can say vise-versa save
    //For Take the responsibility of saving data because jpa can save data as it's want.
    //Suppose we make set it line 10 jpa can make persist at like 100
    public void addPayStub(PayStub payStub){
        this.payStubs.add(payStub);
    }
    //TODO: For same reason
    public void addEmailGroup(EmailGroup emailGroup){
        this.emailGroups.add(emailGroup);
    }

    //TODO: OneToOne - Default fetch type Eager
    //TODO: OneToMany/ManyToOne - Default fetch type lazy
    //TODO: ManyToMany - Default fetch type lazy
}
