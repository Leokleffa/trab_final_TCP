package actions;


import org.jfugue.player.*;
import org.jfugue.pattern.Pattern;

public class Play {

    Player tocaMusica = new Player();
    Pattern pattern = new Pattern();*/

    
    /*tem que por o texto todo do painel numa string
    e fazer a função para retornar essa string para poder 
    ir andando nela caracter por caracter*/
    
    String textPainel;
    
    textPainel = getTextPainelEditor();
    int i = 0;

    while(textPainel(i) =! null  || getStatusBottonPause() == false )
    {
        switch (textPainel(i)) {
            case '+':           //aumentar o volume
                setVolume(getVolume * 2);

                break;
            case '-':           //volta pro volume dafault
                setVolumeDefault();

                break;
            case 'O'://se for nota anterior for de A a G, repete a nota 
                //para esse if, poderia colocar tudo em uma classe com for para passar pelas notas. Dia ficaria if(textPainel =! getacordes())...
                if (textPainel(i - 1) == 'A' || textPainel(i - 1) == 'B' || textPainel(i - 1) == 'C' || textPainel(i - 1) == 'D' || textPainel(i - 1) == 'E' || textPainel(i - 1) == 'F' || textPainel(i - 1) == 'G') 
                    {
                        tocaMusica(textPainel());
                    
                    }
                else //se nao, toca um telefone(125)
                    {
                         playTelefon();
                    }

                break;
            case 'I':
                if (textPainel(i - 1) == 'A' || textPainel(i - 1) == 'B' || textPainel(i - 1) == 'C' || textPainel(i - 1) == 'D' || textPainel(i - 1) == 'E' || textPainel(i - 1) == 'F' || textPainel(i - 1) == 'G') 
                {
                    tocaMusica(textPainel());
                    
                }
                else //se nao, toca um telefone(125)
                {
                      playTelefon();
                }

                break;
            case 'R':
                if (textPainel(i + 1) == '+') //se for sinal depais+, aumenta uma oitava
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

                    setBPM80();

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
