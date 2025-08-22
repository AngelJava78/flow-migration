package com.nttdata.services;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nttdata.services.client.AccountApiClient;
import com.nttdata.services.client.OrganizationApiClient;
import com.nttdata.services.dto.FlowDto;
import com.nttdata.services.model.AccountResponse;
import com.nttdata.services.model.OrganizationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;

@SpringBootApplication
@EnableFeignClients

public class FlowMigrationApplication implements CommandLineRunner {


    @Autowired
    private AccountApiClient accountApiClient;

    @Autowired
    private OrganizationApiClient organizationApiClient;

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
                System.out.println("Llamada a Account Api");
                AccountResponse response = accountApiClient.getAccount(apiKey);
                System.out.println("ID: " + response.getId());
                System.out.println("Nombre: " + response.getFirstName());
                System.out.println("Apellido: " + response.getLastName());
                System.out.println("Email: " + response.getEmailAddress());

                List<OrganizationResponse> organizations = organizationApiClient.getOrganizations(apiKey, false);

                for (OrganizationResponse org : organizations) {
                    System.out.println("ID: " + org.getId());
                    System.out.println("Nombre: " + org.getName());
                    System.out.println("Código público: " + org.getPublicCode());
                    System.out.println("Creado por: " + org.getCreatedBy());
                    System.out.println("Fecha de creación: " + org.getCreatedDate());
                    System.out.println("-----");
                }

                System.out.println("Lectura del archivo");
                ObjectMapper mapper = new ObjectMapper();

                mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

                // Ruta relativa al archivo JSON

                ClassPathResource resource = new ClassPathResource("flows/Flujo Angel.json");
                InputStream inputStream = resource.getInputStream();
                FlowDto flow = mapper.readValue(inputStream, FlowDto.class);

                // Ejemplo de uso
                System.out.println("Nombre del flujo: " + flow.getName());
                System.out.println("Código: " + flow.getCode());
                System.out.println("Cantidad de Sources: " + flow.getSources().size());
                System.out.println("Cantidad de Targets: " + flow.getTargets().size());

            } catch (Exception e) {
                System.out.println("Error al llamar al API: " + e.getMessage());
            }


        } else {
            System.out.println("No se recibieron argumentos.");
        }
    }

}
