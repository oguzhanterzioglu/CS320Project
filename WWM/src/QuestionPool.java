public class QuestionPool {

     public ArrayList<Question> questions;
     public HashMap<Integer, ArrayList<Question>> questionPool;
    
     public QuestionPool() {
         
          questions = new ArrayList<Question>();
          questionPool = new HashMap<Integer, ArrayList<Question>>();
          populateQuestions();
     }
     public void addQuestion(Question q) {
         
          questions.add(q);
     }
    
     public Question getQuestion(int index) {
          if (questionPool.get(index) != null) {
               Random random = new Random();
               ArrayList<Question> list = questionPool.get(index);
               return list.get(random.nextInt(list.size()));
          }
         
          return null;
     }
    
     public void populateQuestions(){
          for (int i = 0; i < 12; i++) {
               questionPool.put(i, new ArrayList<Question>());
          }
    
    
