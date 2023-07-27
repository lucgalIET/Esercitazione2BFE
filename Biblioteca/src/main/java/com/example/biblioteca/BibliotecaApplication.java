package com.example.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
fare tutte le crud con i dto
1 libro deve avere almeno 1 autore e
implementare tutto nel service e non nel controller(solo endpoint)
 */

@SpringBootApplication
public class BibliotecaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliotecaApplication.class, args);
    }

}
