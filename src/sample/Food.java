package sample;
import java.io.Serializable;
import java.util.ArrayList;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

class Food implements Serializable {

        transient private final SimpleStringProperty name = new SimpleStringProperty();
        transient private final SimpleIntegerProperty calories = new SimpleIntegerProperty();
        transient private final SimpleDoubleProperty totalFat = new SimpleDoubleProperty();
        transient private final SimpleIntegerProperty sodium = new SimpleIntegerProperty();
        transient private final SimpleIntegerProperty carbs = new SimpleIntegerProperty();

        //static private ArrayList<Fruits> fruits;

        transient private final SimpleStringProperty servingSize = new SimpleStringProperty();


        //Constructor

        public Food(String name, String servingSize, int calories, double fat, int sodium, int carbs){

            setName(name);
            setServingSize(servingSize);
            setCalories(calories);
            setTotalFat(fat);
            setSodium(sodium);
            setCarbs(carbs);

        }


    public String getName() {
        return name.get();
    }

    public void setName(String name) {this.name.set(name);
    }

    public int getCalories() {
        return calories.get();
    }

    public void setCalories(int calories) {
        this.calories.set(calories);
    }

    public double getTotalFat() {
        return totalFat.get();
    }

    public void setTotalFat(double totalFat) {
        this.totalFat.set(totalFat);
    }

    public int getSodium() {
        return sodium.get();
    }

    public void setSodium(int sodium) {
        this.sodium.set(sodium);
    }

    public int getCarbs() {
        return carbs.get();
    }

    public void setCarbs(int carbs) {
        this.carbs.set(carbs);
    }

    public String getServingSize() {
        return servingSize.get();
    }

    public void setServingSize(String servingSize) {
        this.servingSize.set(servingSize);
    }



    }


