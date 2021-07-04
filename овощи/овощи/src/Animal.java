public class Animal {

    private String type;
    private String name;
    private double weight;
    private int age;
    private String area;
    private boolean walk;
    private boolean fly;
    private boolean swim;

    {
        name = "no name";
        type = "no type";
        area = "unknown";
    }

    public Animal(){}

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, String name, double weight, int age, String area, boolean walk, boolean fly, boolean swim) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.area = area;
        this.walk = walk;
        this.fly = fly;
        this.swim = swim;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", area='" + area + '\'' +
                ", walk=" + walk +
                ", fly=" + fly +
                ", swim=" + swim +
                '}';
    }

    public void voice(){
        System.out.println("i am " + type);
        System.out.println("Gau Gau\n");
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }
}
