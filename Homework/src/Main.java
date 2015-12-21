/**
 * Created by 蔡秉辰 D0280208 on 2015/12/21.
 */
public class Main{
    public static void main(String[] argv){
        Quesation q1 = new Quesation("xxx");
        Quesation q2 = new Quesation("yyy");
        QuesationAdd qa = new QuesationAdd();
        qa.AddQuestion(q1);
        qa.AddQuestion(q2);
    }
}
class Quesation{
    String discription;
    public Quesation(String desc){
        discription = desc;
    }
    public void print(){
        System.out.println(discription);
    }
}
class QuesationAdd extends Quesation{
    Arraylist<Quesation> list;
    public QuesationAdd(){
        list = new ArrayList<Quesation>();
    }
    public void AddQuestion(Quesation q){
        list.add(q);
    }
    public void op(){
        ListerIterator<Quesation> iterator = list.listIterator();
        while (iterator.hasNext()){
            Quesation q = iterator.next();
            q.print();
        }
    }
}
