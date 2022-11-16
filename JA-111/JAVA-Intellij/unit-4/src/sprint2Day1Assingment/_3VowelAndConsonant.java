package sprint2Day1Assingment;

public class _3VowelAndConsonant {
    public static void main(String[] args) {
        _3VowelAndConsonant accessNonStatic = new _3VowelAndConsonant();

        accessNonStatic.checkAlpha('o');
        accessNonStatic.checkAlpha('Z');
        accessNonStatic.checkAlpha('8');
    }


    public  void checkAlpha(char alpha){


        if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u'||alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U'){
            System.out.println("Vowel");
        }else if(alpha=='b'||alpha=='c'||alpha=='d'||alpha=='f'||alpha=='g'||alpha=='h'||alpha=='j'||alpha=='k'||alpha=='l'||alpha=='m'||
                alpha=='n'||alpha=='p'||alpha=='q'||alpha=='r'||alpha=='s'||alpha=='t'||alpha=='v'||alpha=='w'||alpha=='x'||alpha=='y'||alpha=='z'||
                alpha=='B'||alpha=='C'||alpha=='D'||alpha=='F'||alpha=='G'||alpha=='H'||alpha=='J'||alpha=='K'||alpha=='L'||alpha=='M'||
                alpha=='N'||alpha=='P'||alpha=='Q'||alpha=='R'||alpha=='S'||alpha=='T'||alpha=='V'||alpha=='W'||alpha=='X'||alpha=='Y'||alpha=='Z'){

            System.out.println("Consonant");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
