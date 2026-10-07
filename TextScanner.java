public class TextScanner
{
    Abstract obj;
    public TextScanner(Abstract obj)
    {
        this.obj=obj;
    }
    void scan()
    {
        obj.onText("Scanner ");
    } 
}