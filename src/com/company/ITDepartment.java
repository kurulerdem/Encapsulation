package com.company;


/*
Senaryomuzda örnek olarak ITdeparmanımız olsun. ve içerisinde server methodu ve database ismi bulunuyor.

Bu bölüme Satış veya Muhasebe bölümünden birisinin gelip ilgilenmesini istemezsiniz değil mi?

O yüzden buradaki bilgilerimizi private olarak saklayacağız.
 */
public class ITDepartment {


    private void server() {
        System.out.println("Server access");
    }
    private String dbname="users";

    public static void main(String[] args) {
        // Ana dizin
        ITDepartment engineer1 = new ITDepartment();
        engineer1.server();
        System.out.println(engineer1.dbname);

    }
}


