class Cricket extends Games
{
void doBowling()
{
 System.out.println("doBowling()");
 }
void doBatting()
{
 System.out.println("doBatting()");
 }
 @Override
void getEntertain()
{
System.out.println("getEntertain() in ground");
}
@Override
void playingGame()
{
System.out.println("playing Cricket");
}
}