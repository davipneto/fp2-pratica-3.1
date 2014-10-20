
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davip_000
 */
public class Pratica31 {
    public static void main(String args[])
    {
        Date inicio = new Date();
        String meuNome = "Davi Pereira Neto";
        System.out.println("Nome: " + meuNome.toUpperCase());
        System.out.println("Nome Abreviado: " + meuNome.substring(13,17) + ", " + meuNome.substring(0,1) + ". " + meuNome.substring(5,6) + ".");
        GregorianCalendar dataNascimento = new GregorianCalendar(1996,Calendar.AUGUST,20);
        GregorianCalendar hoje = new GregorianCalendar();
        System.out.println("Dias decorridos da sua data de Nascimento ate hoje: " + (hoje.getTime().getTime()-dataNascimento.getTime().getTime())/(1000*60*60*24));
        Date fim = new Date();
        System.out.println("Tempo de processamento: " + (fim.getTime()-inicio.getTime()));
    }
}
