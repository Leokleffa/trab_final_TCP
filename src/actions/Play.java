/*Bom, o que eu pensei para a implementação do play foi receber a string do editor de texto
e percorrer caracter por caracter para analisar as exeções. A principio penso que funcina essa logica,
mas tem que pensar nas exeçoes. 

O QUE FALTA FAZER
-- SELECIONAR ALEATORIAMENTE UM INSTRUMENTO(ACHO QUE FAZ UM VETOR COM VARIOS E CRIA UM METODO DE SELECIONAR ELES)
-- MMETODO PARA SETAR ALEATORIAMENTE UM BPM
-- METODO PARA TOCAR: a PRINCIPIO E SO FAZER UM PLAYER.PLAY(Texto), mas tem que tocar so uma nota. talvez tenha execeços, por que tem 
coisas que a Jfugue so entende se for um conjunto de caracteres.
-- CONSEGUIR PEGAR O TEXTO DO PAINEL: acho que é erro de sintaxe, mas nao consegui fazer pegar, nao entendi o meu erro.
-- ARRUMAR ALGUNS ERROS: e mais o chamamento de funções que por algum motivo da erro, acho que é so sintaxe o erro.
-- PENSAR NAS EXCEÇOES: deixei apontado algumas exceçoes que talvez tenha

vou deixar comentado tudo, como funciona na jfugue e como pensei pra implementar isso no nosso caso.

Qualquer dúvida, não exite em me chamar.
att, Igor M. Silva ;)

*/


package actions;


import org.jfugue.player.*;
import org.jfugue.pattern.Pattern;
import gui.components.EditorText;

public class Play {

    Player tocaMusica = new Player();
    Pattern pattern = new Pattern();
    String Telphone ="I[TELEPHONE_RING] ";
    int novoVol;
    String VolDefault;
    int caracterAnt;
    String moreBPM;
    String textPainel;
    int oitava=5; //por padrao, a Jfugue usa a oitava no 5. Ela vai de 0 a 10
    int i = 0;//variavel para saber a posição da string
     
    //aqui pega o texto do painel e passa para uma string
    ////NAO SEI PORQUE DA ERRO, ACHO QUE É SINTAXO
   textPainel = getTextEditorPane();
  
   
   //metedo para deixar o volume setado no default
   public int setVolumeDefautl(int novoVol)
   {
      //como aumenta o volume
                /*Pattern pattern1 = new Pattern(":CE(935, 2000) C A G C C C C C C C C C C C C");
                new Player().play(pattern1);
                onde CE é ontroller Event, 935 o codigo para mecher no volume e 2000(de 0 a 16383) é 
                a altura do volume*/
       int volDefault = 2000;
       novoVol = volDefault;
       
      return novoVol;
   
   }
   
   //metodo para dobrar o volume
   public String setDoubleVol(int novoVol, String textPainel)
   {
       String cabecalhoVol=":CE(935,";//como precissa concatenar isso com a string TextPainel, temos que ter esse cabeçalho padrao pronto
       String fechaParentes =") ";//tem que tem espaço depois do parenteses pq a Jfugue nao reconhece o aumento do volume
       String volumeNovo;
       
       novoVol = novoVol * 2; //dobra o valor do volume. TRATAR EXCEÇÃO, CASO PASSE DO VALOR 16383, DEVE VOLTAR PRA O PADRAO
       
       volumeNovo = Integer.toString(novoVol); //converte inteiro para string
       
       String volume = cabecalhoVol.concat(volumeNovo.concat(fechaParentes));//saida: "CE(935, volumeNovo) "
        
       return textPainel = volume.concat(textPainel);// saida esperada: "CE(935, volumeNovo) resto da string do textpainel"
       //talvez tenha que pensar em exceçoes, tipo como, se vai funcionar caso faça essa modificação no meio da string
       //acho que funciona, mas não tenho certeza
   }
   
   //setando o volume default
    novoVol = setVolumeDefautl(novoVol);
    
    //metodo para saber se o caracter anterior era igual a um dos acordes
    public Boolean getAcordeIgual(String textPainel, int caracterAnt)
    {
        int k;//não usar i, pq ja vai estar sendo usado para percorrer o texto
        char temp;
        String acordes ="ABCDEFG";
        temp = textPainel.charAt(caracterAnt);
        
        //o for percorre a string dos acordes e compara com o caracter anterior do textPainel
        for(k=0; k<7; k++ )
        {
            if( temp == acordes.charAt(k))
                return true;           
        }
        return false;
    }
    
    //metodo para setar um BPM default
    private String defaultBPM(String moreBPM)
    {
        //exemplo de toque de BPM
                   // player.play("T320 A A A A T160  D E F G A B T240  D E F G A B");
        String normalBPM = "70";
        moreBPM = normalBPM; /*passo para essa string pq é ela que vamos manipular depois
                             - sim, poderia ter nome melhor, mas nao sei qual
                             */
        
        return moreBPM;
    }
    
    moreBPM = defaultBPM(moreBPM);
    
    public String setMoreBPM80(String moreBPM)
    { 
        int newBPM = Integer.parseInt(moreBPM);//trasnforma a string para inteiro 
       
        newBPM = newBPM + 80;
        moreBPM = Integer.toString(newBPM);//transforma inteiro para string
        moreBPM = "T".concat(moreBPM);//saida esperada: "TmoreBPM(em numero)"
        
        return moreBPM;
    }
    
    
    public String setNewInstrument(String textPainel)
    {
        String newInstrument = "I[SOUNDTRACK] ";// pensei nesse instrumento para tocar, fica parecendo musica de video game
        
        textPainel = newInstrument.concat(textPainel);
        
        return textPainel;
    }
    
    //metodo para aumnetar uma oitava
    public String setOitavaPlus(int oitava)
    {
        String oitavaString;
        //como vai de 0 a 10 as oitavas na Jfugue, quando chegar no 10, tem que recomeçar do 0
        if(oitava<10)
            oitava = oitava + 1;
        else if(oitava==10)
            oitava=0;
            
        oitavaString = Integer.toString(oitava);
       
        return oitavaString;
    }
   
    public String setOitavaLess(int oitava)
    {
        String oitavaString;
        
        if(oitava>0)
            oitava = oitava - 1;
        else if(oitava==0)
            oitava = 10;
        
        oitavaString = Integer.toString(oitava);
       
        return oitavaString;
    }
    
    //aqui fica num loop ate chegar no fim da string ou ativarem o botao pause(NAO SEI SE VAMOS IMPLEMENTAR O PAUSE)
    while(textPainel.charAt(i) =! null  || getStatusBottonPause() == false )
    {
        //caso o caracter atual for tal... faça...
        switch (textPainel.charAt(i)) //i é a posição do caracter do texto do painel
        {
            case '+':           //aumentar o volume            
                setDoubleVol(novoVol, textPainel);

                break;
                
            case '-':           //volta pro volume dafault
                 
                novoVol = setVolumeDefautl(novoVol);
                VolDefault = Integer.toString(novoVol);
                VolDefault = "CE(935,".concat(VolDefault);
                VolDefault = VolDefault.concat(") ");
                textPainel =  VolDefault.concat(textPainel);

                break;
                
            case 'O'://se for nota anterior for de A a G, repete a nota 
              
                caracterAnt = i-1;
                if(getAcordeIgual(textPainel, caracterAnt))
                {
                        tocaMusica(textPainel.charAt(i));
                    
                }
                else //se nao, toca um telefone
                    {
                        //basicamente concatenar I[TELEPHONE_RING] com a string do texto. Exemplo:
                        //player.play("I[TELEPHONE_RING] A A A A a a a a D E F G A B");
                        
                        textPainel = Telphone.concat(textPainel);//aqui concatena o telefone no inicio da string
                        //outro metodo de concatenar
                       // textPainel = Telphone + textPainel;
                    }

                break;
                
            case 'I'://se for nota anterior for de A a G, repete a nota 
                
                caracterAnt = i-1; 
                if(getAcordeIgual(textPainel, caracterAnt)) 
                {
                    tocaMusica(textPainel.charAt(i));                    
                }
                else //se nao, toca um telefone
                {
                    textPainel= Telphone.concat(textPainel);
                }

                break;
                
            case 'U'://se for nota anterior for de A a G, repete a nota 
                 
                caracterAnt = i-1;
                if(getAcordeIgual(textPainel, caracterAnt)) 
                {
                    tocaMusica(textPainel.charAt(i));                    
                }
                else //se nao, toca um telefone
                {
                    textPainel= Telphone.concat(textPainel);
                }

                break;
                
            case 'R':
                if (textPainel.charAt(i+1) == '+') //se for sinal de +, aumenta uma oitava
                {
                    textPainel = textPainel.concat(setOitavaPlus(oitava)) ;

                } 
                else if (textPainel.charAt(i+1) == '-') //se for sinal de -, diminui uma oitava
                {
                    textPainel = textPainel.concat(setOitavaLess(oitava)) ;
                }
                break;

            case '?':           //tocar nota aleatoria
                tocaMusica(getRandomNote());
                break;
            
            case '\n':                  //muda para outro instrumento
               textPainel = setNewInstrument(textPainel);

                break;
                
            case 'B'://aumenta o BPM em 80 unidades se tiver escrito "BPM+"
                if (textPainel.charAt(i + 1) == 'P' && textPainel.charAt(i + 2) == 'M' && textPainel.charAt(i + 3) == '+')
                { 
                   //exemplo de toque de BPM
                   // player.play("T320 A A A A T160  D E F G A B T240  D E F G A B");
                    moreBPM = setMoreBPM80(moreBPM);
                    moreBPM = moreBPM.concat(" ");//espaço pq e se não o leitor de musica nao le direito 
                      
                    textPainel = moreBPM.concat(textPainel);                  
                }

                break;
                
            case ';':
                 ///coloca valor aleatorio no BPM
                setRandomBPM();
               
                break;
            default://caso nao seja nenhum caso especifico, toca normalmente
                tocaMusica.play(TextPainel);
                break;
                //depois de tratar os caracteres especial, ele tem que tocar a musica(tocar uma nota somente)
                //aqui que nao sei se tem exceção, pois concatenou varias coisas, pode dar algum erro
                tocaMusica.play(TextPainel);
                i++;//soma para ir para o proximo caracter da string do painel
        }
    }
}
