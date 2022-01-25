package com.lana.spring.model;


import com.lana.spring.validation.CheckEmail;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    private String surname;
    @Max(value = 1000, message = "salary must be less than 1001")
    @Min(value = 500, message = "salary must be greated than 500")
    private int salary;
    private String department;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please, use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail()
    private String email;


    public Employee() {
        carBrands = Map.of("BMV", "BMW", "Audi", "Audi", "Hyunday", "Hyunday");
        languageList = Map.of("English", "EN", "Deutch", "DE", "French", "FR");

    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", salary=" + salary
                + ", department='" + department + '\''
                + '}';
    }
}
