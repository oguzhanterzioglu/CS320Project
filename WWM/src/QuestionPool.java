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
      //level 5
          Question q13 = new Question("Sol anahtarı hangi mesleği yapan kişilerin kullandığı bir terimdir?", new String[] {
          "Çilingir",
          "Marangoz",
          "Tamirci",
          "Müzisyen"
          }, 3);
          Question q14 = new Question("2005 yılında Türk lirasından kaç sıfır atılmıştır?", new String[] {
                    "3",
                    "4",
                    "5",
                    "6"
                    }, 3);
          Question q15 = new Question("Türkiye Büyük Millet Meclisi başka hangi adla anılır?", new String[] {
                    "Danıştay",
                    "Baro",
                    "Parlamento",
                    "Yüce Divan"
                    }, 2);
         

          questionPool.get(4).add(q13);
          questionPool.get(4).add(q14);
          questionPool.get(4).add(q15);
         
          //level 6
          Question q16 = new Question("Filistin halkının israil işgaline karşı başlattığı harekete verilen ad?", new String[] {
                    "Partizan",
                    "Arap Baharı",
                    "Pasif Direniş",
                    "İntifada"
                    }, 3);
          Question q17 = new Question("Aşçılarıyla ünlü ilçe hangisidir?", new String[] {
                    "Susurluk",
                    "Mengen",
                    "Safranbolu",
                    "Hereke"
                    }, 1);
          Question q18 = new Question("Hamaset ne demektir", new String[] {
                    "Kahramanlık",
                    "Umutsuzluk",
                    "Düşmanlık",
                    "Kıskançlık"
                    }, 0);
         

          questionPool.get(5).add(q16);
          questionPool.get(5).add(q17);
          questionPool.get(5).add(q18);
      //level 7
          Question q19 = new Question("Türkiye’de Nisan 1993’te internet ilk olarak nerede kullanılmaya başlanmıştır?", new String[] {
                    "ODTÜ",
                    "MİT",
                    "Boğaziçi Üniversitesi",
                    "Tübitak"
                    }, 0);
          Question q20 = new Question("Taliban'ın kelime anlamı nedir?", new String[] {
                    "Savaşçılar",
                    "Düşmanlar",
                    "Yolcular",
                    "Öğrenciler"
                    }, 3);
          Question q21 = new Question("Akıl oyunları filminde anlatılan Nobel ödüllü matematikçi kimdir?", new String[] {
                    "Srinivasa Ramanujan",
                    "Henri Poincaré",
                    "John Nash",
                    "Carl Friedrich Gauss"
                    }, 2);
         

          questionPool.get(6).add(q19);
          questionPool.get(6).add(q20);
          questionPool.get(6).add(q21);
         
          //level 8
          Question q22 = new Question("“bugün gelmedi ama yarın mutlaka gelecek” hangi kitabın ünlü cümlesidir?", new String[] {
                    "Büyük Umutlar",
                    "Sevgili",
                    "Yüzyıllık Yalnızlık",
                    "Godot'u Beklerken"
                    }, 3);
          Question q23 = new Question("Kökeni yunanca olan “kozmopolit” kelimesinin anlamı nedir?", new String[] {
                    "Kalabalık bölge",
                    "Evrenin Şehri",
                    "Dünya vatandaşı",
                    "Dünya Irkları"
                    }, 2);
          Question q24 = new Question("Amin maalouf’un semerkant kitabında kimin hayat hikayesi anlatılmaktadır?", new String[] {
                    "Ömer Hayyam",
                    "Cengiz Han",
                    "Arşimed",
                    "İbn-i Sina"
                    }, 0);
         

          questionPool.get(7).add(q22);
          questionPool.get(7).add(q23);
          questionPool.get(7).add(q24);
         

          //level 9
          Question q25 = new Question("Nobel ödülünden kazandığı parayla, eski karısına nafaka ödeyen bilim adamı kimdir? ", new String[] {
                    "Ivan Pavlov",
                    "Albert Einstein",
                    "Alexander Fleming",
                    "Pierre Curie"
                    }, 1);
          Question q26 = new Question("Rıfat Ilgaz, “hababam sınıfı” karakterlerinden hangisinde kendisini anlatmıştır?", new String[] {
                    "Güdük Necmi",
                    "Tulum Hayri",
                    "Damat Ferit",
                    "Mahmut Hoca"
                    }, 0);
          Question q27 = new Question("Yunanca ecclesia kelimesinden türeyen kilise sözcüğünün anlamı hangisidir?", new String[] {
                    "Yakarmak",
                    "Beklemek",
                    "Toplamak",
                    "Korunmak"
                    }, 2);
         

          questionPool.get(8).add(q25);
          questionPool.get(8).add(q26);
          questionPool.get(8).add(q27);
         
          //level 10
          Question q28 = new Question("Antik ve orta çağ yüksek eğitiminin temeli olan 7 özgür sanattan biri hangisidir?", new String[] {
                    "Gökbilim",
                    "Politika",
                    "Anatomi",
                    "Aşçılık"
                    }, 0);
          Question q29 = new Question("Güneş sistemi'nin dışına fırlatılan 'voyager' ile uzaylılara gönderilen türkçe mesaj nedir ?", new String[] {
                    "Sabah şerifleriniz hayrolsun",
                    "Merhaba komşu",
                    "Zaman bizi bir araya getirsin",
                    "Dünyada barış kainatta barış"
                    }, 0);
          Question q30 = new Question("1946'da louis reard'ın yarattığı moda dünyasında devrim yaratan giysi nedir? ", new String[] {
                    "Döpiyes",
                    "Külotlu çorap",
                    "Bikini",
                    "Mini etek"
                    }, 2);
         

          questionPool.get(9).add(q28);
          questionPool.get(9).add(q29);
          questionPool.get(9).add(q30);
         
          //level 11
          Question q31 = new Question("Türkiye’de, kıtlık nedeniyle, 1942 yılında hangisinin imalatı yasaklanmıştır? ", new String[] {
                    "Ekmek",
                    "Köfte",
                    "Pasta",
                    "Bira"
                    }, 2);
          Question q32 = new Question("Eski yunancada 'Süt' anlamına gelen sözcükten türeyen astronomi terimi hangisidir?", new String[] {
                    "asteroit",
                    "zodyak",
                    "plazma",
                    "galaksi"
                    }, 3);
          Question q33 = new Question("nasa'nın, ekim 1995 tarihinde, uzayda yetiştirmeyi başardığı ilk bitki hangisidir?", new String[] {
                    "Şeker Pancarı",
                    "Patates",
                    "Bezelye",
                    "Çilek"
                    }, 1);
         

          questionPool.get(10).add(q31);
          questionPool.get(10).add(q32);
          questionPool.get(10).add(q33);
         
          //level 12
          Question q34 = new Question("Dünya'da gece aydınlatılan ilk cadde nerededir?", new String[] {
                    "İstanbul",
                    "Roma",
                    "Kudüs",
                    "Antakya"
                    }, 3);
          Question q35 = new Question("'Tüm insanlar, doğaları gereği bilmeyi arzular' sözü kime aittir? ", new String[] {
                    "Hz. Ali",
                    "Aristo",
                    "Stephen Hawking",
                    "Vladimir Lenin"
                    }, 1);
          Question q36 = new Question("'Ben Marksist değilim' sözü kime aittir?", new String[] {
                    "Charles Darwin",
                    "Mihail Gorbaçov",
                    "Charlie Chaplin",
                    "Karl Marx"
                    }, 3);
         

          questionPool.get(11).add(q34);
          questionPool.get(11).add(q35);
          questionPool.get(11).add(q36);
     }
}
