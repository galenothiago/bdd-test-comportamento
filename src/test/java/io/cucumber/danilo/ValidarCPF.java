package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ValidarCPF {
    public WebDriver browser;

    @Dado("que eu esteja na pagina de validação de CPF")
    public void eu_esteja_na_pagina_de_validação_de_CPF() {
        System.setProperty("webdriver.chrome.driver", "/Users/thiago.de.o.galeno/Documents/devops/dbb-cumcuber/driver/chromedriver");

        browser = new ChromeDriver();
        browser.get("http://localhost:8080/");
    }

    @Dado("digito o CPF válido {string}")
    public void digito_o_CPF_válido(String string) {
        WebElement campoNome = browser.findElement(By.name("nome"));
        campoNome.sendKeys("Thiago");

        WebElement campoCpf = browser.findElement(By.name("cpf"));
        campoCpf.sendKeys(string);
    }

    @Quando("eu clico no botão enviar")
    public void eu_clico_no_botao_enviar() {
        WebElement campoCpf = browser.findElement(By.name("cpf"));
        campoCpf.submit();
    }

    @Entao("devo ver uma mensagem de {string}")
    public void devo_ver_uma_mensagem_de(String string) {
        String mensagem = browser.findElement(By.className("alert-success")).getText();
        assertEquals(mensagem , "Foi validado com sucesso");
    }

}