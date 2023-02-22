package actions;


import org.jfugue.player.*;
import org.jfugue.pattern.Pattern;

public class Play {

    Player tocaMusica = new Player();
    Pattern pattern = new Pattern();

    
    /*tem que por o texto todo do painel numa string
    e fazer a função para retornar essa string para poder 
    ir andando nela caracter por caracter
    */
    String textPainel;
    
   textPainel = getTextPainelEditor();
   int i = 0;
   
   //tem arrumar os nomes dessas variaveis
   public int setVolumeDefautl()
   {
      //como aumenta o volume
                /*Pattern pattern1 = new Pattern(":CE(935, 2000) C C C C C C C C C C C C C C C");
                new Player().play(pattern1);
                onde CE é ontroller Event, 935 o codigo para mecher no volume e 2000(0 a 16383) é 
                a altura do volume*/
       int volDefault = 2000;
       //como nao consegui passar int ou string no lugar do 2000
       //pode-se concatenar :CE(935,  com NovoVol) mais o resante do texto
       //talvez tem que fazer tudo strng e usar int to string
       int novoVol = volDefault;
      return novoVol;
   
   }
   public int setDoubleVol(int novoVol)
   {
       return novoVol = novoVol * 2;
       
   }
   
   //setando o volume default
    setVolumeDefault();
    
    
    private boolen getAcordeIgual(String textPainel(caracterAnt))
    {
        int k;
        String acordes ="ABCDEFG";
        
        for(k=0, k<7, k++ )
        {
            if( textPainel(caracterAnt) == acordes[k])
                return true;           
        }
        return false;
    }
    
    private String defaultBPM()
    {
        String normalBPM = "70";
        String moreBPM = normalBPM;
        return moreBPM;
    }
    
    defaultBPM();
    
    public String setMoreBPM80(String moreBPM)
    { 
        int newBPM = atoi(moreBPM);//trasnforma a string para inteiro 
        newBPM = newBPM + 80;
        moreBPM = intergerToString(newBPM);
         
         return moreBPM;
        
    }
   
    while(textPainel(i) =! null  || getStatusBottonPause() == false )
    {
        switch (textPainel(i)) //i é a posição do caracter do texto do painel
        {
            case '+':           //aumentar o volume
                //como aumenta o volume
                /*Pattern pattern1 = new Pattern(":CE(935, 2000) C C C C C C C C C C C C C C C");
                new Player().play(pattern1);
                onde CE é ontroller Event, 935 o codigo para mecher no volume e 2000(0 a 16383) é 
                a altura do volume*/
                
                setDoubleVol(vol[Volume]);

                break;
            case '-':           //volta pro volume dafault
                setVolumeDefault();

                break;
            case 'O'://se for nota anterior for de A a G, repete a nota 
                //para esse if, poderia colocar tudo em uma classe com for para passar pelas notas. Dai ficaria if(textPainel =! getacordes())...
              int caracterAnt = i-1;
                //if (textPainel(i - 1) == 'A' || textPainel(i - 1) == 'B' || textPainel(i - 1) == 'C' || textPainel(i - 1) == 'D' || textPainel(i - 1) == 'E' || textPainel(i - 1) == 'F' || textPainel(i - 1) == 'G') 
                if(!getAcordeIgual(textPainel(caracterAnt)))  
                {
                        tocaMusica(textPainel());
                    
                }
                else //se nao, toca um telefone(124)
                    {
                        //basicamente concatenar I[TELEPHONE_RING] com a string do texto. Exemplo:
                        player.play("I[TELEPHONE_RING] A A A A a a a a D E F G A B");
                        playTelephone();//criar um metodo para concatenar;
                    }

                break;
            case 'I':
                //if (textPainel(i - 1) == 'A' || textPainel(i - 1) == 'B' || textPainel(i - 1) == 'C' || textPainel(i - 1) == 'D' || textPainel(i - 1) == 'E' || textPainel(i - 1) == 'F' || textPainel(i - 1) == 'G') 
                 if(!getAcordeIgual(textPainel(caracterAnt))) 
                {
                    tocaMusica(textPainel());
                    
                }
                else //se nao, toca um telefone(124)
                {
                       //basicamente concatenar I[TELEPHONE_RING] com a string do texto. Exemplo:
                        player.play("I[TELEPHONE_RING] A A A A a a a a D E F G A B");
                        playTelephone();//criar um metodo para concatenar;
                }

                break;
            case 'R':
                if (textPainel(i + 1) == '+') //se for sinal de +, aumenta uma oitava
                {
                    setOitavaPlus();

                } 
                else if (textPainel(i + 1) == '-') //se for sinal de -, diminui uma oitava
                {
                    setOitavaLess();
                }
                break;

            case '?':           //tocar nota aleatoria
                tocaMusica(getRandomNote());
                break;
            
            case '\n':                  //muda para outro instrumento
                setNewInstrument();

                break;
            case 'B':
                if (textPainel(i + 1) == 'P' && textPainel(i + 2) == 'M' && textPainel(i + 3) == '+')
                { ///aumenta o BPM em 80 unidades
                    //concatenar BPM(T80) com o texto
                    player.play("T320 A A A A T160  D E F G A B T240  D E F G A B");
                    moreBPM = setMoreBPM80(moreBPM);
                       
                    //aqui concatena mmoreBPM com o textPainel, tem que pesquisar sobre isso
                    
                    
                }

                break;
            case ';':
                 ///coloca valor aleatorio no BPM
                setRandomBPM();
               
                break;
            default://caso nao seja nenhum caso especifico, toca normalmente
                tocaMusica.play(TextPainel);
                break;

                i++;//soma para ir para o proximo caracter da string do painel
        }
    }
}
