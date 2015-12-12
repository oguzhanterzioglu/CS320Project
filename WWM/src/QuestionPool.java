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
    uestion q1 = new Question("Tango kaç kişiyle yapılır?", new String[] {
          "2",
          "3",
          "4",
          "5"
          }, 0);
          Question q2 = new Question("Türkiye'de aile cüzdanı hangi renktir?", new String[] {
          "Mavi",
          "Turuncu",
          "Bordo",
          "Yeşil"
          }, 2);
          Question q3 = new Question("Bir deyime göre doğru söyleyeni kaç köyden kovarlar?", new String[] {
          "6",
          "7",
          "8",
          "9"
          }, 3);
         
          questionPool.get(0).add(q1);
          questionPool.get(0).add(q2);
          questionPool.get(0).add(q3);
         
          //level 2
          Question q4 = new Question("Kırmızı gül ne anlama gelir?", new String[] {
          "Seni özledim",
          "Seni seviyorum",
          "Nefret ediyorum",
          "Üzgünüm"
          }, 1);
          Question q5 = new Question("Avatar ve Titanik filmlerinin yönetmeni kimdir?", new String[] {
          "James Cameron",
          "Peter Jackson",
          "Woody Allen",
          "Coppola"
          }, 0);
          Question q6 = new Question("Eski Roma'da gladyatör dövüşlerinin yapıldığı 'arena'nın kelime anlamı nedir?", new String[] {
          "Kavga",
          "Kum",
          "Kan",
          "Kılıç"
          }, 1);    
         

          questionPool.get(1).add(q4);
          questionPool.get(1).add(q5);
          questionPool.get(1).add(q6);
    
