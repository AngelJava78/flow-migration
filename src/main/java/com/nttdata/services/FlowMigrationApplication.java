package com.nttdata.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlowMigrationApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(FlowMigrationApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Hola mundo");

    String name = "";
    int age = 0;

    if (args.length > 0) {
      System.out.println("Argumentos recibidos:");
      for (String arg : args) {
        System.out.println("\t" + arg);

        if (arg.startsWith("--name=")) {
          name = arg.substring("--name=".length());
        }

        if (arg.startsWith("--age=")) {
          try {
            age = Integer.parseInt(arg.substring("--age=".length()));
          } catch (NumberFormatException e) {
            System.out.println("El valor de edad no es un número válido.");
          }
        }
      }

      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
    } else {
      System.out.println("No se recibieron argumentos.");
    }
  }

}
