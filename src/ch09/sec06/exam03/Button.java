package ch09.sec06.exam03;

public class Button {

    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickLIstener) {
        this.clickListener = clickLIstener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
