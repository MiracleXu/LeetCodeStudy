package src.com.xuting.java8.vo;

/**
 * @author Miracle Xu
 * @Description:
 * @create: 2019/7/23 17:55
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Apple {

    public Apple(int id, int weight){
        this.id = id;
        this.weight = weight;
    }

    public Apple(int id, int weight,String color){
        this.id = id;
        this.weight = weight;
        this.color = color;
    }

    private int id;
    private int weight;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
