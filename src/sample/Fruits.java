package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import java.io.File;
import java.io.Serializable;
import java.util.*;

public class Fruits extends Food implements Serializable {

        static private ObservableList<Fruits> fruits = FXCollections.observableArrayList();

        transient private final SimpleIntegerProperty potassium = new SimpleIntegerProperty();
    transient private final SimpleIntegerProperty fiber = new SimpleIntegerProperty();
    transient private final SimpleIntegerProperty protein = new SimpleIntegerProperty();
    transient private final SimpleIntegerProperty sugar = new SimpleIntegerProperty();
    transient private final SimpleIntegerProperty calcium = new SimpleIntegerProperty();
    transient private final SimpleIntegerProperty iron = new SimpleIntegerProperty();

    transient private final SimpleIntegerProperty vitaminA = new SimpleIntegerProperty();
    transient private final SimpleIntegerProperty vitaminC = new SimpleIntegerProperty();

        //public int ranking;

        public Fruits(String name, String servingSize, int calories,  double fat, int sodium, int potassium, int carbs, int fiber, int sugar, int protein, int vitaminA, int vitaminC, int calcium, int iron){

            super(name,servingSize,calories,fat,sodium,carbs);

            setPotassium(potassium);
            setFiber(fiber);
            setProtein(protein);
            setSugar(sugar);
            setCalcium(calcium);
            setIron(iron);

            setVitaminA(vitaminA);
            setVitaminC(vitaminC);

        }

    public static ObservableList<Fruits> getFruitList() {
        return fruits;
    }

        static void addEmptyFruit() {
            fruits.add(new Fruits("", "", 0,0,0,0,0,0,0,0,0,0,0,0));
        }

        static void readFruits(){

            //fruits = new ArrayList<Fruits>();



            // create array list class field where albums will be stored
            //fruits = new ArrayList<Fruits>();

            try {
                // scan data file line-by-line
                File albumDataFile = new File("res/Fruits");
                Scanner scanner = new Scanner(albumDataFile);
                int ranking = 1;
                while (scanner.hasNextLine()){
                    //System.out.println("while loop");

                    String str = scanner.nextLine();
                    Scanner lineScanner = new Scanner(str);
                    lineScanner.useDelimiter("#");
                    // scan data files line by separating text between #

                    // first 4 data values are always present in each line
                    String name = lineScanner.next();
                    String size = lineScanner.next();
                    int calories = lineScanner.nextInt();
                    lineScanner.nextInt();
                    double fat = lineScanner.nextDouble();
                    lineScanner.nextInt();
                    int sodium = lineScanner.nextInt();
                    lineScanner.nextInt();
                    int potassium = lineScanner.nextInt();
                    lineScanner.nextInt();
                    int carbs = lineScanner.nextInt();
                    lineScanner.nextInt();
                    int fiber = lineScanner.nextInt();
                    lineScanner.nextInt();
                    int sugar = lineScanner.nextInt();
                    int protein = lineScanner.nextInt();
                    int vitaminA = lineScanner.nextInt();
                    int vitaminC = lineScanner.nextInt();
                    int calcium = lineScanner.nextInt();
                    int iron = lineScanner.nextInt();

                    Fruits newFruit = new Fruits(name,size,calories,fat,sodium,potassium,carbs,fiber,sugar,protein,vitaminA,vitaminC,calcium,iron);
                    System.out.println(newFruit.getName());
                    fruits.add(newFruit);
                    ranking = ranking + 1;
                }
            } catch (Exception ex) {
                //ex.printStackTrace();
                System.out.println(ex.getCause());
                System.out.println(ex.getLocalizedMessage());
                System.out.println(ex+"\nThere was an error. Oops!");
            }

        }




        public int getPotassium() {
            return potassium.get();
        }

        public void setPotassium(int potassium) {
            this.potassium.set(potassium);
        }

        public int getFiber() {
            return fiber.get();
        }

        public void setFiber(int fiber) {
            this.fiber.set(fiber);
        }

        public int getProtein() {
            return protein.get();
        }

        public void setProtein(int protein) {
            this.protein.set(protein);
        }

        public int getSugar() {
            return sugar.get();
        }

        public void setSugar(int sugar) {
            this.sugar.set(sugar);
        }

        public int getCalcium() {
            return calcium.get();
        }

        public void setCalcium(int calcium) {
            this.calcium.set(calcium);
        }

        public int getIron() {
            return iron.get();
        }

        public void setIron(int iron) {
            this.iron.set(iron);
        }

        public int getVitaminA() {
            return vitaminA.get();
        }

        public void setVitaminA(int vitaminA) {
            this.vitaminA.set(vitaminA);
        }

        public int getVitaminC() {
            return vitaminC.get();
        }

        public void setVitaminC(int vitaminC) {
            this.vitaminC.set(vitaminC);
        }

        public void describe() {
            System.out.println("A serving of " + this.getServingSize() + " " + this.getName() + " has " + this.getCalories() + " calories, " + this.getTotalFat() + " grams fat, and " + this.getCarbs() + " grams of carbs.");
        }



        static ObservableList<Fruits> getFruits(){

            return fruits;

        }

        static void describeFruits() {
            //if (fruits.size() == 0) {
            // read the albums from file
            readFruits();
            //}

            for (int i = 0; i < fruits.size(); i++) {
                fruits.get(i).describe();
            }

            // Example of how to use forEach() instead of for loop
            // albums.forEach((album) -> album.describe());
        }


    }



