package com.company;
import java.io.IOException;
import java.lang.reflect.Field;


public class Main {




    public static void main(String[] args) throws IOException {

        //LegalEntity legalEntity = new LegalEntity();
        //Individual individual = new Individual();

        //LegalEntity legalEntity1 = new LegalEntity();
        //Individual individual1 = new Individual();

        //LegalEntity legalEntity2 = new LegalEntity();
        //Individual individual2 = new Individual();



        DataLoggerCSV<Integer> dataLoggerCSV = new DataLoggerCSV<Integer>(5);
        DataLoggerCSV<Double> dataLoggerCSV1 = new DataLoggerCSV<Double>(5.0);
        DataLoggerCSV<String> dataLoggerCSV2 = new DataLoggerCSV<String>("Hello World!");




        //legalEntity.name = ("ОАО");
        //individual.name = ("Петров Иван Васильевич");
        //System.out.println("Имя юридического лица " +legalEntity.name);
        //System.out.println("Имя физического лица " +individual.name);
        //System.out.println("-------------");

        //legalEntity1.account = (2562300.25);
        //individual1.account = (35102.12);
        //System.out.println("Счет юридического лица " + legalEntity1.account);
        //System.out.println("Счет физического лица " +individual1.account);
        //System.out.println("-------------");


        //System.out.println("Метод работы юридического лица " +legalEntity.Work());
        //System.out.println("Метод работы физического лица " +individual.Work());
        //System.out.println("-------------");

        //System.out.println("Возраст юридического лица " +legalEntity2.Age());
        //System.out.println("Возраст физического лица " +individual2.Age());
        //System.out.println("-------------");

        dataLoggerCSV.fromCSV();
        dataLoggerCSV.toCSV();

        dataLoggerCSV1.fromCSV();
        dataLoggerCSV1.toCSV();

        dataLoggerCSV2.fromCSV();
        dataLoggerCSV2.toCSV();

        System.out.println(dataLoggerCSV1.getClass().getName());

        for (Field s : dataLoggerCSV1.getClass().getFields()) {

            System.out.println(s.toString());
        }



    }
}









