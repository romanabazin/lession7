public class Bowl {
    int food;
    public Bowl() {
    }
    public void decreaseFood(int appetite) {
            food -= appetite;
    }
    // 6. метод добавлять еду в тарелку
    public void putFood(int amount){
        food += amount;
    }
    public void info() {
        System.out.println("Осталось корма " + food);
    }
}
