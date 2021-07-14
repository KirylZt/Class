public class Error extends Exception{
    private int value;

    public Error(int value) {
        this.value = value;
    }

    @Override
    public String getMessage() {
        return "При старте автомобиля произошла ошибка.";
    }
}
