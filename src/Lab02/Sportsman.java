package Lab02;

public class Sportsman {

    private String type;
    private String name;
    private Integer age;
    private Integer height;
    private Integer weight;
    private String award;
    private String country;

    public Sportsman() {
    }

    public Sportsman(String type, String name, Integer age, Integer height, Integer weight, String award, String country) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.award = award;
        this.country = country;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "type:' " + type + '\''+
                ", name:' " + name + '\''+
                ", age: " + age +
                ", height: " + height +
                ", weight: " + weight +
                ", award:' " + award + '\''+
                ", country:' " + country + '\''+
                '}';
    }
}
