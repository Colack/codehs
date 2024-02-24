public class Talker
{
    private String speech;

    public Talker(String startingText)
    {
        speech = startingText;
    }

    public String outdoorVoice()
    {
        return speech.toUpperCase();
    }

    public String indoorVoice()
    {
        return speech.toLowerCase();
    }

    public void setSpeech(String text)
    {
        speech = text;
    }

    public String toString()
    {
        return "\"" + speech + ",\"" + " said the talker";
    }
}