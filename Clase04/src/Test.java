public class Test {
    public static void main(String[] args){
        CompruebaMail comprueba = new CompruebaMail();
        Mail m1 = new Mail("tecnica","yo@yo.com","pepe@com.com");
        comprueba.procesarMail(m1);

        Mail m2 = new Mail("sfsdf","yo@yo.com","gerencia@colmena.com");
        comprueba.procesarMail(m2);

        Mail m3 = new Mail("comercial","yo@yo.com","pepe@com.com");
        comprueba.procesarMail(m3);

        Mail m4 = new Mail("werwer","yo@yo.com","pepe@com.com");
        comprueba.procesarMail(m4);
    }
}
