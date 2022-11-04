public class Main {
    public static void main(String[] args) {
        // Task 6
        var weightOfTheFirstBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeightOfBoxers = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeightOfBoxers + " кг");
        var boxerWeightDifference = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
        System.out.println("Разница боксеров в весе " + boxerWeightDifference + " кг");

        // Task 7
        // через вычитание
        boxerWeightDifference = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
        System.out.println("Разница боксеров в весе " + boxerWeightDifference + " кг");
        // через остаток от деления
        boxerWeightDifference = weightOfTheSecondBoxer % weightOfTheFirstBoxer;
        System.out.println("Разница боксеров в весе " + boxerWeightDifference + " кг");

        // Task 8
        var hoursOfWorkTotal = 640;
        var hoursPerEmployee = 8;
        var employees = hoursOfWorkTotal / hoursPerEmployee;
        System.out.println("Всего работников в компании – " + employees + " человек");

        employees += 94;
        hoursPerEmployee = hoursOfWorkTotal / employees;
        System.out.println("Если в компании работает " + employees + " человек, то всего "
                + hoursPerEmployee + " часов работы может быть поделено между сотрудниками");

    }
}