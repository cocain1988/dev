package com.company;

/**
 * @author Khvashchevskiy Mikhail
 * @version 0.0.2
 */
public class Manager extends Employee {
    private double bonus;
    /**
     * Наследуемый констурктор от класса Employee
     * @param n Переменная имени сотрудника
     * @param s Переменная зарплаты сотрудника
     */
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }
    /**
     * Метод возврата зараплаты и бонуса.
     * @return Метод возвращает зарплату с бонусом для руководителя.
     */
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    /**
     * Метод установки бонуса руководителю
     * @param aBonus величина самого бонуса.
     */
    public void setBonus(double aBonus){
        this.bonus = aBonus;
    }
}
