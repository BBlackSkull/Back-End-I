public class ControlGerencia extends ControlMail {
    @Override
    public void controla(Mail mail) {
    if(mail.getDestirino().equalsIgnoreCase("gerencia@colmena.com")  ||
    mail.getTema().equalsIgnoreCase("gerencia") ){
        System.out.println("Enviado a gerencia");
    } else {
            if(getSigControl()!=null){
                getSigControl().controla(mail);
            }else{
                System.out.println("Sale Por SPAM");
            }

        }
    }
}
