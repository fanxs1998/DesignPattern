package builder;

/*
 * A套餐
 */
public class MealA extends MealBuilder{  

    public void buildDrink() {  
        meal.setDrink("一杯可乐");  
    }  

    public void buildFood() {  
        meal.setFood("一盒薯条");  
    }  

}