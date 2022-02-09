package com.ipiecoles.java.java350.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EmployeTest {

//Date d'embauche dans le futur dans un an => 0
    @Test
    public void testNbAnneesAncienneteDateEmbaucheFuture(){
        //Given
        LocalDate dateEmbauche = LocalDate.now().plusYears(1);
        Employe e = new Employe("Doe", "John", "T12345", dateEmbauche, 2000d, 1, 1.0);
        //When
        Integer anciennete = e.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(anciennete).isEqualTo(0);
    }

    //Date d'embauche dans le passé il y a deux ans => 2
    @Test
    public void testNbAnneesAncienneteDateEmbauchePasse(){
        //Given
        LocalDate dateEmbauche = LocalDate.now().minusYears(2);
        Employe e = new Employe("Doe", "John", "T12345", dateEmbauche, 2000d, 1, 1.0);
        //When
        Integer anciennete = e.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(anciennete).isEqualTo(2);
    }

    //Date d'embauche en année en cours => 0
    @Test
    public void testNbAnneesAncienneteDateEmbaucheMaintenant(){
        //Given
        LocalDate dateEmbauche = LocalDate.now();
        Employe e = new Employe("Doe", "John", "T12345", dateEmbauche, 2000d, 1, 1.0);
        //When
        Integer anciennete = e.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(anciennete).isEqualTo(0);
    }

    //Date d'embauche null => 0
    @Test
    public void testNbAnneesAncienneteDateEmbaucheNull(){
        //Given
        LocalDate dateEmbauche = null;
        Employe e = new Employe("Doe", "John", "T12345", dateEmbauche, 2000d, 1, 1.0);
        //When
        Integer anciennete = e.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(anciennete).isEqualTo(0);
    }


}

