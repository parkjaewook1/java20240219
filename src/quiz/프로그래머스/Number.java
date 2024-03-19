package quiz.프로그래머스;

import java.util.Objects;

public class Number {
    private int Num;

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public Number(int num) {
        Num = num;


    }

    @Override
    public String toString() {
        return "Number{" +
                "Num=" + Num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return Num == number.Num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Num);
    }
}
