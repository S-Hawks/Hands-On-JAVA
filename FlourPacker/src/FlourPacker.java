
public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(bigCount * 5 + smallCount < goal){
            return false;
        }
        if( smallCount >= goal%5){
            return true;
        }
        for(int i = (bigCount * 5); i != 0; i -= 5){
            if(i == goal){
                return true;
            }
            for(int j = smallCount; j != 0; j--){
                if(i + j == goal){
                    return true;
                }
            }
        }
        return false;
    }
}