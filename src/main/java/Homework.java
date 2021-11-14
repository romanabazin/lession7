public class Homework {

    public static void main(String[] args) {
        // 5. создали массив котов с именами и аппетитом
        Cat [] cats = {
                new Cat("Барсик", 20),
                new Cat("Мурзик", 30),
                new Cat("Васька", 10),
                new Cat("Моська", 25),
                new Cat("Серый", 15),
        };

        Bowl bowl = new Bowl();

        bowl.putFood(54);
        // 5. попросили котов поесть
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        bowl.info();




    }

}
