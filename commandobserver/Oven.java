package designpatterns.commandobserver;

public class Oven {
    private boolean status;
    public Oven() {
    }

    public void ChangeStatus() {
        this.setStatus(!getStatus());
        if(status) {
            System.out.println("Oven turned on");
        }
        else {
            System.out.println("Oven turned off");
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
