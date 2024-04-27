package Practice2017;

public class String {
    //A
     int pos = findNthOccurence(str, n);
    if( pos!= -1){
        String f = currentPhrase.substring(0, pos);
        String s = currentPhrase.substring (pos + str.length);
        currentPhrase = f + repl + s;}
    ｝
    //B
    int cnt = 1;
    int st = findNthOccurence(str, cnt );
    while(st != -1){
    cnt++;
    int chk = findNthOccurence(str, cnt);
    if(chk == -1) return st;
    st = chk;
    }
    return st;
}
