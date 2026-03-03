package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private Integer id;
    private String nome;
    private String email;
    private Date birthDDate;
    private Double baseSalary;

    private Department department;

    public Seller() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDDate() {
        return birthDDate;
    }

    public void setBirthDDate(Date birthDDate) {
        this.birthDDate = birthDDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Seller(Integer id, String nome, String email, Date birthDDate, Double baseSalary, Department department) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.birthDDate = birthDDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", birthDDate=" + birthDDate +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }
}
