public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Bowl bowl) {
        // 4. если в тарелке меньше чем аппетит, то кот не ест
        if(appetite<=bowl.food) {
            bowl.decreaseFood(appetite);
        // 3. обозначаем сытость
            System.out.printf("%s сыт\n", name);
        // 2. условие не позволит принять отрицательное число в тарелке, так как аппетит имеет положительное значение
        }else System.out.printf("Слишком мало корма для %s\n", name);
    }
}
