import java.util.ArrayList;
import java.util.Objects;

public class Grades
{
    public Grades() {
    }
    protected ArrayList<String[]> grades = new ArrayList<>();
    public void addSubject (String subject/*, String grade*/)
    {
        String[] grad = new String[2];
        grad[0]=subject;
        grad[1]=" -";
        grades.add(grad);
    }
    public void dropSubject (String subject)
    {
        for (int i = 0; i < grades.size(); i++) {
            if(Objects.equals(grades.get(i)[0], subject))
            {
                grades.remove(i);
            }
        }
    }

    public String getGrades(){
        String result = "";

        if(grades.size() != 0){
            for(int i = 0; i < grades.size(); i++){

                if(grades.get(i)[1]== " -"){
                    result += grades.get(i)[0]+ "" +grades.get(i)[1];
                    if(i != grades.size() - 1) result += "\r\n";
                }
                else {
                    result += grades.get(i)[0]+ " " +grades.get(i)[1];
                    if(i != grades.size() - 1) result += "\r\n";
                }

            }


        }

        return result;

    }

}