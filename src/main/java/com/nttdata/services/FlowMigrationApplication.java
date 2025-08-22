package com.nttdata.services;

import com.nttdata.services.client.AccountApiClient;
import com.nttdata.services.model.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class FlowMigrationApplication implements CommandLineRunner {


  @Autowired
  private AccountApiClient accountApiClient;

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


      String apiKey = "9d4ec223-0d61-41ad-809d-049f9380cc55";

      try {
        AccountResponse response = accountApiClient.getAccount(apiKey);
        System.out.println("ID: " + response.getId());
        System.out.println("Nombre: " + response.getFirstName());
        System.out.println("Apellido: " + response.getLastName());
        System.out.println("Email: " + response.getEmailAddress());
      } catch (Exception e) {
        System.out.println("Error al llamar al API: " + e.getMessage());
      }


    } else {
      System.out.println("No se recibieron argumentos.");
    }
  }

}
