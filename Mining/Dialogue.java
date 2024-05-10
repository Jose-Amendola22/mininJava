package Mining;

public class Dialogue {
    public boolean isFinished;
    String[] dialogos = {" Haz clic uwu", "Hola", "Mundo", "Esto", "Es", "Un", "Array", "De", "Strings"};
    int index = 0;


    public Dialogue()
    {
        this.isFinished = false;
    }


    public String passDialogue()
    {
        if (index >= dialogos.length-1)
        {
            isFinished= true;
        }

        if(isFinished)
        {
            return dialogos[dialogos.length-1];
        }else
        {
            index++;
            return dialogos[index];
        }

    }

    
}
