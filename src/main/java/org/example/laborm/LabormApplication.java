package org.example.laborm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabormApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabormApplication.class, args);
    }

        // Création et sauvegarde du premier produit
        Product produit1 = new Product(1, "fufu", "x", new Date(96, 1, 2));
        productRepository.save(produit1);

        // Création et sauvegarde du deuxième produit
        Product produit2 = new Product(2, "fufu", "x", new Date(96, 1, 13));
        productRepository.save(produit2);

        // Mise à jour du produit avec l'ID 1
        Product updatedProduct = productRepository.findById(1).get();
        System.out.println(updatedProduct);
        productRepository.delete(updatedProduct);

        // Modification du nom du produit et sauvegarde
        produit2.setNom("dudu");
        productRepository.save(produit2);
    }

}
