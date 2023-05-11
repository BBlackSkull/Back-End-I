public class ControlComercial extends ControlMail{
    @Override
    public void controla(Mail mail) {
        if(mail.getDestirino().equalsIgnoreCase("comercial@colmena.com")  ||
                mail.getTema().equalsIgnoreCase("comercial") ){
            System.out.println("Enviado a departamento comercial");
        } else {
            if(getSigControl()!=null){
                getSigControl().controla(mail);
            }else{
                System.out.println("Sale Por SPAM");
            }

        }
    }
}
