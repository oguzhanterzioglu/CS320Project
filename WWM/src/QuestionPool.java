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
    //level 3
          Question q7 = new Question("Cumhuriyet altını kaç ayardır?", new String[] {
                    "16",
                    "18",
                    "22",
                    "24"
                    }, 2);
          Question q8 = new Question("İleri yaşlarda görülen mutluluk için kullanılan tabir hangisidir?", new String[] {
          "Yolun yarısı",
          "Aile saadeti",
          "Yaşlılık",
          "İkinci Bahar"
          }, 3);    
          Question q9 = new Question("Türkiye'nin 5. cumhurbaşkanı kimdir?", new String[] {
                    "Cevdet Sunay",
                    "İsmet İnönü",
                    "Cemal Gürsel",
                    "Celal Bayar"
                    }, 0);
         

          questionPool.get(2).add(q7);
          questionPool.get(2).add(q8);
          questionPool.get(2).add(q9);
         
          //level 4
          Question q10 = new Question("Çay toplanırken hangi renktir?", new String[] {
          "Mavi",
          "Yeşil",
          "Kahverengi",
          "Sarı"
          }, 1);
          Question q11 = new Question("Ağrı Dağı'nın Ağrı ili dışında hangi ilde sınırı vardır?", new String[] {
          "Van",
          "Artvin",
          "Burdur",
          "Iğdır"
          }, 3);
          Question q12 = new Question("Kesmece Bunlar deyimi hangi meyve türü için kullanılır?", new String[] {
          "Elma",
          "Üzüm",
          "Karpuz",
          "Kavun"
          }, 2);
         

          questionPool.get(3).add(q10);
          questionPool.get(3).add(q11);
          questionPool.get(3).add(q12);
