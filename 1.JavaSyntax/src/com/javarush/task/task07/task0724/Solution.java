package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и
 заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfatherfist = new Human("DED1",true,85);
        Human grandfathersecond = new Human("DED2",true,86);
        Human grandmotherfist = new Human("BABA1",false,80);
        Human grandmothersecond = new Human("BABA2",false,79);
        Human father = new Human("Papka",true,35,grandfatherfist,grandmotherfist);
        Human mother = new Human("Mamka",false,30,grandfathersecond,grandmothersecond);
        Human child1 = new Human("Dite1",true,16,father,mother);
        Human child2 = new Human("Dite2",false,10,father,mother);
        Human child3 = new Human("Dite3",true,15,father,mother);

        System.out.println(grandfatherfist);
        System.out.println(grandfathersecond);
        System.out.println(grandmotherfist);
        System.out.println(grandmothersecond);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private    boolean sex;
        private int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human (String name,boolean sex,int age,Human father, Human mother){
            this.age=age;
            this.sex=sex;
            this.name=name;
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















