package org.cai.problems.base;

import org.junit.Test;

/**
 * @Author: caisijun
 * @Date: 2021/1/8 0008
 */
public class 值类型与引用类型 {

    /**
     * result:
     * upddateValue before:18
     * upddateValue2 after:36
     * init=18
     * ================
     * 19--hashcode:19
     * 结论 Integer 传递的是地址，但是Integer是final的，所以此成员字段只能被赋值一次，后续的修改会被指向新的地址。
     */
    @Test
    public void TestOne(){
        //1.新建一个变量并给默认值
        Integer age=18;
        //2.将地址发送到另外一个方法，其实也新增了一个地址（就是向内存申请了一块地址）
        updateValue(age);
        System.out.println("init="+age);
        System.out.println("================");
        //3.在当前方法内部，修改此值，也相当于新增了一个地址
        age++;
        System.out.println(age+"--hashcode:"+age.hashCode());
        //4.一句话 final的值 只能赋值一次，其他新增一个内存地址 装着
    }
    void updateValue(Integer val){
        System.out.println("upddateValue before:"+val);
        val=val*2;
        System.out.println("upddateValue2 after:"+val);
    }

    /**
     * result:
     * 0
     * 结论：传递基本数据类型，就是传递的是值得副本，所以修改副本，原始值是不会被修改的。
     */
    @Test
    public void TestTwo(){
        int i=0;
        upVal2(i);
        System.out.println(i);
    }
    void upVal2(int i){
        i++;
    }

    /**
     * result:
     * before:SubClass{age=10}
     * after:SubClass{age=18}
     * 结论：自定义类 class SubClass 是引用类型，所以传递的时候，是将地址传给其他方法，
     * 但是，此类中的字段，age是Integer类型的，所以在初始化的时候 设置的age=10,后续修改
     * 值，也会引发地址变更（就是age这个地址，用于是最后一次修改后的地址指向）
     */
    @Test
    public void TestThree(){
        SubClass subClass=new SubClass();
        subClass.setAge(10);
        System.out.println("before:"+subClass);
        upVal3(subClass);
        System.out.println("after:"+subClass);
    }
    void upVal3(SubClass subClass){
        subClass.setAge(18);
    }

    class SubClass
    {
        private Integer age;

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "SubClass{" +
                    "age=" + age +
                    '}';
        }
    }

}
