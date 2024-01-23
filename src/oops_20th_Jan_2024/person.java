package src.oops_20th_Jan_2024;

public class person {
    private String name;

    public person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Integer age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
