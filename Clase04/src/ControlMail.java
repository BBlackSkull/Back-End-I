public abstract class ControlMail {
    private ControlMail sigControl;

    public ControlMail getSigControl() {
    return sigControl;
    }

    public abstract void controla(Mail mail);
    public void setSigControl(ControlMail sigControl) {
        this.sigControl = sigControl;
    }
}
