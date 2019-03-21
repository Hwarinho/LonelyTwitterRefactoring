package ca.ualberta.cs.changedPackageName;

import java.io.Serializable;

public class ImportantTweet extends Tweet implements Serializable {

    @Override
    public boolean ChangedMethodName(){
        if (getTweetBody().trim().length()==0
            || getTweetBody().trim().length()>20){
            return false;
        }
        return false;
    }
}
