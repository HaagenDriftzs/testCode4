

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class testCode
{
    
    ArrayList<Strings> words = new ArrayList<Strings>();
    
    public Dictionary()
    {
        loadDictionary();
    }

    public void loadDictionary()
    {
        BufferedReader inputStream = null;

        try
        {
            inputStream = new BufferedReader(new FileReader("words.txt"));
            String l;
            while((1 = inputStream.readLine())!=null)
                words.add(l);
        }
        catch(IOException)
        {
            e.printStackTrace();
        }
        finally
        {
            if(inputStream != null)
            {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}