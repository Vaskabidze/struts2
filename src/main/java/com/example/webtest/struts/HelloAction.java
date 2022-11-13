package com.example.webtest.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Action(value = "/hellotest"/*, results = {@Result(name = "success", location = "/result.jsp"), @Result(name = "error", location = "/badResult.jsp")}*/)
@Results(value = {@Result(name = "success", location = "/result.jsp"), @Result(name = "error", location = "/badResult.jsp")})
//@Result(name = "success", location = "/result.jsp")
public class HelloAction {

    private String firstName;
    private String secondName;
    private Integer age;

    public String execute() {
        System.out.println("Value of firstName is:" + firstName);
        if (firstName.equals("alex")) {
            return "success";
        } else {
            return "error";
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
