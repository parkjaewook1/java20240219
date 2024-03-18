package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // list는 interface라 인스턴스 생성 불가 -> ArrayList 로 생성
        List<Board> list = new ArrayList<>();

        // 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() +
                "\t" + board.getWriter());

        System.out.println();


        // 모든 객체 탐색 (고전적 for)
        System.out.println("고전적 for");
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());

        }
        System.out.println();

        // 삭제
        list.remove(2);
        list.remove(2);

        Board board1 = list.get(2);
        System.out.println("board1 = " + board1);

        // 전체 탐색(향상된 for)
        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());
        }

        // 전체 탐색 (lambda)
        list.forEach(System.out::println);
    }
}
