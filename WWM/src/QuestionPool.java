public class QuestionPool {

     public ArrayList<Question> questions;
     public HashMap<Integer, ArrayList<Question>> questionPool;
    
     public QuestionPool() {
         
          questions = new ArrayList<Question>();
          questionPool = new HashMap<Integer, ArrayList<Question>>();
          populateQuestions();
     }
    
