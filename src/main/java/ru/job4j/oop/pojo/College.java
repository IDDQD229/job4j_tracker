package ru.job4j.oop.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Соболев Максим Николаевич");
        student.setGroup("311 А");
        student.setDateOfAdmission("22 августа 2011 года");
        System.out.println("ФИО студента: " + student.getFullName() + System.lineSeparator() +
                "Номер группы: " + student.getGroup() + System.lineSeparator() +
                "Дата поступления: " + student.getDateOfAdmission());
    }
}
