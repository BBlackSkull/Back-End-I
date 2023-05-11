public class CompruebaMail {
    public void procesarMail(Mail email) {
        ControlMail gerencia = new ControlGerencia();
        ControlMail comercial = new ControlComercial();

        ControlMail tecnica = new ControlTecnica();
        gerencia.setSigControl(comercial);
        comercial.setSigControl(tecnica);
        gerencia.controla(email);
    }
}
