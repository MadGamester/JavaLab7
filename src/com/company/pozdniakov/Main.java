package com.company.pozdniakov;

public class Main {

    public static void main(String[] args) {

        Student students[] = new Student[5];
        students[0] = new Student("Nikola", "Tesla", "KB-71");
        students[1] = new Student("Barak", "Obama", "KB-71");
        students[2] = new Student("Jenya", "Melkovsky", "KB-71");
        students[3] = new Student( "Philip", "Morris", "KB-71");
        students[4] = new Student("Albert", "Einstein", "KB-71");

        System.out.println("Best student >>>>>>>>>>" + Utils.getTheBestStudent(students));
        System.out.println("Best subject >>>>>>>>>>" + Utils.getTheBestSubject(students));

        for(int i=0;i < students.length;i++){
            System.out.println("Student " + students[i].getId() + " Mark: " + students[i].avgMark());
            if(students[i].avgMark() == 5f)
                System.out.println("Student has a scholarship and he is a cool guy :)");
            else if(students[i].avgMark() >= 4f)
                System.out.println("Student has a scholarship");
            else
                System.out.println("Student does not have a scholarship");

        }

        for(int i = 0 ; i< students.length;i++){
            System.out.println(students[i].getName() + ' ' + students[i].getSurname() + ':');
            students[i].passedSub();
        }
    }
}


