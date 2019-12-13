package sample;
import java.io.Serializable;
import java.util.ArrayList;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

class Food implements Serializable {

        public String name;
        public int calories;
        public double totalFat;
        public int sodium;
        public int carbs;

        //static private ArrayList<Fruits> fruits;

        public String servingSize;


        //Constructor

        public Food(String name, String servingSize, int calories, double fat, int sodium, int carbs){

            this.name = name;
            this.servingSize = servingSize;
            this.calories = calories;
            this.totalFat = fat;
            this.sodium = sodium;
            this.carbs = carbs;

        }


        //static

        //Getters and setters


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        public double getTotalFat() {
            return totalFat;
        }

        public void setTotalFat(double totalFat) {
            this.totalFat = totalFat;
        }

        public int getSodium() {
            return sodium;
        }

        public void setSodium(int sodium) {
            this.sodium = sodium;
        }

        public int getCarbs() {
            return carbs;
        }

        public void setCarbs(int carbs) {
            this.carbs = carbs;
        }

        public String getServingSize() {
            return servingSize;
        }

        public void setServingSize(String servingSize) {
            this.servingSize = servingSize;
        }




    }


