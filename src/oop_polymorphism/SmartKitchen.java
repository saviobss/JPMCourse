package oop_polymorphism;

import java.sql.Ref;

public class SmartKitchen {

    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public void addWater() {
        this.brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk(){
        this.iceBox.orderFood();
    }

    public void loadDishWasher() {
        this.dishWasher.doDishes();
    }

    public void setKitchenState(boolean coffeeMakerState, boolean dishWasherState ,boolean refrigeratorState) {
        this.brewMaster.setHasWorkToDo(coffeeMakerState);
        this.dishWasher.setHasWorkToDo(dishWasherState);
        this.iceBox.setHasWorkToDo(refrigeratorState);

    }

    public void doKitchenWork() {
            brewMaster.brewCoffee();
            dishWasher.doDishes();
            iceBox.orderFood();
    }

    public class Appliance {
        private boolean hasWorkToDo;

        public void setHasWorkToDo(boolean work) {
            this.hasWorkToDo = work;
        }

        public boolean getHasWorkToDo() {
            return this.hasWorkToDo;
        }

    }

    public class Refrigerator extends Appliance {
        private void orderFood (){
            if(this.getHasWorkToDo()) {
                System.out.println("Ordering food!");
                this.setHasWorkToDo(false);
            }
        }
    }

    public class DishWasher extends Appliance{
        private void doDishes() {
            if(this.getHasWorkToDo()) {
                System.out.println("Doing dishes");
                this.setHasWorkToDo(false);
            }
        }
    }

    public class CoffeMaker extends Appliance {
        private void brewCoffee() {
            if(this.getHasWorkToDo()){
                System.out.println("Brewing coffee!");
                this.setHasWorkToDo(false);
            }
        }
    }


}
