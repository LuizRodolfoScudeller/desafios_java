/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj;

import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author LUIZRODOLFOSCUDELLER
 */
public class NewMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos = idadeDias / 365;
        idadeDias -= anos * 365;
        int mes = idadeDias / 30;
        idadeDias -= mes * 30;
        int dias = idadeDias;
        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
    
}
    
    

