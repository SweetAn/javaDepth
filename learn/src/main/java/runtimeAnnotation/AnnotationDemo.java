package runtimeAnnotation;

import java.lang.reflect.Field;

public class AnnotationDemo {
    @People(name = "MK",age = 99)
    private static String people;
    public static void main(String args[]){
        try {
            Class classz = AnnotationDemo.class.getClassLoader().loadClass("runtimeAnnotation.AnnotationDemo");
            Field[] declaredFields = classz.getDeclaredFields();
            for (Field file: declaredFields) {
                //获取带有People注解的对象声明
                People annotation = file.getAnnotation(People.class);
                //生成一个对象
                people=new String("姓名:"+annotation.name()+" 年龄："+annotation.age());
                System.out.println(people);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        String  s="ssss";
        String ddd="1";

    }
}
