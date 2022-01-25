package Queue;
import java.util.Scanner;
/**
 *
 * @author dwipu
 */
public class Queue {
    int id, tahun;
    String judul;
    Queue next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input() {
        System.out.print("ID Buku : ");
        id=in.nextInt();
        System.out.print("Judul Buku : ");
        judul=str.nextLine();
        System.out.print("Tahun Terbit : ");
        tahun=in.nextInt();
        next=null;
    }
    public void view() {
        System.out.println("ID Buku : "+id);
        System.out.println("Judul Buku : "+judul);
        System.out.println("Tahun Terbit : "+tahun);
}
    public static void main(String[] args) {
        int menu=0;
        linked st=new linked();
        while(menu!=4){
            System.out.print("1. Push\n2. Pop\n3.View\n4.Exit\n : ");
            menu=in.nextInt();
            if(menu==1){
                Queue baru=new Queue();
                baru.input();
                st.push(baru);
        }
        
    
        
        else if(menu==2) st.pop();
        else if(menu==3) st.view();
        else if(menu==4) System.out.println("Keluar...");
        else System.out.println("Salah...");
        System.out.println(" ");
    }
}
}
class linked {
        Queue top;
        public linked(){
            top=null;
        }
        public void push(Queue a) {
            if(top==null) top=a;
            else{
                a.next=top;
                top=a;
            }
        }
            public void pop() {
                if(top==null) System.out.println("Kosong");
                else {
                    System.out.println("Popping Data...");
                    top.view();
                    top=top.next;
                }
            }
            public void view() {
                if(top==null) System.out.println("Kosong");
                else {
                    Queue ptr=top;
                    while(ptr!=null) {
                        System.out.println("- - - -");
                        ptr.view();
                        ptr=ptr.next;
                    }
                }
            }
            }

        
         






