
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
    
    private static Date inicio;
    private static String meuNome;
    private static GregorianCalendar dataNascimento;
    private static GregorianCalendar hoje;
    private static Date fim;
   
    public static void main(String args[])
    {
        inicio = new Date();
        meuNome = "Davi Pereira Neto";
        System.out.println("Nome: " + meuNome.toUpperCase());
        System.out.println("Nome Abreviado: " + meuNome.substring(13,14).toUpperCase() + meuNome.substring(14,17).toLowerCase() + ", " + meuNome.substring(0,1).toUpperCase() + ". " + meuNome.substring(5,6).toUpperCase() + ".");
        dataNascimento = new GregorianCalendar(1996,Calendar.AUGUST,20);
        hoje = new GregorianCalendar();
        System.out.println("Dias decorridos da sua data de Nascimento ate hoje: " + (hoje.getTime().getTime()-dataNascimento.getTime().getTime())/(1000*60*60*24));
        fim = new Date();
        System.out.println("Tempo de processamento: " + (fim.getTime()-inicio.getTime()));
    }
}
