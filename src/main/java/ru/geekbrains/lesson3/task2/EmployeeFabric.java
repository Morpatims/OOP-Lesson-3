package ru.geekbrains.lesson3.task2;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary = random.nextInt(60000, 120001);
        double hourlyRate = 100 + random.nextDouble() * 200;
        int randomAge = random.nextInt(20, 60);

        int randomType = random.nextInt(2);

        if (randomType == 0) {
            return new Worker(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary,
                    randomAge);
        } else {
            return new Freelancer(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    hourlyRate,
                    randomAge);
        }
    }

    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }
}
