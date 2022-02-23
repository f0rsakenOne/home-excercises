package io.codelex.typesandvariables.exercises;

public class Exercise5 {
    public static void main(String[] args){
        String[] courses = new String[]{
                "English",
                "Precalculus",
                "Music Theory",
                "Biotechnology",
                "Principles of Technology I",
                "Latin II","AP LV History",
                "Business Computer Infomation Systems"
        };
        String[] teachers = new String[]{
                "Ms. Lapan",
                "Mrs. Gideon",
                "Mr. Davis",
                "Ms. Palmer",
                "Ms. Garcia",
                "Mrs. Barnett",
                "Ms. Johannessen",
                "Mr. James"
        };
        System.out.println("+------------------------------------------------------------+");
        for(int i = 1; i<=8;i++){
        System.out.printf("| %s | %36s| %17s| %n",i,courses[i-1],teachers[i-1]);
        }
        System.out.println("+------------------------------------------------------------+");
    }
}
