package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String massage;

    public Error() {

    }

    public Error(boolean active, int status, String massage) {
        this.active = active;
        this.status = status;
        this.massage = massage;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error322 = new Error(true, 123, "Ошибка 322.");
        error322.printInfo();
        Error error300 = new Error(false, 12, "Ошибка 300");
        error300.printInfo();
        Error error200 = new Error(false, 199, "Ошибка 560");
        error200.printInfo();
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Название ошибки: " + massage);
    }
}
