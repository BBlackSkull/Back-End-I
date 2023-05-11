public class ControlTecnica extends ControlMail{
    @Override
    public void controla(Mail mail) {
        if(mail.getDestirino().equalsIgnoreCase("tecnica@colmena.com")  ||
                mail.getTema().equalsIgnoreCase("tecnica") ){
            System.out.println("Enviado a departamento tecnico");
        } else {
            if(getSigControl()!=null){
                getSigControl().controla(mail);
            }else{
                System.out.println("Sale Por SPAM");
            }

        }
    }
}
