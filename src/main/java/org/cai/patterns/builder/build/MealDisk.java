package org.cai.patterns.builder.build;

import org.cai.patterns.builder.service.FoodItems;

import java.util.ArrayList;
import java.util.List;

/**
 * 餐盘（放入食品，显示单价及总额）
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class MealDisk {
    List<FoodItems> foodItems = new ArrayList<>();

    public void AddFood(FoodItems items) {
        foodItems.add(items);
    }

    public float getTotalPrice() {
        return (float) foodItems.stream().mapToDouble((p) -> p.price()).summaryStatistics().getSum();
    }

    public void showImtes() {
        foodItems.stream().forEach(f -> {
            System.out.print("Item：" + f.name());
            System.out.print(",Packing：" + f.packing().pack());
            System.out.println(",price：" + f.price());
        });
    }
}
