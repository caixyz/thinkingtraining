package org.cai.patterns.Builder.build;

import org.cai.patterns.Builder.beans.MeatBurger;
import org.cai.patterns.Builder.beans.SoybeanMilk;
import org.cai.patterns.Builder.beans.VegBurger;

/**
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class MealBuilde {
    public MealDisk prepareVegMeal() {
        MealDisk mealDisk = new MealDisk();
        mealDisk.AddFood(new VegBurger());
        mealDisk.AddFood(new MeatBurger());
        mealDisk.AddFood(new SoybeanMilk());
        return mealDisk;
    }
}
